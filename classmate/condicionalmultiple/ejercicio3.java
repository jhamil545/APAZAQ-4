package condicionalmultiple;
import java.util.Scanner;
public class ejercicio3 {
    static Scanner teclado=new Scanner(System.in);
    public static void salarioprofesor() {
        //definir variables
        double salario,totalsalario=0;
        String nivel;
        //datos de entrada
        System.out.println("Ingrese su salario");
        salario=teclado.nextDouble();
        System.out.println("Ingrese su nivel");
        nivel=teclado.next();
        //Proceso
        switch (nivel) {
            case "adjunto":totalsalario=salario+(salario*0.035);
                
                break;
            case "auxiliar":totalsalario=salario+(salario*0.041);
                
                break;
            case "asistente":totalsalario=salario+(salario*0.048);
                
                break;
            case "titular":totalsalario=salario+(salario*0.053);
                
                break;
        
            default:System.out.println("error");
                break;
        }
        System.out.println("su salario final es: "+totalsalario+" su nivel es "+nivel);
        
    }
    public static void main(String[] arg){
        salarioprofesor();
    }
}
