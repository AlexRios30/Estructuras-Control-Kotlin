fun main() {
    var resp = "si";
    var cont = 0;

    while(resp == "si") {
        print("Ingrese nombre: ");
        var nombre = readLine();

        println("Hola $nombre bienvenido a la clase");
        cont++;
        print("Ingrese si, si quiere agregar otra persona");
        resp = readLine()!!;
    }
    println("Llegaron a la clase la cantidad $cont personas");
    println("Finalizo el ciclo");
}