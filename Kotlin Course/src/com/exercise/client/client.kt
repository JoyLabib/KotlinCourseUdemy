package com.exercise.client

import com.exercise.hello.sayHi

fun getName(){
    println("Please enter your name")
    val name = readLine()?:""
    sayHi(name)
}