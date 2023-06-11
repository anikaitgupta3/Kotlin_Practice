package com.example.kotlin_practice

class Person( ) {
    constructor(name: String,age: Int):this(){
         println("constructor with name and age")    //c1
    }
    constructor(name: String,age: Int,height: Int):this(name,age){
         println("constructor with name,age and height")   //c2
        _height=height
    }
     init{
         println("second init")
     }
    var _height:Int?=null
//    get(){
//        println("Getter called") //we can change the default functionality
//        return field   //by default will return the value of hieght.even if we dont write the get() it will be there and return height inbuilt
//    }
//    set(value){ //value of the height
//       if(value!=null && value>0){
//          field=value
//       }
//        else{
//            println("hieght cannot be -ve")
//       }
//    }
//   init {
//
//        println("init block is called $name $age")
//    }
//        fun printDetails() {
//            println("Name $name Age $age")
//        }
//    fun updatehieght(height:Int){
//        _height=height
//
//    }
//     fun getHeight():Int{
//           return _height?:0   //if null then 0
//     }
}
fun main(){
    val person=Person("Random",20,5) // if we just pass name and age then only c1 will be called not c2
    //person.printDetails()
    //person.updatehieght(5)

    //person._height=-1 //does not update as hieght cannot be -ve
    //println(person._height) //outputs hieght can't be -ve
}