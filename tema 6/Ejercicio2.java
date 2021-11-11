public class Ejercicio2 { 
public static void main(String[] args) {

int carta = ((int)(Math.random()*13)+1);
int mazo = ((int)(Math.random()*4)+1);
String palo=" ";
String carta2=" ";

switch(carta){
  case 1:
  carta2 = "A";
  break;
  case 2:
  carta2 = "2";
  break;
  case 3:
  carta2 = "3";
  break;
  case 4:
  carta2 = "4";
  break;
  case 5:
  carta2 = "5";
  break;
  case 6:
  carta2 = "6";
  break;
  case 7:
  carta2 = "7";
  break;
  case 8:
  carta2 = "8";
  break;
  case 9:
  carta2 = "9";
  break;
  case 10:
  carta2 = "10";
  break;
  case 11:
  carta2 = "J";
  break;
  case 12:
  carta2 = "Q";
  break;
  case 13:
  carta2 = "K";
  break;
  default:
}
switch(mazo){
case 1:
  palo = "picas";
  break;
  case 2:
  palo = "diamantes";
  break;
  case 3:
  palo = "treboles" ;
  break;
  case 4:
  palo = "corazones";
  break;
  default:
}
System.out.println( carta2 + " de " + palo );
}
}
