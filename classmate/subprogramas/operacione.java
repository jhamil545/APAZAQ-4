package subprogramas;

public class operacione {
    
    public int suma(int a, int b) {
        int suma=a+b;
        return suma;
    }
    public int resta(int a, int b) {
        int resta=a-b;
        return resta;
    }
    public int multiplicacion(int a, int b) {
        int multiplicacion=a*b;
        return multiplicacion;
    }
    public int division(int a, int b) {
       int division=a/b;
       return division;  
    }
    public void operaciones(int suma,int resta,int multiplicacion,int division) {
        System.out.println("la suma es"+suma);
        System.out.println("la resta es"+resta);
        System.out.println("la multiplicacion es"+multiplicacion);
        System.out.println("la division es"+division);

        
    }
}
