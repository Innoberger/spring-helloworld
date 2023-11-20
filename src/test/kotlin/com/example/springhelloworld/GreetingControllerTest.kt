package com.example.springhelloworld

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content

@WebMvcTest
class GreetingControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun getGeneralGreeting() {
        mockMvc.perform(get("/greeting/")).andExpect(content().string("Hello World!"))
    }

    @Test
    fun getNamedGreeting() {
        mockMvc.perform(get("/greeting/1234567890")).andExpect(content().string("Hello 1234567890!"))
    }
}