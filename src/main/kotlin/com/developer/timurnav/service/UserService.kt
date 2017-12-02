package com.developer.timurnav.service

import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class UserService {

    private val userMap = HashMap<String, AtomicInteger>()

    fun getCountByName(name: String) = userMap
            .computeIfAbsent(name, { AtomicInteger() })
            .getAndIncrement()

}