public class Ejercicio4 { 
public static void main(String[] args) {
int[] numero=new int [20];
int[] cuadrado=new int [20];
int[] cubo=new int [20];
int i;
for( i=0; i<20; i++){
  numero[i]=((int)(Math.random()*100)+1);
cuadrado[i]=numero[i]*numero[i];
cubo[i]=numero[i]*numero[i]*numero[i];
}
System.out.println(" n │ n² │ n³\n─────┼───────┼─────────");
for (i = 0; i < 20; i++) {
System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
}
}
}
