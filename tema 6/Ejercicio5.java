public class Ejercicio5{ 
public static void main(String[] args) {
int suma = 0;
int minimo = 199;
int maximo = 100;
for(int i=0; i<51; i++){
int numero = ((int)(Math.random()*100)+100);
System.out.print(numero+" ");
suma += numero;
if(numero<minimo){
  minimo=numero;
}
if(numero>maximo){
  maximo = numero;
}
}
System.out.println("la media es "+(suma/50));
System.out.println("El numero mas pequeño es "+minimo);
System.out.println("El numero mas grande es "+maximo);

}
}

