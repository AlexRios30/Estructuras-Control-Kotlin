fun main() {
    val numeros: List<Int> = listOf(1, 2, 3, 4, 5)

    println(numeros.size) // 5
    println(numeros.get(1)) // 2
    println(numeros[2]) // 3
    println(numeros.indexOf(5)) // 4
    println(numeros.lastIndexOf(6)) // -1
    println(numeros.subList(0, 2)) // [1, 2]
}