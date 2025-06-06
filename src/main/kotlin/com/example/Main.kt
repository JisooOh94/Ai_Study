package com.example

import com.example.controller.HelloController
import com.linecorp.armeria.spring.ArmeriaServerConfigurator
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

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