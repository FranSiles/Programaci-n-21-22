public class Ejercicio27 { 
public static void main(String[] args) {
System.out.println("Elija el sabor de la tarta(manzana,fresa y chocolate ");
String sabor = System.console().readLine();
double tarta = 0;
double nata = 0;
double nombre = 0;

switch(sabor){
  case "manzana":
tarta = 18;
break;
  case"fresa":
tarta = 16;
break;
  case "chocolate":
System.out.println("que tipo de chocolate desea blanco o negro"); 
String tipo = System.console().readLine();
if (tipo.equals("Blanco")){
  tarta = 15;
}else{
 tarta = 14;
}break;
default:
System.out.println("No esta disponible ese sabor");
}
System.out.println("¿Quiere nata?");
String respuesta = System.console().readLine();
if (respuesta.equals("si")){
  nata = 2.5;
}if (respuesta.equals("no")){
  System.out.println("No se le añadira nata a su tarta");
   nata = 0;
}
System.out.println("¿Quiere ponerle un nombre?");
String respuesta2 = System.console().readLine();
if (respuesta2.equals("si")){
  nombre = 2.75;
}if(respuesta2.equals("no")){
System.out.println("No se le pondra nombre");
  nombre = 0;
}

double total = tarta+nata+nombre ;
System.out.println("la tarta cuesta "+total);
}
}
