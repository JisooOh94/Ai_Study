package com.example.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ApiApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<ApiApplication>(*args)
        }
    }
}
