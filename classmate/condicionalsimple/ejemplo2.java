package condicionalsimple;
import java.util.Scanner;
public class ejemplo2 {
    static Scanner teclado=new Scanner(System.in);
    public static void hallarnumeronegativo() {
    //definir variables y Otros
    int a;
    //datos de entrada
    System.out.println("Ingrese el valor de a");
    a=teclado.nextInt();
    //Proceso
    if (a < 0) {
        System.out.println("El número es negativo"); 
    } 
    else {
        if (a == 0) {
           System.out.println("El número es nulo"); 
        } else {
           System.out.println("El número es positivo");
        }
    }
    }
    public static void main(String[] args) {
        hallarnumeronegativo(); 
    }
}
