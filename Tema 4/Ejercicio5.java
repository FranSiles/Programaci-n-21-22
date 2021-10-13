public class Ejercicio5 { 
public static void main(String[] args) {
System.out.println("est programa va a resolver lea ecuación ax+b=0 ");
System.out.print("Introduzca a ");
double a = Double.parseDouble(System.console().readLine());
System.out.print("Introduzca b ");
double b = Double.parseDouble(System.console().readLine());
if (a>0){
double resultado =-b/a;
System.out.println("x es igual a "+resultado);
}
if (a==0){
System.out.println("no se puede realizar la ecuación");
}
}
}
