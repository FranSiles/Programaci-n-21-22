public class Ejercicio8 { 
public static void main(String[] args) {
System.out.println("Introduzca las tres notas ");
System.out.println("Introduzca la primera nota" );
double nota1 = Double.parseDouble(System.console().readLine());
System.out.println("Introduzca la segunda nota" );
double nota2 = Double.parseDouble(System.console().readLine());
System.out.println("Introduzca la tercera nota" );
double nota3 = Double.parseDouble(System.console().readLine());
 double media = (nota1+nota2+nota3)/3;
 System.out.println("Su nota en el boletin es ");
 if (media < 5){
   System.out.println("insuficiente");
 }
 if ((media >=5)&&(media < 6)){
   System.out.println("Suficiente");
 }
 if ((media >=6)&&(media < 7)){
   System.out.println("bien");
 }
 if ((media >= 7)&&(media < 9)){
   System.out.println("Notable");
 }
 if ((media >= 9)&&(media == 10)){
   System.out.println("sobresaliente");

}
}
}
