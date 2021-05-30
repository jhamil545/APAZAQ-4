import java.util.Scanner;
public class Ejercicio15 {
    
static Scanner teclado=new Scanner(System.in);
static void sueldosemanalN(){
//Definir variables y otros
int ntrab,contador;
double sueldo=0;
String nombre;
//datos de entrada
System.out.println("Introduzca el numero de trabajadores");
ntrab=teclado.nextInt();

//proseso

for ( contador=0; contador<ntrab; contador++) {
    System.out.println("Ingrese el nombre del trabajador "+(contador+1));
    nombre=teclado.next();
    System.out.println("Introduzca su sueldo del trabajador "+nombre);
     sueldo=teclado.nextInt();
    if (sueldo>=0 && sueldo<150) {
        sueldo=(sueldo-(sueldo*0.05));
        System.out.println("el sueldo del trabajador "+contador+"es:"+sueldo);
    }
    if (sueldo>=150 && sueldo<300){
        sueldo=(sueldo-(sueldo*0.07));
        System.out.println("el sueldo del trabajador "+contador+"es:"+sueldo);
    }
    if (sueldo>=300 && sueldo<450){
        sueldo=(sueldo-(sueldo*0.09));
        System.out.println("el sueldo del trabajador "+contador+"es:"+sueldo);
    }
    
}



}
public static void main(String[] arg){
    sueldosemanalN();}
}
