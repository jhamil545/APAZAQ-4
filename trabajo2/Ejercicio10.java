import java.util.Scanner;

public class Ejercicio10 {
    static Scanner teclado=new Scanner(System.in);
    public static void  promediodeedades() {
        //definir variables
        int cantalum=1,edadt=0,ndesalon=0,edad;
        double promedad=0,promediototal=0;
        //Datos de entrada
        System.out.println("ingrese el numero de salones");
        ndesalon=teclado.nextInt();
        //Proceso
        for (int contador = 1; contador<=ndesalon; contador++) {
            System.out.println("Ingrese la cantidad de alumnos");
             cantalum=teclado.nextInt();
             for (int i = 1; i<=cantalum; i++) {
                 System.out.println("Ingrese la edad del alumno "+i);
                 edad=teclado.nextInt();
                 edadt=edad+edadt;

                 promedad=edadt/cantalum;
                 
             }
       edadt=0;
       //Datos de salida
       System.out.println("El promedio del salon"+contador+" es "+promedad);
       promediototal=promedad+promediototal;
        }
        promediototal=promediototal/ndesalon;
        System.out.println("el promedio de todos los salones es: "+promediototal);
    }
    
    
    public static void main(String[] args) {
        promediodeedades();
        
    }
}
