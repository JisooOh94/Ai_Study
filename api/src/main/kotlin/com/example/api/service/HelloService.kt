package com.example.api.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getBlockingMessage(): String = "Hello from blocking service!"
}