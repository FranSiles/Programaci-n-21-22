public class Ejercicio10 { 
public static void main(String[] args) {
String relleno = ""; 
int mucho = 0;
int r = 0;
for(int i=0; i<10; i++){
r  = ((int)(Math.random()*6)+1);
 mucho = ((int)(Math.random()*40)+1);
switch(r){
case 1:
relleno = "*";
break;
case 2:
relleno = "=";
break;
case 3:
relleno = ".";
break;
case 4:
relleno = "@";
break;
case 5:
relleno = "|";
break;
case 6:
relleno = "-";
break;
default:
}
for(int j = 1; j <= mucho; j++) {
System.out.print(relleno);
}
System.out.println();
}
}
}
