public class Ejercicio22 { 
public static void main(String[] args) {
  System.out.println("Introduzca dia ");
String dia = System.console().readLine();
int dianumerico = 0;

switch(dia) {
case "lunes":
dianumerico = 0;
break;
case "martes":
dianumerico = 1;
break;
case "miércoles":
dianumerico = 2;
break;
case "jueves":
dianumerico = 3;
break;
case "viernes":
dianumerico = 4;
break;
default:
System.out.print("El día introducido no es correcto.");
}
System.out.println("A continuación introduzca la hora y minutos");
System.out.print("Hora: ");
int horas = Integer.parseInt(System.console().readLine());
System.out.print("Minutos: ");
int minutos = Integer.parseInt(System.console().readLine());
int minutosTotales = (4 * 24 * 60) + (15 * 60);
double minutosActuales = (dianumerico * 24 * 60) + (horas * 60) + minutos;
System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");




}
}
