package repetitiva;

public class ejemplo3 {
    public static void cuadradodedos() {
        double numero=1;
    
        for (int contador=1; contador<=10; contador++) {
            numero=numero+numero;
            System.out.println("dos a la "+contador+" es: "+numero);
            
        
        }
        
       // System.out.println("dos a la 10 es: "+numero);
    }
    public static void main(String[] args) {
        cuadradodedos();  
     }
}
