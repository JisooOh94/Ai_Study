package com.example.service

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service

@Service
class HelloService {
    suspend fun getAsyncMessage(): String {
        delay(1000) // Simulate a delay to demonstrate asynchronous behavior
        return "Hello from HelloService (async)!"
    }

    fun getBlockingMessage(): String = runBlocking {
        delay(1000) // Simulate a delay in a blocking way
        "Hello from HelloService (blocking)!"
    }
}