fun main() {
    val operacionesMap = mapOf(
        "Suma" to '+',
        "Resta" to '-',
        "Multiplicacion" to 'x',
        "Division" to '/'
    )

    for ((operation, symbol) in operacionesMap) {
        println("$operation -> $symbol")
    }
}