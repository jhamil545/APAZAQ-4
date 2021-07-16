package arrreglos;

import java.util.Scanner;

public class EjemVectores {
    public static void conceptosvectores() {
        //Definir un vector
        int[] vectorX;
        //int []vectorY;
        //Definir tamaño del vectorX
        vectorX=new int[2];
        vectorX[0]=20;//[0] indice o posicion
        vectorX[1]=8;
        //vectorX[0]=5;
        System.out.println("Imprimiendo valores del vector");
        System.out.println(vectorX[1]);//Imprimiendo valor o elemento del vectorX[0]
        // asignando valores directos a un vector
        //int[] vA={12,2,3,4,5,6,7,8,9,10};
        int[] vB=new int[]{12,2,3,4,5,6,7,8,9,10,13,14};
        //conocer tamaño del vector 
        System.out.println(" longitud del vector vB= "+(vB.length));

    }
    

    public static void mostrarValores(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]= "+vector[i]+"   Su indice es: "+i+" Su valor es:"+vector[i]);        
        }
    }

    public static int[] rellenarVector(int tv) {
       int[] vector=new int[tv]; 
       Scanner cs=new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("ingrese el valor del indice "+i+":");
            vector[i]=cs.nextInt();
            System.out.println("");
        }
        mostrarValores(vector);
        return vector;
    }
    
    
    
    public static void main(String[] args) {
       conceptosvectores();
       //rellenarVector(5);
       
    }
}
