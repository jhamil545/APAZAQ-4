package repetitiva;

import java.util.Scanner;
public class ejemplo1 {
    static Scanner objTeclado=new Scanner(System.in);
    public static void sumadenumerosmientras() {
        //Declarar Variables
        double numeros=1, sumaNumeros=0;
        int contador=1,cannum=0;
        //Datos de entrada 
        System.out.println("Cuantos numeros desea sumar:");
        cannum=objTeclado.nextInt();
        // Proceso
        while(contador<=cannum){
           
            sumaNumeros=sumaNumeros+numeros;
            contador++;
        }
        System.out.println("La suma de los  numeros es:"+sumaNumeros);
    }

    public static void suma10NumerosHacerMientras() {
        //Declarar Variables
        double numeros, sumaNumeros=0;
        int contador=1;
        //Datos de entrada y Proceso
        do{        
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;                        
        }
        while(contador<=10);
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);
    }


    public static void suma10NumerosPara() {
        //Declarar Variables
        double numeros, sumaNumeros=0;        
        //Datos de entrada y Proceso
        for(int contador=1;contador<=10;contador++){        
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;                                    
        }
        System.out.println("La suma de los  numeros es:"+sumaNumeros);
    }


public static void main(String[] args) {
    sumadenumerosmientras();
}
}
