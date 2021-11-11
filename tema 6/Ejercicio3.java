public class Ejercicio3{ 
public static void main(String[] args) {

int carta = ((int)(Math.random()*10)+1);
int mazo = ((int)(Math.random()*4)+1);
String palo=" ";
String carta2=" ";

switch(carta){
  case 1:
  carta2 = "2";
  break;
  case 2:
  carta2 = "3";
  break;
  case 3:
  carta2 = "4";
  break;
  case 4:
  carta2 = "5";
  break;
  case 5:
  carta2 = "6";
  break;
  case 6:
  carta2 = "7";
  break;
  case 7:
  carta2 = "sota";
  break;
  case 8:
  carta2 = "caballo";
  break;
  case 9:
  carta2 = "rey";
  break;
  case 10:
  carta2 = "as";
  break;
  default:
}
switch(mazo){
case 1:
  palo = "oro";
  break;
  case 2:
  palo = "bastos";
  break;
  case 3:
  palo = "copas" ;
  break;
  case 4:
  palo = "espadas";
  break;
  default:
}
System.out.println("la carta es: " + carta2 + " de " + palo );

}
}
