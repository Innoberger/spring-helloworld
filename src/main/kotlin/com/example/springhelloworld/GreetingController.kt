package com.example.springhelloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.function.ServerResponse

@RestController
@RequestMapping("/helloworld")
class HelloWorldController {

    @GetMapping("/")
    fun getGeneralGreeting(): Greeting {
        return Greeting();
    }

    @GetMapping("/{name}")
    fun getNamedGreeting(@PathVariable name: String): Greeting {
        return Greeting(name);
    }
}