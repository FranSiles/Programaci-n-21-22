public class ejercicio12 { 
public static void main(String[] args) {
  

System.out.print("Introduzca la nota 1 ");
float nota1 = Float.parseFloat(System.console().readLine());
System.out.println("La nota 1 es "+ nota1);
System.out.print("Introduzca la nota que deseas en el trimestre ");
float notat = Float.parseFloat(System.console().readLine());
System.out.println("La nota que deseas en el trimestre es "+notat);
System.out.println("su nota haciendo el 40% es "+nota1*0.4);
double notaf = (notat-(nota1*0.4))/0.6;
System.out.println("La nota que necesita sacar para conseguir la nota deseada es "+notaf);




}
}
