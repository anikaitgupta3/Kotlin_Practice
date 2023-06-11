package com.example.kotlin_practice

open class User(val name:String,val age:Int) {
    open fun printDetails(){
        println("Name $name Age $age")
    }
}