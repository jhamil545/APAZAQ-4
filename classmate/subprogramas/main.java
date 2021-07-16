package subprogramas;

public class main {
    public static void main(String[] args){
        int n1= Integer.parseInt("digite el primer numero");
        int n2= Integer.parseInt("digite el segundo numero");

        operacione jn=new operacione();
        System.out.println("la suma es: " +jn.suma(n1, n2)); 
        System.out.println("la resta es: "+jn.resta(n1, n2));
        System.out.println("la multiplicacion es:"+jn.multiplicacion(n1, n2)); 
        System.out.println("la division es:"+jn.division(n1, n2)); 
        





    }
}
