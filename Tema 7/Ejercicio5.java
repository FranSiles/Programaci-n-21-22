public class Ejercicio5 { 
public static void main(String[] args) {
int i;
int maximo=0;
int minimo=0;
int[] n = new int[10];
System.out.println("Introduce 10 numeros ");
for(i=0; i<10; i++){
n[i]= Integer.parseInt(System.console().readLine());
if (n[i]>maximo){
  maximo=n[i];
}
if (n[i]<minimo){
  minimo=n[i];
}
}
System.out.println("El maximo es "+maximo);
System.out.println("El minimo es "+minimo);
}
}
