/*Etapa: O código funciona, mas a lógica para adicionar dois números está localizada na variável resultante, tornando o código menos flexível à reutilização. Em vez disso, é possível extrair a operação de adição para uma função add() para que o código seja reutilizável. Para fazer isso, atualize o código para que fique como o mostrado abaixo. O código agora introduz uma nova variável val chamada thirdNumber e mostra o resultado dessa nova variável com firstNumber.
*
* Você pode definir a função add() para que o programa gere essa saída?
*
* Agora você tem uma função reutilizável para adicionar dois números.

É possível implementar a função subtract() da mesma forma que a função add()? Modifique a função main() também para usar a função subtract() para verificar se ela funciona como esperado.*/
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    println(add(firstNumber, secondNumber))
    println(add(firstNumber, thirdNumber))

    println(subtract(firstNumber, secondNumber))
    println(subtract(firstNumber, thirdNumber))
}

fun add(x: Int, y: Int): String {
    val result = x + y
    return "$x + $y = $result"
}

fun subtract(x: Int, y: Int): String {
    val result = x - y
    return "$x - $y = $result"
}