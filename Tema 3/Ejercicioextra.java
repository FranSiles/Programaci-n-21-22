public class Ejercicioextra { 
public static void main(String[] args) {
String frase;
/*
 Me faltaria dos lineas mas pero son iguales a sin que se quedan en tres.
 */ 
System.out.print("Dime la primera frase ");
frase = System.console().readLine();
System.out.println(""+frase);
System.out.print("Dime la segunda frase ");
frase = frase + "\n" + System.console().readLine();
System.out.println(""+frase);
System.out.print("dime la tercera frase ");
frase = frase+ "\n" + System.console().readLine();
System.out.println("La frase es " + "\n" + frase + "\n");

}
}
