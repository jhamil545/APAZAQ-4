import java.util.Scanner;
class Ejercicio8{
static Scanner teclado=new Scanner(System.in);
static void descuentoproduc(){
//Definir variables y otros

int  nart=0, contador=0; 
double precioj=0,desproduc=0;
//datos de entrada


System.out.println("¿Cuantos articulos comprara?");
nart=teclado.nextInt();
while (contador<=nart) {
    System.out.println("cual es el precio del articulo");
    precioj=teclado.nextInt();
    if(precioj<=200){
        precioj=precioj-(precioj*0.15);
        desproduc=15;
        
     }
    else if (precioj>=100 && precioj<=200){
        precioj=precioj-(precioj*0.12);
        desproduc=12;
        
     }
    else {
        precioj=precioj-(precioj*0.10);
        desproduc=10;
        
     }
     contador++;
}

 //Datos de salida:
System.out.println("su descuento es de: "+desproduc);
System.out.println("el costo total es;"+precioj);
}
public static void main(String[] arg){
    descuentoproduc();
}
}