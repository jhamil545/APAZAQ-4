import java.util.Scanner;
public class ejemplo1 { 
    static Scanner teclado=new Scanner(System.in);
    public static void saludo() {
    int a , b , c; 
    String nombre; 
     System.out.println("Ingrese el nombre del trabajador");
     nombre = teclado.next();
     System.out.println("Ingrese la cantidad de horas trabajadas"); 
     a=teclado.nextInt();
     System.out.println("Ingrese el valor de la hora trabajada");  
     b=teclado.nextInt();
     c = a * b ;
     System.out.println("El salario del trabajador " + nombre + " es : " + c); 
     }
     
     public static void main ( String []args) { 
        saludo();
    }
    }