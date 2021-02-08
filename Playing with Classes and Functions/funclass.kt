/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    println("Hello, world!!!")
    println(add_numbers(5,6))
    var new_student:Student = Student()
    new_student.change_name("Ahsan Goheer")
    println(new_student.studentName)
}


fun add_numbers( a:Int , b:Int):Int
{
    return a+b
}

class Student
{
    public var studentName:String =""
    
    
    fun change_name(name:String)
    {
        studentName=name
    }
    

}


