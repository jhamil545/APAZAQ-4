import java.util.Scanner;

public class Ejercicio4 {
    static Scanner teclado=new Scanner(System.in);
    public static void contadorf() {
   //definir variables y Otros
   int ncantidad,rojo=0,verde=0,blanco=0;
   String numero;
   //datos de entrada

  System.out.println("ingrese la cantidad de unidades del lote:");
   ncantidad=teclado.nextInt();
   //proseso
   int contador=1;
   while (contador<=ncantidad) {
       System.out.println("ingrese el color de la unidad "+contador+" del lote:");
       numero=teclado.next();
        if  (numero.equals("R") ) {
        rojo+=1;} 
        if (numero.equals("V")) {
        verde+=1; }
        if (numero.equals("B")) {
        blanco+=1;}
    contador++;
            
   }
   //datos de salida
   System.out.println("el resultado es:");
   System.out.println(rojo+"=rojos");
   System.out.println(verde+"=verdes");
   System.out.println(blanco+"=blancos");
    }
public static void main(String[] args) {
    contadorf();
}  
}