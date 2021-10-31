public class Ejercicio5 { 
public static void main(String[] args) {

String rojo = "\033[31m";
String verde = "\033[32m";
String naranja = "\033[33m";
String azul = "\033[34m";
String morado = "\033[35m";
String celeste = "\033[36m";
String blanco = "\033[37m";

System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves.\tViernes");
System.out.println("======\t=======\t======\t=======\t=======");
System.out.println(verde + "LM\tED\tLM\tED \tFOL");
System.out.println(azul + "LM\tBBDD\tLM\tED\tFOL");
System.out.println(morado + "PROG\tBBDD\tPROG\tPROG\tFOL");
System.out.println(celeste + "PROG\tPROG\tPROG\tPROG\tSINF");
System.out.println(blanco + "BBDD\tPROG\tBBDD\tSINF\tSINF");
System.out.println(rojo + "BBDD\tSINF\tBBDD\tSINF\tSINF");



}
}
