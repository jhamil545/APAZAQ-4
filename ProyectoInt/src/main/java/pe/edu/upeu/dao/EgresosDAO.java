package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ConceptosTO;
import pe.edu.upeu.modelo.EgresosTO;
import pe.edu.upeu.modelo.OperacionEgresosTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class EgresosDAO extends AppCrud{
    LeerArchivo  lar;
    ConceptosTO consTO;
    EgresosTO egresoTO;
    OperacionEgresosTO opeTO;
    
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");  
    
    public void egresos() {
        System.out.println("******Regisrto de Egresos*******");
        mostrarCategoriaConceptos();
        egresoTO=new EgresosTO();
        egresoTO.setIdConceptos(tre.read("", "Indique el concepto:"));
        mostrarCategoria();
        egresoTO.setIdOperacionEgreso(tre.read("", "Indique la operacion egreso:"));
        mostrarCategoriaIT();
        egresoTO.setIdItineraio(tre.read("", "Indique el itinerario:"));         
        lar=new LeerArchivo("Egresos.txt");
        egresoTO.setIdOperacion(generarId(lar, 0, "E", 1));
        egresoTO.setFecha(formatoFecha.format(new Date()));
        egresoTO.setMonto(tre.read(0.0,"Ingrese el monto del egreso"));
        lar=new LeerArchivo("Egresos.txt");
        agregarContenido(lar,egresoTO);
    }

    public void mostrarCategoria() {
        lar=new LeerArchivo("OperacionEgreso.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {//
            System.out.print(data[i][0]+"="+data[i][1]+", ");
        }
        System.out.println("");
    }
    public void mostrarCategoriaConceptos() {
        lar=new LeerArchivo("Concepto.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {//
            System.out.print(data[i][0]+"="+data[i][1]+"-"+data[i][2]+", ");
        }
        System.out.println("");
    }
    public void mostrarCategoriaIT() {
        lar=new LeerArchivo("Itinerario.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {//
            System.out.print(data[i][0]+"="+data[i][1]+" Hrs "+data[i][1]+", ");
        }
        System.out.println("");
    }
}
