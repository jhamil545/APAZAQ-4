import java.util.Scanner;
public class Ejercicio5 {
    static Scanner teclado=new Scanner(System.in);
    public static void nahorros() {
    //Declarar Variables
    
    int contador=1; 
    long totalA=1;
    // Proceso
    while (contador<=365) {
        
        totalA*=3;
        contador++;
    }
    //Datos de salida
    System.out.println("cuantos dias ahorro "+(contador-1)+":");
    System.out.println("El ahorro en un año es:"+totalA);
    }
    
        public static void main(String[] args) {
            nahorros();
        }
}
