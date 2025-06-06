package com.example.controller

import com.example.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloController(private val helloService: HelloService) {

    @GetMapping("/")
    fun hello(): String {
        return "hello world"
    }

    @GetMapping("/hello")
    suspend fun asyncHello(): String {
        return helloService.getAsyncMessage()
    }

    @GetMapping("/blocking")
    fun blockingHello(): String {
        return helloService.getBlockingMessage()
    }
}