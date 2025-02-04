package practica1
fun acuario(){
    val (totalFish, aquariums) = (2.plus(71).plus(233).minus(13)).let { it to it.div(30).plus(if (it % 30 > 0) 1 else 0) }
    println("Total fish: $totalFish, Aquariums needed: $aquariums")

}
fun rainbow(){
    var rainbowColor: String? = null
    var greenColor: String? = null
    var blueColor: String?
        blueColor = null
        println("Rainbow color: $rainbowColor")
        println("Green color: $greenColor")
        println("Blue color: $blueColor")
    }

fun nemolist() {
    val Nemo: List<String?> = listOf(null, null)
    val Dori = listOf<String?>(null, null)
    val ListaNull: List<String>? = null
    var nullTest: Int? = null

    println("Pez Payasos(método 1): $Nemo")
    println("Pez de lo que es Dori (método 2): $Dori")
    println("Cardumen nulo: $ListaNull")
     // Variable nullable asignada a null

    // Usamos el operador Elvis ?: para manejar el caso de null
    val resultado = (nullTest?.plus(1)) ?: 0

    println("Resultado: $resultado")
}
