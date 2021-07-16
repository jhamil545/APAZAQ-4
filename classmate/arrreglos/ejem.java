package arrreglos;

import java.util.Scanner;

public class ejem {
    public static void numderelojes() {
        int[] numeroderelojes=new int[]{1,5,7,6,3,25,15,48};  
        for (int i = 0; i < numeroderelojes.length; i++) {
            System.out.println("v["+i+"]= "+numeroderelojes[i]+"   Su indice es: "+i+" Su valor es:"+numeroderelojes[i]);        
        }
    }
    public static void modificarvector() {
        int[] numeroderelojes=new int[]{1,5,7,6,3,25,15,48}; 
        numeroderelojes[4]=14;
        numeroderelojes[6]=13; 
        for (int i = 0; i < numeroderelojes.length; i++) {
            System.out.println("v["+i+"]= "+numeroderelojes[i]+"   Su indice es: "+i+" Su valor es:"+numeroderelojes[i]);        
        }
        
    }
    public static void matriz() {
        String[][] maX={{"d","F","J"},
                        {"F","K","S"},
                        {"C","Q","L"}};

        for (int f = 0; f < maX.length; f++) {
        for (int c = 0; c < maX[0].length; c++) {
        System.out.print(maX[f][c]+"\t");
         }
        System.out.println("");
        }             
    }
    
    public static void cambiarm() {
        String[][] letras={{"d","F","J"},
                            {"F","K","S"},
                            {"C","Q","L"}};
        letras[2][1]="d";
        letras[0][0]="m";
        letras[1][1]="Q";

        for (int f = 0; f < letras.length; f++) {
        for (int c = 0; c < letras[0].length; c++) {
        System.out.print(letras[f][c]+"\t");
        }
        System.out.println("");
        }        
    }
    public static void vectorteclado() {
        int[] vecentrada;
        vecentrada=new int[4];
        
        Scanner cs=new Scanner(System.in);
        for (int i = 0; i < vecentrada.length; i++) {
            System.out.print("ingrese el valor del indice "+i+":");
            vecentrada[i]=cs.nextInt();
            System.out.println("");
        }
        mostrarValores(vecentrada);
        
        
    }
    public static void mostrarValores(int[] vecentrada) {
        for (int i = 0; i < vecentrada.length; i++) {
            System.out.println("v["+i+"]= "+vecentrada[i]+"   Su indice es: "+i+" Su valor es:"+vecentrada[i]);        
        }
    }
    
    
    public static void main(String[] args) {
        
        //numderelojes();
        //modificarvector();
        //matriz();
        //cambiarm();
        vectorteclado();
    }
}
