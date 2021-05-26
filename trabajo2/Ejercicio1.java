import java.util.Scanner;

public class Ejercicio1 {
    
    static Scanner teclado=new Scanner(System.in);
    public static void Salario() {
    double salarioFin=1500.0;
    int años=1;     
    while (años<=6) {            
        salarioFin=(salarioFin*0.1)+salarioFin;
        System.out.println("Su salario anual"+años+ " es: "+salarioFin);
        años++;
    }   
    }
    public static void main(String[] args){
        Salario();
    }
}