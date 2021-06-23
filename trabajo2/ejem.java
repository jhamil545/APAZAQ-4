
import java.util.Scanner;
    //import java.io.*;
 
    class divisores
    
    {
        static Scanner teclado=new Scanner(System.in);
        public static void main (String args[]) //throws IOException
        {
            int nu;
            System.out.println("Introduzca un Numero: ");
        nu=teclado.nextInt();
        //String nu = br.readLine();
       // int n = Integer.parseInt (nu);
 
        for (int i = 1 ; i <= nu ; i++)
            if (nu % i == 0)
                System.out.println (i);
    
    }
        }
       
