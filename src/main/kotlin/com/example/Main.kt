package com.example

import com.linecorp.armeria.server.Server
import com.linecorp.armeria.spring.ArmeriaServerConfigurator
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.io.*
import java.security.MessageDigest
import java.util.Base64

@SpringBootApplication
class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<Main>(*args)
        }
    }

    @Bean
    fun armeriaServerConfigurator(helloController: HelloController): ArmeriaServerConfigurator {
        return ArmeriaServerConfigurator { builder ->
            builder.annotatedService(helloController)
        }
    }
}