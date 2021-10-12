fun main() {
    println("Hello World!")
    val name = "nasser"
    val number = 7
    val flag = true
    val pi =3.14

    println(name)
    println(number)
    println(flag)
    println(pi)

    println("my name is ${name} and my favoraite number ${number}")

    if(number > 5){

        println("number bigger than 5")

    }
    else {

        println("number less than 5")
    }

   if(number== 7){

       println("number is equale to 7 ")

   }
    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")
}