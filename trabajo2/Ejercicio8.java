import java.util.Scanner;
class Ejercicio8{
static Scanner teclado=new Scanner(System.in);
static void descuentoproduc(){

//Definir variables y otros
int  nart=1; 
double precioj=0,preciot=0;
String desproduc="";

//datos de entrada
System.out.println("¿Cuantos articulos comprara?");
nart=teclado.nextInt();

//proseso
for (int i = 1; i <=nart; i++) {
    System.out.println("cual es el precio del articulo "+i);
        precioj=teclado.nextInt();

    if(precioj>=200){
        
        //preciot=precioj-(precioj*0.15);
        desproduc="15 %";
        System.out.println("su descuento es de: "+desproduc);
        System.out.println("el costo de este articulo es:"+(precioj-(precioj*0.15)));
        preciot=(precioj-(precioj*0.15))+preciot;
     }
    if (precioj>=100 && precioj<=199){
        
        //preciot=precioj-(precioj*0.12);
        desproduc="12 %";
        System.out.println("su descuento es de: "+desproduc);
        System.out.println("el costo de este articulo es:"+(precioj-(precioj*0.12)));
        preciot=(precioj-(precioj*0.12))+preciot;
     }
    if (precioj<=100) {
       
        //preciot=precioj-(precioj*0.10);
        desproduc="10 %";
        System.out.println("su descuento es de: "+desproduc);
        System.out.println("el costo de este articulo es:"+(precioj-(precioj*0.10)));
        preciot=(precioj-(precioj*0.10))+preciot;
     }
     
}


 //Datos de salida:

System.out.println("el costo total es:"+preciot);
}
public static void main(String[] arg){
    descuentoproduc();
}
}