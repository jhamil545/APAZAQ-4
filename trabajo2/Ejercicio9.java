import java.util.Scanner;
public class Ejercicio9 {
    static Scanner teclado=new Scanner(System.in);
    public static void depositob () {
        //definir variables
        double cantidad=0;
        int cantaños=0, contador=1;
        //datos de entrada
        System.out.println("Cuantos años ingreso dinero ");
            cantaños=teclado.nextInt();
        //Proceso y datos de salida
        while (contador<=cantaños) {
            System.out.println("Indique la cantidad de dinero que ingreso el año"+contador+": ");
            cantidad=teclado.nextInt();
            cantidad=(cantidad*0.1)+cantidad;

            contador++;
        
        }
        System.out.println("el año "+cantaños+" ahorro :"+cantidad);
    }
    public static void main(String[] args) {
        depositob ();
    }
    
}
