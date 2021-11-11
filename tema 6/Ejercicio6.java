public class Ejercicio6 { 
public static void main(String[] args) {
  int intentos = 5;
int numero =((int)(Math.random()*100)+1);
System.out.println("El juego de adivinar un numero tendras cinco intentos para ganar");
do{
int numeroIntroducido=Integer.parseInt(System.console().readLine());
intentos--;
if(numeroIntroducido==numero){
  System.out.println("Enhorabuena has acertado el numero");
}else{
  System.out.println("El numero introducido no es correcto te quedan "+intentos);
  if (numeroIntroducido>numero){
    System.out.println("El numero es menor al numero introducido");
  }
  if(numeroIntroducido<numero){
    System.out.println("El numero es mayor al numero introducido");
}
}
}while (intentos>=1);
System.out.println("No has acertado el numero es "+numero);
}
}
