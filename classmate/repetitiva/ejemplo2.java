package repetitiva;

import java.util.Scanner;
public class ejemplo2 {
    static Scanner teclado=new Scanner(System.in);
    public static void hola() {
    // definir variables
    int contador=1,canveces;
    // datos de entrada 
    System.out.println("Ingrese el numero de veces que decea imprimir: ");
    canveces=teclado.nextInt();
    //proseso
      while (contador<=canveces) {
          System.out.println(contador+" HOLA A TODOS");
          contador++;
      }
  }
    public static void sumadenumeros() {
        double numero=1;
        //System.out.println("Ingresar cantidad de elementos:");
        //numero=teclado.nextDouble();
        for (int contador=1; contador<=10; contador++) {
            numero=numero+numero;
            System.out.println("el numero es"+numero);
            
            //sumadenumero=numero*(numero+1)/2;
        }
        
        System.out.println("la suma de los numeros es: "+numero);
    }
    public static void main(String[] args) {
       // hola();
        sumadenumeros();
    }
}
