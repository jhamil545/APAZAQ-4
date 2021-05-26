package condicionalsimple;
import java.util.Scanner;
public class ejemplo3 {
    static Scanner teclado=new Scanner(System.in);
    public static void temperatura() {
    //definir variables y Otros
    int temperatura=0;
    //Datos de entrada
    System.out.println("Ingrese la temperatura");
    temperatura=teclado.nextInt();
    //Proceso
        if (temperatura > 25) {
            System.out.println("Puedes ir a la playa!!!");
        } 
        else if (temperatura > 15) {
            System.out.println("Puedes ir a  la montaña!!!");
        } 
        else {
            System.out.println("Mejor abrigate y descansa");
        }
        
    }
    public static void main(String[] args) {
        temperatura();
    }
    
}
