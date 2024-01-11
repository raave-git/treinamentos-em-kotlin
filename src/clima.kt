fun clima(cidade: String, minTemp: Int, maxTemp: Int, chanceDeChuva: Int): String {

    return "Localização: $cidade. \nMínima: $minTemp ºC. Máxima: $maxTemp ºC. \nChance de chuva: $chanceDeChuva%.\n"
}
fun main() {
    /*println("Localização: Ankara")
    println("Mínima: 27, Máxima: 31")
    println("Chance de chuva: 82%")
    println()

    println("Localização: Tokyo")
    println("Mínima: 32, Máxima: 36")
    println("Chance de chuva: 10%")
    println()

    println("Localização: Cape Town")
    println("Mínima: 59, Máxima: 64")
    println("Chance de chuva: 2%")
    println()

    println("Localização: Guatemala City")
    println("Mínima: 50, Máxima: 55")
    println("Chance de chuva: 7%")*/

    println(clima("Ancara, Túrquia", -2,0,82))
    println(clima("Tóquio, Japão",0,2,10))
    println(clima("Cidade do Cabo, África do Sul",15,17,2))
    println(clima("Cidade da Guatemala, Guatemala",10,12,7))
}