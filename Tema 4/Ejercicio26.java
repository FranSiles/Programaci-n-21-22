public class Ejercicio26 { 
public static void main(String[] args) {
System.out.println("Venta de entradas:cinemapa ");
System.out.println("Introduzca el numero de entradas que desea comprar ");
int numentrada = Integer.parseInt(System.console().readLine());
double entrada = 0;
System.out.println("Introduzca dia de la semana ");
String dia = System.console().readLine();
switch(dia){
case "lunes":
entrada = 8;
break;
case "martes":
entrada = 8;
break;
case "miércoles":
entrada = 5;
break;
case "jueves":
if (entrada%2 == 0){
  entrada = 5.50;
}else{
  entrada = 8;
}
break;
case "viernes":
entrada = 8;
break;
case "sabado":
entrada = 8;
break;
case "domingo":
entrada = 8;
break;
default:
System.out.println("No existe el dia ");
}
System.out.println("¿Tiene tarjeta cinemapa?");
String respuesta = System.console().readLine();
 if (respuesta.equals("s")){
   double precio = (entrada*numentrada)*0.9;
   System.out.println("El precio de la entrada es "+precio);
 }
 if (respuesta.equals("n")){
  double precio2 = entrada*numentrada;
  System.out.println("El precio de la entrada sin descuento es "+precio2);
}

}
}
