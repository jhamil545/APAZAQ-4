import java.util.Scanner;
public class ejem {
    static Scanner teclado=new Scanner(System.in);
    public static void tabla() {
        int num=1;

        for (int i = 0; i < 20; i++) {
        for (int j = 1; j < 10; j++) {
            System.out.println(j+"x"+num+"="+(j*num));
        }
        
        }
    }
    public static void main(String[] args){
        tabla();
    }
}
