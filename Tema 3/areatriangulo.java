public class areatriangulo { 
public static void main(String[] args) {
  System.out.print("Introduzca la base del triangulo ");
double base = Double.parseDouble(System.console().readLine());
System.out.print("Introduzca la altura del triangulo ");
double altura = Double.parseDouble(System.console().readLine());
double area = base*altura/2;
System.out.println("El area del triangulo es: " +area);

}
}
