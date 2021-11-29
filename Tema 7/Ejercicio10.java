public class Ejercicio10{ 
public static void main(String[] args) {
int i;
int[] numero = new int[20];
int[] par = new int[20];
int[] impar = new int[20];
int pares= 0;
int impares= 0;
for( i=0; i<20; i++){
  numero[i]=(int)(Math.random()*101);
if (numero[i] % 2 == 0) {
par[pares++] = numero[i];
} else {
impar[impares++] = numero[i];
}
}
for(i=0; i<pares; i++){
  numero[i]=par[i];
}
for(i=pares; i<20; i++){
  numero[i]=impar[i-pares];
}
for(i=0; i<20; i++){
System.out.print(numero[i]+" ");
}
}
}
