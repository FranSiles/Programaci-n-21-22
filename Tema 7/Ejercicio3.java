public class Ejercicio3 { 
public static void main(String[] args) {
  int[] n=new int [10];
System.out.println("Introduzca 10 numeros ");
for(int i=0; i<10; i++){
  System.out.println("la cantidad de numeros que llevas es "+(i+1)+":");
n[i] =Integer.parseInt(System.console().readLine());
}
System.out.println("Los numeros a la inversa son ");
for(int i=9; i>=0; i--){
  System.out.println(n[i]);
}


}
}
