package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ZonaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ZonaDAO extends AppCrud{
    LeerArchivo lar;
    ZonaTO zonaTO;

    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarZona() {
        zonaTO=new ZonaTO();
        lar=new LeerArchivo("Zona.txt");
        zonaTO.setIdZona(generarId(lar,0,"Z", 1));
        zonaTO.setLugarOrigen(tre.read("", "Ingrese lugar de origen:"));
        zonaTO.setLugarDestino(tre.read("", "Ingrese lugar destino:"));
        zonaTO.setPasajeReferencia(tre.read(0.0, "Ingrese costo del Pasaje:"));
        agregarContenido(lar, zonaTO);
        
    }

    public void reporteZona() {
        lar=new LeerArchivo("Zona.txt");
        imprimirLista(listarContenido(lar));
    }
}
