public class ejerciciosmat {
    
    public void imprimirMatrizCadena(String[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(matriz[f][c]!=null && !matriz[f][c].equals("")){
                    System.out.print(matriz[f][c]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        } 
    }  
    public void transformada06(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matriz[i][j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 6");
        imprimirMatrizCadena(matriz);
    }
    public void transformada07(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 7");
        imprimirMatrizCadena(matriz);
    }
    public void transformada08(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][j+i] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 8");
        imprimirMatrizCadena(matriz);
    }
    public void transformada09(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matriz[i][(dimen-1)-i+j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 9");
        imprimirMatrizCadena(matriz);
    }
    public void transformada10(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matriz[i][i-j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 10");
        imprimirMatrizCadena(matriz);
    }
    public void transformada11(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][(dimen-1)-(j+i)] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 11");
        imprimirMatrizCadena(matriz);
    }
    
    public void transformada12(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][(dimen-1)-j] = ""+numInit;
                 numInit++;
             }
        }
        
        System.out.println("MATRIZ NUMERO 12");
        imprimirMatrizCadena(matriz);
    }
    public void transformada13(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < (matriz.length)-j; i++) {            
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ NUMERO 13");
        imprimirMatrizCadena(matriz);
    }
    public void transformada14(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < 1+j; i++) {            
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ NUMERO 14");
        imprimirMatrizCadena(matriz);
    }
    public void transformada16(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i =4; i > (matriz.length-2)-j; i--) {            
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ NUMERO 16");
        imprimirMatrizCadena(matriz);
    }
 









public static void main(String[] args) {
    ejerciciosmat transf=new ejerciciosmat();
    transf.transformada06(5, 0);
    transf.transformada07(5, 0);
    transf.transformada08(5, 0);
    transf.transformada09(5, 0);
    transf.transformada10(5, 0);
    transf.transformada11(5, 0);
    transf.transformada12(5, 0);
    transf.transformada13(5, 0);
    transf.transformada14(5, 0);
    transf.transformada16(5, 0);

}












}
