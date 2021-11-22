public class Ejercicio11{
public static void main(String[] args) {
  int nota = 0;
  int suspenso = 0;
  int suficiente = 0;
  int bien = 0;
  int notable = 0;
  int sobresaliente = 0;
for(int i=0; i<20; i++){
nota = ((int)(Math.random()*5)+1);

switch(nota){
case 1:
System.out.println("Suspenso");
suspenso++;
break;
case 2:
System.out.println("Suficiente");
suficiente++;
break;
case 3:
System.out.println("Bien");
bien++;
break;
case 4:
System.out.println("Notable");
notable++;
break;
case 5:
System.out.println("Sobresaliente");
sobresaliente++;
break;
default:
}
}
System.out.println();
System.out.println("La cantidad de suspenso es "+suspenso);
System.out.println("La cantidad de suficientes es "+suficiente);
System.out.println("La cantidad de bien es "+bien);
System.out.println("La cantidad de notable es "+notable);
System.out.println("La cantidad de sobresaliente es "+sobresaliente);

}
}
