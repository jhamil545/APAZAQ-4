package repetitiva;
import java.util.Scanner;
public class ejemplo4 {
    static Scanner teclado=new Scanner(System.in);
    public static void sumadeconjuntos() {
        int xcant=0;
        double numero,sumanum=0;
        System.out.println("Ingrese la cantidad");
        xcant=teclado.nextInt();
        for (int i = 1; i <=xcant; i++) {
            System.out.println("Ingrese el valor del numero");
            numero=teclado.nextDouble();
            sumanum=sumanum+numero;
        }
        System.out.println("el promedio es"+(sumanum/xcant));
    }
    public static void main(String[] args) {
        sumadeconjuntos();
     }
}
