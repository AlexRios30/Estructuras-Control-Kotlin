fun main() {
    print("Ingrese su nombre: ");
    var nombre = readLine();
    print("Ingrese materia: ");
    var materia = readLine();

    print("Ingrese nota 1: ");
    var nota1 = readLine()!!.toDouble();
    print("Ingrese nota 2: ");
    var nota2 = readLine()!!.toDouble();
    print("Ingrese nota 3: ");
    var nota3 = readLine()!!.toDouble();

    var prom = (nota1 + nota2 + nota3) / 3

    println("El promedio de notas es $prom");

    if(prom < 3.5) {
        println("El estudiante $nombre perdio la materia $materia");
    }
}