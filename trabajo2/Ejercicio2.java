import java.util.Scanner;
public class Ejercicio2 {
    
    int opciones=1;
     static Scanner teclado=new Scanner(System.in);
    public static void hamburguesas() {
     String tarjeta;
     double montoT=0;
       System.out.println("Escoja su hamburguesa");
       String hams="hamurguesa sencilla(S) o dobles(D) o triples(T)"+
        "\n1=S"+
        "\n2=D"+
        "\n3=T"+
        "\n0=Salir";
        System.out.println(hams);
        int opciones=teclado.nextInt();         
        do {
            switch (opciones) {
                case 1:montoT=montoT+(20);
                     break;
                case 2:montoT=montoT+(25);
                     break;
                case 3:montoT=montoT+(28);
                     break;       
                default:System.out.println("Opcion no existe");  
                     break;
            }            
            if (opciones!=0){ 
            System.out.println("¿Desea otra haburguesa? "+hams);
            opciones=teclado.nextInt(); 
            } 
            //opciones++;           
        }   
        while (opciones!=0);
        System.out.println("¿Desea pagar con tarjeta?");
        tarjeta=teclado.next();
        if (tarjeta.equals("SI")) {
             montoT=montoT+(montoT*0.05);
        }
        System.out.println("el costo final es"+montoT);
    }
    public static void main(String[] args) {
        hamburguesas();
}
}
