/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 * @author Jingxuan Tang
 */

fun main(args: Array<String>) {
    // Declare the following constants and variables and set their initial values as indicated
    var sample1: Byte = 0x3A
    var sample2: Byte = 58
    var heartRate: Int = 85
	var deposits = 135002796.00
    val acceleration = 9.800f
    var mass = 14.6f
    var distance = 129.763001
    var lost = true
    var expensive = true
    var choice = 2
    val integral = "\u222B"
    val greeting = "Hello"
    var name = "Karen"

    // Compare sample1 to sample2
	if(sample1 == sample2){
        println("The samples are equal.")
    }
    else{
        println("The samples are not equal.")
    }
    
    // HeartRate 
    if(heartRate>=40 && heartRate <= 80){
        println("Heart rate is normal.")
    }
    else{
        println("Heart rate is not normal.")
    }
    
    // Deposits 
	if(deposits >=100000000){
        println("You are exceedingly wealthy.")
    }
    else{
        println("Sorry you are so poor.")
    }
    
    // Declare a variable called force that is assigned to the mass times the acceleration
    var force = mass * acceleration
    println("force = $force")
    
    // Display the value of distance followed by “ is the distance.”
    println("$distance is the distance")
    
    // Using lost and expensive
    if (lost && expensive) {
        println("I am really sorry! I will get the manager.")
    }
    if (lost && !expensive) {
        println("Here is coupon for 10% off.")
    }
    
    // Use the Kotlin “when” expression
    when (choice) {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> {
            println("You made an unknown choice.")
        }
    }
    
    // Using the character constant integral
    println("${integral} is an integral.")
    
    // Using a “for” loop count from 5 to 10
    for(i in 5..10) {
        println("i = $i")
    }
    
    // Declare an integer variable age with an initial value of 0
    var age = 0
    while(age < 6) {
        println("age = $age")
    	age++
    }
    
    // Display a line that contains the greeting string followed by a space followed by the name string
    println("$greeting, $name")
        
}
