fun main() {
    var opcion: Int;
    var num1: Double;
    var num2: Double;

    do {
        print("Ingrese el primer numero: ");
        num1 = readLine()!!.toDouble();
        print("Ingrese el segundo numero: ");
        num2 = readLine()!!.toDouble();

        print("Elija una opcion \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Finalizado \n");
        opcion = readLine()!!.toInt();
        when (opcion) {
            1 -> println("La suma de los numeros es ${num1 + num2}");
            2 -> println("La resta de los numeros es ${num1 - num2}");
            3 -> println("La multiplicacion de los numeros es ${num1 * num2}");
            4 -> {
                if(num2 <= 0) {
                    println("El numero dos es negativo o igual a cero");
                } else {
                    println("La division de los numeros es ${num1 / num2}");
                }
            }
            5 -> println("El sistema a finalizado");
            else -> println("Opcion Invalida");
        }
    } while (opcion != 5)
}