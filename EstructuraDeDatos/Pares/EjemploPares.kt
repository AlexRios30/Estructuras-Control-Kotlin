fun main() {
// Crear un par de valores de tipo String e Int
val pair1 = Pair("hola", 123)

// Crear un par de valores de tipo Int y Double
val pair2 = Pair(10, 3.14)

// Acceder a los valores del par
val (str, num) = pair1
println("El valor de la cadena es $str y el valor del numero es $num")

// También se puede acceder a los valores del par de esta manera
println("El primer valor del par es ${pair2.first} y el segundo valor es ${pair2.second}")
}


