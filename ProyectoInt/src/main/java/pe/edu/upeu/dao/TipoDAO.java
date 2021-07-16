package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.TipoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class TipoDAO extends AppCrud{
    
    LeerArchivo lar;
    TipoTO tipto;

    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarTipo() {
        tipto=new TipoTO();
        lar=new LeerArchivo("Tipo.txt");
        tipto.setIdTipo(generarId(lar,0,"T", 1));
        tipto.setNombre(tre.read("", "Ingrese nombre del tipo:"));
        agregarContenido(lar, tipto);
        
    }

    public void reporteTipo() {
        lar=new LeerArchivo("Tipo.txt");
        imprimirLista(listarContenido(lar));
    }
}


