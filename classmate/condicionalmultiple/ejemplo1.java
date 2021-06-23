package condicionalmultiple;
import java.util.Scanner;
public class ejemplo1 {
    static Scanner teclado=new Scanner(System.in);
    public static void sueldo() {
        //definir variables
        int horasextra,categoria;
        double sueldo,sueldofinal=0;
        //datos de entrada
        System.out.println("Ingrese su sueldo");
        sueldo = teclado.nextDouble();
        System.out.println("Cuantas horas extras tiene");
        horasextra= teclado.nextInt();
        System.out.println("Cual es su categoria: 1-2-3-4");
        categoria=teclado.nextInt();
        
        //proceso
        switch (categoria) {
            case 1:sueldofinal=sueldo+(horasextra*30);
                
                break;
            case 2:sueldofinal=sueldo+(horasextra*38);
                
                break;
            case 3:sueldofinal=sueldo+(horasextra*50);
                
                break;
            case 4:sueldofinal=sueldo+(horasextra*70);
                
                break;    
        
            default:System.out.println("opcion no valida");
                break;
        }
        System.out.println("Su sueldo es de "+sueldofinal);
        
    }
    public static void main(String[] arg){
        sueldo();
    }
}
