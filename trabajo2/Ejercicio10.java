import java.util.Scanner;

public class Ejercicio10 {
    static Scanner teclado=new Scanner(System.in);
    public static void  promediodeedades() {
        int cantalum=1,edadt=0,ndesalon=0,edad;
        double promedad;
        
        System.out.println("ingrese el numero de salones");
        ndesalon=teclado.nextInt();
        for (int contador = 1; contador<=ndesalon; contador++) {
            System.out.println("Ingrese la cantidad de alumnos");
             cantalum=teclado.nextInt();
             for (int i = 1; i<=cantalum; i++) {
                 System.out.println("Ingrese la edad del alumno "+i);
                 edad=teclado.nextInt();
                 edadt=edad+edadt;

                 promedad=edadt/cantalum;
                 System.out.println("El promedio del salon"+contador+" es "+promedad);
             }
    
        }
    }
    
    /*while (contador<=cantalum) {
            System.out.println("Ingrese la edad del alumno: "+(contador-1));
            edadt=teclado.nextInt();
            sumaedad=sumaedad+edadt;
        contador++;
        }  
        promedad=sumaedad/cantalum;
      System.out.println("el promedio de las edades es:"+promedad);  
    }*/
    /*public static  int edaddesalones() {
        int cansalones,contador=1,cantidaddeedades,promescuela;
        System.out.println("Ingrese la cantidad de salones");
        cansalones=teclado.nextInt();
    while (contador<=cansalones) {
            System.out.println("Ingrese las edades del salon: "+(contador-1));
            cantidaddeedades=teclado.nextInt();
            cantidaddeedades=(cansalones/promediodeedades());
             contador++;
        }
        promescuela=
        System.out.println("El promedio de toda la escuela es"+promescuela);
    }*/
    public static void main(String[] args) {
        promediodeedades();
        
    }
}
