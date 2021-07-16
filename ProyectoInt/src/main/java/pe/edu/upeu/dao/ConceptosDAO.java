package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ConceptosTO;
import pe.edu.upeu.modelo.TipoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ConceptosDAO extends AppCrud {
    LeerArchivo  lar;
    TipoTO tipoTO;
    ConceptosTO consTO;
    
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public void registrarConceptos() {
        System.out.println("******Regisrto de Conceptos*******");
        reporteConceptos();//
        consTO=new ConceptosTO();
        consTO.setIdTipo(tre.read("", "Seleccion el ID categoria:"));        
        lar=new LeerArchivo("Concepto.txt");
        consTO.setIdConceptos(generarId(lar, 0, "C", 1));
        consTO.setNombre(tre.read("", "Ingrese el nombre :"));
        lar=new LeerArchivo("Concepto.txt");
        agregarContenido(lar,consTO);
    }

    public void reporteConceptos() {
        lar=new LeerArchivo("Tipo.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {//
            System.out.print(data[i][0]+"="+data[i][1]+", ");
        }
        System.out.println("");
    }
}
