package pe.edu.upeu.jnaq.examen;


import pe.edu.upeu.jnaq.utils.LeerTeclado;

public class ResoluciondelExamen {
    LeerTeclado teclado=new LeerTeclado();
 //ejercicio 2
    public  void Automotriz() {
        //Declarar Variables
        int categoria, cant1=0,imp1=12,imp2=8,imp3=5,impt1=0,impt2=0,impt3=0;
        //Datos de entrada, prceso y salida
        do {
            categoria=teclado.leer(0,"¿Que categoria es su auto: 1-2-3 o 0 para finalizar?");
            
        switch (categoria) {
            case 1:
                cant1=teclado.leer(0,"cuantos vehiculos tiene de categoria 1");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp1+"% de su valor");
                impt1=impt1+imp1;
                }
                
                System.out.println("De toda la categoria se pagara"+impt1+"% de su valor");
                break;
            case 2:
                cant1=teclado.leer(0,"cuantos vehiculos tiene de categoria 2");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp2+"% de su valor");
                impt2=impt2+imp2;
               }
               System.out.println("De toda la categoria se pagara"+impt2+"% de su valor");
                break;
            case 3:
                cant1=teclado.leer(0,"cuantos vehiculos tiene de categoria 3");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp3+"% de su valor");
                impt3=impt3+imp3;
                }
                System.out.println("De toda la categoria se pagara"+impt3+"% de su valor");
                break;
            default:System.out.println("Opcion incorrecta--escoja entre 1-2-3 o 0 si desea salir");
                break;
        }
     
        }
        
        
    while (categoria!=0);
    
 }  
 //ejercicio 3
    public  void tabla() {
          //Declarar Variables
        int num=1;
        //proceso 
        for (int i = 0; i <20; i++) {
        for (int j = 1; j <=10; j++) {
            System.out.println(num+"x"+j+"="+(j*num));
            
        }
        num=num+1;
        System.out.println("-----------------------");
        }
    }

     //ejercicio 4
    public  void numerosperfectos() {
          //Declarar Variables
        int nu,contn=1,suma=0;
        //Datos de entrada
        nu=teclado.leer(0,"Indique el numero");
            while
            (contn<nu) {
            
              if (nu % contn == 0) {
                System.out.println (contn);
                suma=suma+contn;
              }  
           
          contn++;  
        
        }
        System.out.println(suma);
        if (suma==nu) {
            System.out.println("El numero "+suma+" es perfecto");
        }
        else {
            System.out.println("El numero  no es perfecto");
        }
        
    } 
        
    
    
   
     //ejercicio 5

    public void exponenten() {
    //Declarar Variables
     int base,exponente;
     //Datos de entrada
     base=teclado.leer(0,"Ingrese la base ");
     exponente=teclado.leer(0,"Ingrese el exponente ");
    //proceso
     System.out.println(base+"^"+exponente+"="+recursividad(base,exponente));

        }
    public double recursividad(int base,int exponente) {
        if (exponente==0) {
        return 1;
         }
        else{
        return base*recursividad(base,exponente-1);
         }
    }



}
