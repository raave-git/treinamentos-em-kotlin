fun main() {
    val passos = 4000
    val caloriasQueimadas = pedometro(passos)

    println("Caminhar $passos passos queima $caloriasQueimadas calorias.")
}

fun pedometro(numPassos: Int): Double {
    val caloriasPorPasso = 0.04
    val totalCalorias = numPassos * caloriasPorPasso
    return totalCalorias
}