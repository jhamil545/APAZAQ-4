import java.util.Scanner;

public class Ejercicio10 {
    static Scanner teclado=new Scanner(System.in);
    public int  promediodeedades(int sumaedad) {
        int cantalum=1,contador=1,edadt=0,sumaedad=;
        double promedad;
        System.out.println("Ingrese la cantidad de alumnos");
        cantalum=teclado.nextInt();
        while (contador<=cantalum) {
            System.out.println("Ingrese la edad del alumno: "+(contador-1));
            edadt=teclado.nextInt();
            sumaedad=sumaedad+edadt;
        contador++;
        }  
        promedad=sumaedad/cantalum;
      System.out.println("el promedio de las edades es:"+promedad);  
    }
    public static  int edaddesalones() {
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
    }
    public static void main(String[] args) {
        //promediodeedades();
        edaddesalones();
    }
}
