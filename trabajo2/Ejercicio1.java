import java.util.Scanner;

public class Ejercicio1 {
    
    static Scanner teclado=new Scanner(System.in);
    public static void Salario() {
    //definir variables
    double salarioFin=1500.0;
    int añosj=1; 
    //datos de entrada/proseso/datos de salida    
    while (añosj<=6) {            
        salarioFin=(salarioFin*0.1)+salarioFin;
        System.out.println("Su salario anual"+añosj+ " es: "+salarioFin);
        añosj++;
    }   
    }
    public static void main(String[] args){
        Salario();
    }
}