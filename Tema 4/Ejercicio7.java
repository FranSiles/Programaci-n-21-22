public class Ejercicio7 {
public static void main(String[] args) {
System.out.println("Introduzca las tres notas ");
System.out.println("Introduzca la primera nota" );
double nota1 = Double.parseDouble(System.console().readLine());
System.out.println("Introduzca la segunda nota" );
double nota2 = Double.parseDouble(System.console().readLine());
System.out.println("Introduzca la tercera nota" );
double nota3 = Double.parseDouble(System.console().readLine());
 double media = (nota1+nota2+nota3)/3;
 System.out.print("Su media es "+media);
}
}
