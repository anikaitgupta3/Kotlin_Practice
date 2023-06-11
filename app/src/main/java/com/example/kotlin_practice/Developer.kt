package com.example.kotlin_practice

class Developer(val developername:String,val developerage:Int):User(developername,developerage){
    override fun printDetails(){  //will override the method in the user class will print this i/o the original
        super.printDetails() //will call the printDetails method in the parent class.if we want to imp the original method also
        println("Developer details $developername $developerage")
    }
}
fun main(){
    val developer=Developer("Example",20)
    developer.printDetails()
    developer.developername
    developer.developerage
}