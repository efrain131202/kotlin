fun main() {
    var nombre: String? = null;
    println("Imprimiendo el valor de nombre: ");
    println(nombre);
    nombre = "Efraín Cruz Lobato";

    try {

        println("nombre: $nombre");

    }catch( err: NullPointerException) {
        println("Hay un error");
        println(err);
    }finally {
        println("Lo que este en finally, se ejucta siempre");
    }

    var longitud = -1;

    println("---------------try--------------");
    try{
         longitud = nombre.length;
    }catch( errr: NullPointerException) {

         longitud = 0;
    }finally {
        println("Valor de longitud: $longitud");
    }

    println("Termina prueba de try");
}
