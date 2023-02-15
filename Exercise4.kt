fun main() {
    print("Ingrese numero de horas trabajadas: ");
    var horasTrabajadas = readLine()!!.toInt();
    var hora = 2000;
    var salario = horasTrabajadas * hora
    println("El salario base es $salario");
    var porcentaje = 0.1;
    var descuento = salario * porcentaje
    println("El descuento del 10% que se le realizara sera de $descuento");
    var salarioTotal = salario - descuento
    println("El salario total con descuento aplicado es de $salarioTotal");


    print("Ingrese el tipo de empleado (A, B, C) : ");
    var tipoEmpleado = readLine();
    var porcAumento = 0.0;

    when (tipoEmpleado) {
        "A" -> {
            porcAumento = 0.3;
            println("Este es el tipo A");
        }
        "B" -> {
            porcAumento = 0.2;
            println("Este es el tipo B");
        }
        "C" -> {
            porcAumento = 0.1;
            println("Este es el tipo C");
        } else -> {
            println("No se le realizara ningun aumento");
            porcAumento = 0;
        }
    } 
    if(porcAumento!= 0.0) {
        var aumento = salarioTotal * (porcAumento/100)
        salarioTotal = salarioTotal + aumento
        println("Se realizo el aumento de $aumento, Equivalente al porcentaje de $porcAumento %");
        println("El salario final quedo en $salarioTotal");
    }
}