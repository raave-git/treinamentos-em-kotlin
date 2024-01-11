/*Estes são meus primeiros códigos escritos em Kotlin, neles me familiarizo com funções, argumentos e parâmetros na linguagem.*/

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    println(birthdayGreeting("Raavë",22))

    println("\nUse the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

        println("\nNew chat message from a friend")

    var discountPercentage = 0
    val offer: String
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "\nSale - Up to $discountPercentage% discount on $item! Hurry up!"
        println(offer)

    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
        println("\nThe total party size is: $total")

    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
        println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
        println("$firstNumber + $secondNumber = $result")
}