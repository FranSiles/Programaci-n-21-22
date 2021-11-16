public class Ejercicio9 { 
public static void main(String[] args) {
 int resultado = 0;
 int numerostotales = 0;
do{
  resultado = ((int)(Math.random()*51)*2);
  System.out.println(resultado);
  numerostotales++;
  
  }while(resultado!=24);
System.out.println("los numeros que ha generado hasta que a salido 24 son "+numerostotales);
}
}
