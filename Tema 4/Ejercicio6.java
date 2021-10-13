public class Ejercicio6 { 
public static void main(String[] args) {
System.out.print("Introduzca altura ");
double altura = Double.parseDouble(System.console().readLine());
if (altura > 0){
  double resultado = Math.sqrt((2*altura)/9.81);
  System.out.println("El tiempo es " +resultado);
}
if (altura == 0){
System.out.print("no se puede realizar el calculo");
}
}
}
