package com.example.springhelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringHelloworldApplication

fun main(args: Array<String>) {
    runApplication<SpringHelloworldApplication>(*args)
}
