import kotlin.random.Random

fun main() {
    val dado1 = Dado()
    val dado2 = Dado(1, 3)
    val dado3 = Dado(4, 6)

    var sumDados = 0

    for (i in 1..100){
        var sumTotal = 0
        Jugadores(i)
        for (z in 1..100){
            sumDados = dado1.tirada() + dado2.tirada() + dado3.tirada()
            sumTotal += sumDados
        }
        println("El jugador " + i + " ha sacado " + sumTotal )
    }


}

class Dado (var valorMin: Int = 1, var valorMax: Int = 6) {
    private var numMin = valorMin
    private  var numMax = valorMax
    fun tirada (): Int {
        val num1 = Random.nextInt(numMin, numMax)

        return num1
    }
}


class Jugadores(int: Int){

}
