public class Ejercicio14 { 
public static void main(String[] args) {
int intentos = 5;
String respuesta;
System.out.println("Introduzca un numero del 0 al 100 y la IA lo intentara adivinar");
int numero1 =Integer.parseInt(System.console().readLine());
do{
  int numero2 =(int)(Math.random()*100);
intentos--;
if(numero2==numero1){
  System.out.println("La IA a acertado ");
}else{
  System.out.println("La IA a introduciod el numero "+numero2+" que es incorrecto le quedan para adivinarlo "+intentos+" intentos");
  System.out.println("¿El numero es mayor o menor? ");
  respuesta=System.console().readLine();
  /*if (respuesta=mayor){
    numero2=>numero1;
  }else{
    numero2=<numero1;
  }*/
}
}while (intentos>=1);
System.out.println("la maquina no ha acertado entonces tu numero era  "+numero1);
}
}
