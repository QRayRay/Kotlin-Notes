class Person constructor(_firstName: String, _lastName: String) { // or class Person constructor    (_firstName: String, _lastName: String) 
    // Member Variables (Properties) of the class
    var firstName: String
    var lastName: String
 
    // Initializer Block
    init {
        this.firstName = _firstName
        this.lastName = _lastName
 
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

al result = html {                                            // 1
    head {                                                     // 2
        title { +"HTML encoding with Kotlin" }
    }
    body {                                                     // 2
        h1 { +"HTML encoding with Kotlin" }
        p {
            +"this format can be used as an"                   // 3
            +"alternative markup to HTML"                      // 3
        }

        // an element with attributes and text content
        a(href = "http://kotlinlang.org") { +"Kotlin" }

        // mixed content
        p {
            +"This is some"
            b { +"mixed" }
            +"text. For more see the"
            a(href = "http://kotlinlang.org") {
                +"Kotlin"
            }
            +"project"
        }
        p {
            +"some text"
            ul {
                for (i in 1..5)
                li { +"${i}*2 = ${i*2}" }
            }
        }
    }
}

fun main(){
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.212312)
    myArrayList.add(23.151232)
    myArrayList.add(32.651553)
    myArrayList.add(16.223817)
    myArrayList.add(18.523999)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("Avarage is " + average)
}
 
// create an object like so:
// val denis = Person("Denis", "Panjuta")
 
// Alternatively:
class Person (_firstName: String, _lastName: String) {
    // Member Variables (Properties) of the class
    var firstName: String = _firstName
    var lastName: String = _lastName
 
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}
 
// Alternatively:
class Person(var firstName: String, var lastName: String) {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}
 
// Or even:
// whereby John and Doe will be default values 
class Person(var firstName: String = "John", var lastName: String= "Doe") {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}
 
// Create an object:
/*
    val john = Person()
    val johnPeterson = Person(lastname: "Peterson")
 
*/
 
class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var myFirstName = firstName
 
    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }
 
    fun stateHobby(){
        println("$firstname \'s Hobby is: $hobby'" )
    }
}
 
// You can use primary or secondary Constructor to create an object
 
// Calls the primary constructor (Age will be null in this case)
val person1 = Person("Denis", "Panjuta")
 
// Calls the secondary constructor
val person2 = Person("Elon", "Musk", 48) 
 
 
 
// Having multiple overloads:
 
class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var eyeColor: String? = null
    
    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }
 
    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int, eyeColor: String): 
            this(firstName, lastName, age)  {
        this.eyeColor = eyeColor
    }
}
 
 
// SETTERS AND GETTERS
 
// User class with a Primary constructor that accepts
// three parameters
class Car(_brand: String, _model: String, _maxSpeed: Int) {
    // Properties of User class
    val brand: String = _brand         // Immutable (Read only)
    var model: String = _model  // Mutable
    var maxSpeed: Int = _maxSpeed       // Mutable
}
 
// Kotlin internally generates a default getter and setter for mutable properties, and a getter (only) for read-only properties.
 
It calls these getters and setters internally whenever 
// you access or modify a property using the dot(.) notation.
This is how it would look like internally
class Car(_brand: String, _model: String, _maxSpeed: Int) {
    val brand: String = _brand
        get() = field
    
    var model: String = _model
        get() = field
        set(value) {
            field = value
        }
    
    var maxSpeed: Int = _maxSpeed
        get() = field
        set(value) {
            field = value
        }
}
 
// value
// We use value as the name of the setter parameter. This is the default convention in Kotlin but you???re free to use any other name if you want.
// The value parameter contains the value that a property is assigned to. For example, when you write user.name = "Elon Musk", 
// the value parameter contains the assigned value "Elon Musk".
 
// 2. Backing Field (field)
// Backing field helps you refer to the property 
// inside the getter and setter methods. 
// This is required because if you use the property 
// directly inside the getter or setter then you???ll
// run into a recursive call which will generate 
// a StackOverflowError.
 
 
class Car() {
 
    lateinit var owner : String
 
    val myBrand: String = "BMW"
    // Custom getter
    get() {     
        return field.toLowerCase()
    }   
    
    
    // default setter and getter
    var myModel: String = "M5"
        private set
 
    var myMaxSpeed: Int = maxSpeed
        get() = field
        // Custom Setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
    }
 
    init{
        this.myModel = "M3"
        this.owner = "Frank"
    }
}

open class Polygon {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : Polygon() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}
