public class Ejercicio21 { 
public static void main(String[] args) {
  System.out.println("Introduzca las dos notas del trimestre ");
  Double nota1 = Double.parseDouble(System.console().readLine());
  Double nota2 = Double.parseDouble(System.console().readLine());
  double media = (nota1+nota2)/2;
  if (media >= 5) {
    System.out.println("Tu nota en programacion es " +media);
  }else { 
    System.out.println("¿Cual a sido la nota que has sacado en la recuperación? ");
    Double recu = Double.parseDouble(System.console().readLine());
    if (recu >=5){
      System.out.println("Eres apto y tienes un 5 en programacion");
    }else{
      System.out.println("No apto");
    }
  }
}
}
