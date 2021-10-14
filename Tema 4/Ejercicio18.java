public class Ejercicio18 { 
public static void main(String[] args) {
System.out.println("Introduzca un numero entero de maximo cinco  cifras ");
int n = Integer.parseInt(System.console().readLine());
int primera = 0;
if(n<10){
  primera=n;
}
if((n >= 10)&&(n<100)){
primera=n/10;
}
if((n>=100)&&(n<1000)){
primera=n/100;
}
if((n>=1000)&&(n<10000)){
  primera=n/1000;
}
if((n>=10000)&&(n<100000)){
  primera=n/10000;
}else{
  System.out.println("Solo vamos a utilizar en este programa numeros menores de cinco cifras o iguales");
}
System.out.println("La primera cifra es "+primera);
}
}
