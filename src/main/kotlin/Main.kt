import kotlin.math.pow
import kotlin.math.sqrt

fun add(number1:Double, number2:Double):Double{
    return number1 + number2
}
fun sub(number1:Double,number2:Double):Double{
    return number1 - number2
}
fun rem(number1:Double,number2:Double):Double{
    return number1 % number2
}
fun quo(number1:Double,number2:Double):Double{
    return number1 / number2
}
fun pro(number1: Double,number2: Double):Double{
    return number1 * number2
}
fun power(number1: Double,number2: Double):Double{
    return number1.pow(number2)
}
fun squarer(number:Double):Double{
    return sqrt(number)
}


fun main() {
    try {
        println("Enter your operation method: ")
        when(readlnOrNull()){
            "+" -> {
                println("Enter your first number: ")
                val first:String? = readlnOrNull()
                val firstNumber:Double? = first?.toDoubleOrNull()
                if(firstNumber != null) {
                    println("Enter your second number: ")
                    val second: String? = readlnOrNull()
                    val secondNumber: Double? = second?.toDoubleOrNull()
                    if(secondNumber != null){
                        val result:Double = add(firstNumber,secondNumber)
                        println("$firstNumber + $secondNumber = $result")
                    }else{
                        println("Invalid input was given")
                    }
                }else{
                    print("Invalid input was given")
                }
            }
            "-" -> {
                println("Enter your first number: ")
                val first:String? = readlnOrNull()
                val firstNumber: Double? = first?.toDoubleOrNull()
                if(firstNumber != null){
                    println("Enter your second number: ")
                    val second:String? = readlnOrNull()
                    val secondNumber:Double? = second?.toDoubleOrNull()
                    if(secondNumber != null){
                        val result:Double = sub(firstNumber,secondNumber)
                        println("$firstNumber - $secondNumber = $result")
                    }else{
                        println("Invalid input was given")
                    }
                }

                else{
                    println("Invalid input was given")
                }
            }
            "*" -> {
                println("Enter your first number: ")
                val first:String? = readlnOrNull()
                val firstNumber: Double? = first?.toDoubleOrNull()
                if(firstNumber != null){
                    println("Enter your second number: ")
                    val second:String? = readlnOrNull()
                    val secondNumber:Double? = second?.toDoubleOrNull()
                    if(secondNumber != null){
                        val result:Double = pro(firstNumber,secondNumber)
                        println("$firstNumber * $secondNumber = $result")
                    }else{
                        println("Invalid input was given")
                    }
                }

                else{
                    println("Invalid input was given")
                }
            }
            "/" -> {
                println("Enter your first number: ")
                val first:String? = readlnOrNull()
                val firstNumber: Double? = first?.toDoubleOrNull()
                if(firstNumber != null){
                    println("Enter your second number: ")
                    val second: String? = readlnOrNull()
                    val secondNumber: Double? = second?.toDoubleOrNull()
                    if(secondNumber != null){
                        val resultRem = rem(firstNumber,secondNumber)
                        val resultQuo = quo(firstNumber,secondNumber)
                        println("$firstNumber / $secondNumber give $resultQuo as quotient and give $resultRem as remainder.")
                    }else{
                        println("Invalid input was given")
                    }
                }else{
                    println("Invalid input was given")
                }
            }
            "p" -> {
                println("Enter your first number: ")
                val first:String? = readlnOrNull()
                val firstNumber: Double? = first?.toDoubleOrNull()
                if(firstNumber != null){
                    println("Enter your second number: ")
                    val second: String? = readlnOrNull()
                    val secondNumber: Double? = second?.toDoubleOrNull()
                    if(secondNumber != null){
                        val result = power(firstNumber,secondNumber)
                        println("$firstNumber ^ $secondNumber is $result")
                    }else{
                        println("Invalid input was given")
                    }
                }else{
                    println("Invalid input was given")
                }
            }
            "s" -> {
                println("Enter your number: ")
                val first:String? = readlnOrNull()
                val firstNumber: Double? = first?.toDoubleOrNull()
                if(firstNumber != null){
                        val result = squarer(firstNumber)
                        println("Square root of $firstNumber is $result")
                }else{
                    println("Invalid input was given")
                }
            }
            "a" -> {
                println("Enter your first number: ")
                val first:String? = readlnOrNull()
                val firstNumber: Double? = first?.toDoubleOrNull()
                if(firstNumber != null){
                    println("Enter your second number: ")
                    val second: String? = readlnOrNull()
                    val secondNumber: Double? = second?.toDoubleOrNull()
                    if(secondNumber != null){
                        val resultSq = squarer(firstNumber)
                        val resultSq1 = squarer(secondNumber)
                        val resultAdd = add(firstNumber,secondNumber)
                        val resultSub = sub(firstNumber,secondNumber)
                        val resultRem = rem(firstNumber,secondNumber)
                        val resultQuo = quo(firstNumber,secondNumber)
                        val resultPro = pro(firstNumber,secondNumber)
                        val resultPow = power(firstNumber,secondNumber)
                        println("$firstNumber + $secondNumber = $resultAdd\n$firstNumber - $secondNumber = $resultSub\n$firstNumber * $secondNumber = $resultPro\n$firstNumber / $secondNumber give $resultQuo as quotient and $resultRem as remainder\n$firstNumber ^ $secondNumber = $resultPow\nSquare root of $firstNumber is $resultSq\nSquare root of $secondNumber is $resultSq1\n")

                    }else{
                        println("Invalid input was given")
                    }
                }else{
                    println("Invalid input was given")
                }
            }
            else -> {
                println("Please provide a valid operation method")
            }
        }
    }catch (e:Exception){
        println("Invalid input were given. Error: $e")
    }
}