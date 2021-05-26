import java.util.Scanner;
public class Ejercicio6 {
    static Scanner teclado=new Scanner(System.in);
    public static void sueldo(){
    //definir variables y Otros
    double salarioFin=1500.00;
    //proseso
    for (int años=1;años<=6; años++) {
        salarioFin=(salarioFin*0.1)+salarioFin;
        System.out.println("Su salario anual"+años+ " es: "+salarioFin);
    }
    }
   public static void main(String[] args) {
    sueldo();
   } 
}
