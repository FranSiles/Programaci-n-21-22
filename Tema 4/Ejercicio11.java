public class Ejercicio11 { 
public static void main(String[] args) {
System.out.println("Introduzca horas y minutos");
System.out.println("Introduce horas ");
int hora = Integer.parseInt(System.console().readLine());
System.out.println("introduce minutos ");
int minutos = Integer.parseInt(System.console().readLine());
if ((hora >= 1)&&(hora<=24)&&(minutos>=0)&&(minutos<=60)){
  int resultado = (86400-((hora*3600)+(minutos*60)));
  System.out.println("Los segundos que faltan para medianoche son 0"+resultado);
}else{
System.out.println("No se puede realizar ya que el una dia solo tiene 24 horas y cada hora tiene 60 minutos");
}
}
}
