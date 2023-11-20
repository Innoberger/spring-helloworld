package com.example.springhelloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greeting")
class GreetingController {

    @GetMapping("/")
    fun getGeneralGreeting(): String {
        return Greeting().toString()
    }

    @GetMapping("/{name}")
    fun getNamedGreeting(@PathVariable name: String): String {
        return Greeting(name).toString()
    }
}