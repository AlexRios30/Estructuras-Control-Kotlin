fun main() {
    // Declaración de un array de números enteros
    val numeros = arrayOf(1, 2, 3, 4, 5)

    // Accediendo a los elementos del array
    println("El numero en la posicion 0 es: " + numeros[0]) // Imprime: 1
    println("El numero en la posicion 3 es: " + numeros[3]) // Imprime: 4

    // Modificando un elemento del array
    numeros[2] = 10
    println("Se ha modificado la posicion 2 del arreglo: " + numeros[2]) // Imprime: 10

    // Iterando sobre los elementos del array con un for loop
    for (numero in numeros) {
        println(numero)
    }
}