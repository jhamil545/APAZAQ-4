import pe.edu.upeu.SubPrograma;
import pe.edu.upeu.recur.EjemplosRecursivos;
import pe.edu.upeu.util.TecladoRead;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SubPrograma obsjn=new SubPrograma();
        //obsjn.calcularFuncionExponecial();
        EjemplosRecursivos obsj=new EjemplosRecursivos();
        TecladoRead objn=new TecladoRead();
        int numero=objn.leer(0, "Indroducir un numero:");
        //System.out.println("Factorial iterativo: "+obsj.factorialBig(numero)); 
        //System.out.println("Factorial Recursivo: "+obsj.factorialBigRecur(numero)); 
        long ti=System.currentTimeMillis();
        System.out.println("Fibonaci iterativo: "+obsj.fibonaci(numero));
        long tf=System.currentTimeMillis();
        System.out.println("tiempo iterativo: "+(tf-ti));

        ti=System.currentTimeMillis();
        System.out.println("Fibonaci Recursivo: "+obsj.fibonaciRecur(numero));
        tf=System.currentTimeMillis();
        System.out.println("tiempo Recursivo:"+(tf-ti));
    }
}
