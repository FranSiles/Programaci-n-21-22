public class Ejercicio4 { 
public static void main(String[] args) {
System.out.print("Introduzca las horas trabajadas " );
double horas = Double.parseDouble(System.console().readLine());
if (horas<=40){
  double sueldo = horas*12;
System.out.println("Su sueldo es "+sueldo);
}
if (horas>=41){
double sueldo2= (40*12)+((horas-40)*16);
System.out.println("Su sueldo es "+sueldo2);
}
}
}
