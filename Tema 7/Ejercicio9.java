public class Ejercicio9{ 
public static void main(String[] args) {
int i;
int[] numero = new int[8];
System.out.println("Introduzca ocho numeros ");
for( i=0; i<8; i++){
numero[i]=Integer.parseInt(System.console().readLine());
}
for(i=0; i<8; i++){
if (numero[i]%2==0){
  System.out.println(numero[i]+" par");
}else{
  System.out.println(numero[i]+" impar");
}
}
}
}
