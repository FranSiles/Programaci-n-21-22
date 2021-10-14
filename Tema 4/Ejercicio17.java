public class Ejercicio17 { 
public static void main(String[] args) {
System.out.println("Introduzca un numero entero ");
int n = Integer.parseInt(System.console().readLine());
int respuesta = n%10;
System.out.println("La ultima cifra del numero es "+respuesta);
}
}
