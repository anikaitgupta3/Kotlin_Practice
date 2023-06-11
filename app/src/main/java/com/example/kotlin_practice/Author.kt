package com.example.kotlin_practice

class Author(val authorname:String,val authorage:Int):User(authorname,authorage) {
}
fun main(){
    val author=Author("Random",20)
    println(author.authorname)
}