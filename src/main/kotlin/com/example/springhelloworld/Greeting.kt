package com.example.springhelloworld

data class Greeting(val name: String = "World") {
    override fun toString(): String {
        return "Hello ${name}!"
    }
}