public class Ejercicio8 { 
public static void main(String[] args) {

 int columna=3;
for(int fila=1; fila<=15; fila++){
   System.out.printf("%4d.", fila);
if(fila==15){
  columna=1;
}
for(int i=1; i<=columna; i++){
int resultado = ((int)(Math.random()*6)+1);
switch(resultado){
case 1:
case 2:
case 3:
System.out.print("|1|");
break;
case 4:
case 5:
System.out.print("|X|");
break;
case 6:
System.out.print("|2|");
default:
}
}
System.out.println();
}
}
}


