package Practica2

fun comerpeces() {
    val tilapia = "tilapia"
    val dorado = "dorado"
    val atún = "Atún"

    val meGustaTilapia= true
    val meGustaAtun = false
    val meGustaDorado = true

    println("I ${if (meGustaTilapia) "like" else "don't like"} to eat $tilapia.")
    println("I ${if (meGustaDorado) "like" else "don't like"} to eat $dorado.")
    println("I ${if (meGustaAtun) "like" else "don't like"} to eat $atún.")
}
fun  Nombrepez(){
    val fishName = "Tuna"
    when {
        fishName.length == 0 -> println("Error: Fish name cannot be empty.")
        fishName.length in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}

fun lista (){
    val numeros = arrayOf(11, 12, 13, 14, 15)
    val listaCadenas = mutableListOf<String>()
    for (numero in numeros) {
        listaCadenas.add(numero.toString())
    }
    println("Lista de Cadenas: $listaCadenas")

}


