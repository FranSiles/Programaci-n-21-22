public class Ejercicio15 { 
public static void main(String[] args) {
  String sonido = "";
  String primeranota = "";
int cantidad = 4*(int)(Math.random()*7+1);
for (int i=1; i<=cantidad; i++){
  int nota = ((int)(Math.random()*7)+1);
switch(nota){
  case 1:
  sonido="do";
  break;
   case 2:
  sonido="re";
  break;
   case 3:
  sonido="mi";
  break;
   case 4:
  sonido="fa";
  break;
   case 5:
 sonido="sol";
  break;
   case 6:
  sonido="la";
  break;
   case 7:
  sonido="si";
  break;
  default:
  }
if(i==1){
  primeranota=sonido;
}
if (i == cantidad) {
sonido = primeranota;
}
System.out.print(sonido + " ");
if ( i == cantidad ) {
System.out.print("||");
} else if ( i % 4 == 0 ) {
System.out.print("| ");
}


}
}
}
