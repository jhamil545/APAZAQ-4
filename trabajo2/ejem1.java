import java.util.Scanner;
public class ejem1 {
    static Scanner teclado=new Scanner(System.in);
    public static void fdpadres() {
        
        String nombre,ndehijo="JHAMIL NOE APAZA QUISPE";
        System.out.println("Ingrese su nombre");
        nombre=teclado.next();
      if (nombre.equals("GILDARDO")) {
          System.out.println("Introduce tu nombre completo");
          String nombrecom=teclado.next();
        String mensaje="¡¡¡FELIZ DIA PAPÁ!!!"+
        "\nPara el mejor papá del mundo: "+nombrecom+
        "\nHola papá se que ya pasó el dia del padre pero eso no me inpide a decirte lo mucho que te quiero, en todo momento siempre me apoyaste hoy en dia a ser mejor para  la vida.  "+
        "\nMuchas gracias PAPÁ"+
        "\nDe tu hijo: "+ndehijo;
        System.out.println(mensaje);
      } 
      else{
System.out.println("no es el nombre correcto");
System.out.println("Si eres padre, ¡feliz dia del padre!");
      } 
    }
    public static void main(String[] args) {
        fdpadres() ;
}
}
