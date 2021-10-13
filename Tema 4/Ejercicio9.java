public class Ejercicio9 { 
public static void main(String[] args) {
  /* captura de datos
   */
System.out.println("Introduzca los datosde la ecuacion ax^2+bx+c ");
System.out.println("Introduzca a ");
double a = Double.parseDouble(System.console().readLine());
System.out.println("Introduzca b ");
double b = Double.parseDouble(System.console().readLine());
System.out.println("Introduzca c ");
double c = Double.parseDouble(System.console().readLine());
if(a == 0){
  if(b==0){
  System.out.println("Esto no es una ecuación");
}else{
  double x1 = -c/b;
  System.out.println("La solucion es ");
  System.out.println("x1 = " +x1);
}
}else{
  double radicando = b*b-4*a*c;
  if(radicando>=0){
    double x1 = ((-b + Math.sqrt(radicando))/(2*a));
  double x2 = ((-b - Math.sqrt(radicando))/(2*a));
  System.out.println("La soluciones son:");
System.out.println("x1 = "+ x1);
System.out.println("x2 = "+ x2);
}else{
System.out.println("Esta ecuación tiene soluciones imaginarias.");
}
}
}
}

