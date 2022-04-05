//create a variable for testing all condition
 val age = 16
//create a variable for drinkingAge 
 val drinkingAge = 21
//create a variable for votingAge
 val votingAge = 18
//create a variable for drivingAge
 val drivingAge = 16
 
//Assign the if statement to a variable
val currentAge =  if (age >=drinkingAge){
println("Now you may drink in the US")
//return the value for this block
    drinkingAge
 }else if(age >=votingAge){
println("You may vote now")
//return the value for this block
    votingAge
 }else if (age>=drivingAge){
println("You may drive now")
//return the value for this block
    drivingAge
 }else{
println("You are too young")
//return the value for this block
     age
 }
//print the age for the passing condition
print("current age is $currentAge")
fun main(){
    myFunction()
    println(addUp(5,3))
    println(avg(3.2,5.3))
}
 
// The syntax of a function - fun stands for function
fun myFunction(){
    // The body of a function
    println("myFunction was called")
}
 
// This function has two parameters and returns a value of type Int
fun addUp(a: Int, b: Int): Int{
    // the return keyword indicates that this function will return the following value
    // once this function is called and executed
    return (a+b)
}
// Article on Kotlin words https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87
// CHALLENGE: create a function that calculates the average and call it
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}
