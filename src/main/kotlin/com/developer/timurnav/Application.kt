package com.developer.timurnav

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Component

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

@Component
open class PreStartExecutor : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Let's get started")
    }
}