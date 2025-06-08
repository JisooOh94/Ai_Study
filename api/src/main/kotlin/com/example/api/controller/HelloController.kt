package com.example.api.controller

import com.example.api.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello")
    fun hello(): String {
        return helloService.getBlockingMessage()
    }
}
