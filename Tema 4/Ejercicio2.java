public class Ejercicio2 { 
public static void main(String[] args) {
  System.out.print("Introduzca una hora ");
double hora = Double.parseDouble(System.console().readLine());
if ((hora >= 6) && (hora <= 12)){
System.out.println("Buenos dias");
}else{
if ((hora >= 13) && (hora <= 20)){
System.out.println("Buenas tardes");
}else{
if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))){
  System.out.println("buenas noches");
}else{
  System.out.println("Este programa no acepta numeros superiores a 24");
  
}
}
}
}
}
