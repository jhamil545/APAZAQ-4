import java.util.Scanner;
public class ejemplo4 {
    static Scanner teclado=new Scanner(System.in);
    public static void areac() {
    System.out.println("Ingrese el lado ");
    int lado = teclado.nextInt();
       System.out.println(" EL AREA DEL CUADRADO ES :"+ lado*lado); 
}
    public static void main(String[] args) {
        areac();
    }
}