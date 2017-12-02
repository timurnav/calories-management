package com.developer.timurnav.web

import com.developer.timurnav.domain.Greeting
import com.developer.timurnav.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

const val DEFAULT_VALUE = "World"

@RestController
class GreetingController {

    private val counter = AtomicInteger()

    @Autowired
    lateinit private var userService: UserService

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = DEFAULT_VALUE) name: String): Greeting {
        val counter =
                if (name == DEFAULT_VALUE) counter.incrementAndGet()
                else userService.getCountByName(name)

        return Greeting(counter, "Hello, $name")
    }


}