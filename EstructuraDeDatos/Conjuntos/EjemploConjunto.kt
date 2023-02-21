fun main() {
    // Declaración de un conjunto de números enteros
    val numeros = setOf(1, 2, 3, 4, 5)

    // Accediendo a los elementos del conjunto
    println(numeros.contains(3)) // Imprime: true
    println(numeros.contains(6)) // Imprime: false

    // Iterando sobre los elementos del conjunto con un for loop
    for (numero in numeros) {
        println(numero)
    }

    // Declaración de un conjunto mutable de cadenas
    val frutas = mutableSetOf("manzana", "banana", "naranja")

    // Agregando elementos al conjunto mutable
    frutas.add("kiwi")
    frutas.addAll(listOf("pera", "melon"))

    // Eliminando elementos del conjunto mutable
    frutas.remove("banana")
    frutas.removeAll(listOf("manzana", "naranja"))

    // Iterando sobre los elementos del conjunto mutable con un for loop
    for (fruta in frutas) {
        println(fruta)
    }
}