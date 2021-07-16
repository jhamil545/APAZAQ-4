package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.OperacionEgresosTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class OperacionEgresosDAO extends AppCrud {
    LeerArchivo lar;
    OperacionEgresosTO opeTO;

    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarOPe() {
        opeTO=new OperacionEgresosTO();
        lar=new LeerArchivo("OperacionEgreso.txt");
        opeTO.setIdOperEgre(generarId(lar,0,"OE", 2));
        opeTO.setNombre(tre.read("", "Ingrese el tipo de operacion egreso:"));
        agregarContenido(lar, opeTO);
        
    }

    public void reporteOperE() {
        lar=new LeerArchivo("OperacionEgreso.txt");
        imprimirLista(listarContenido(lar));
    }
}
