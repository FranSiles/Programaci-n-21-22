public class Ejercicio7 { 
public static void main(String[] args) {
  int i;
int[] numero = new int[100];
String verde = "\033[32m";
String blanco = "\033[37m";
for( i=0; i<100; i++){
 numero[i]=(int)(Math.random()*21);
System.out.print(numero[i]+" ");
}
System.out.println("Introduzca un valor ");
int valor1 = Integer.parseInt(System.console().readLine());
System.out.println("Introduzca un segundo valor ");
int valor2 = Integer.parseInt(System.console().readLine());
for (i = 0; i < 100; i++) {
if (numero[i] == valor1) {
numero[i] = valor2;
System.out.print(verde+"\"" + numero[i] + "\" ");
} else {
System.out.print(blanco+numero[i] + " ");
}
}
}
}
