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
    var calc:Calculator = Calculator()
    val begin=System.nanoTime()
    println(calc.calc_square(100))
    val end=System.nanoTime()
    
    
    
   
   	//Compare with other 
    println("The time elapsed is : ${end-begin} ")
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

class Calculator
{
    
    fun calc_square(a:Int):Int
    {
        //Reduced Complexity Calculation.
        
        var result:Int =0
        for (i in 1..a)
        {
            result+=a
        }
        
        return result
    }
    
    fun calc_square_mult(a:Int):Int
    {
		//Default Complexity. 
    return a*a
    }
}