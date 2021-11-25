public class Ejercicio6{ 
public static void main(String[] args) {
int i;
int[] numero = new int[15];
System.out.println("Introduzca 15 numeros ");
for( i=0; i<15; i++){
numero[i]=Integer.parseInt(System.console().readLine());
}
System.out.println("array original");
for (i = 0; i < 15; i++) {
System.out.printf("|%3d ", numero[i]);
}
int aux = numero[14];
for (i = 14; i > 0; i--){
numero[i] = numero[i-1];
}
numero[0] = aux;
System.out.println("array rotada");
for (i = 0; i < 15; i++) {
System.out.printf("|%3d ", numero[i]);
}
}
}
