public class Ejercicio1 { 
public static void main(String[] args) {
System.out.println("Se le mostrara el lanzamiento de tres dados ");
int resultado = ((int)(Math.random()*6+1));
System.out.println("El numero que ha salido en la primera tirada es "+resultado);
int resultado2 = ((int)(Math.random()*6+1));
System.out.println("El numero que ha salido en la segunda tirada es "+resultado2);
int resultado3 = ((int)(Math.random()*6+1));
System.out.println("El numero que ha salido en la tercera tirada es "+resultado3);
System.out.println("La sumatoria de los dados es "+(resultado+resultado2+resultado3));

}
}
