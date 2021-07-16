package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ConceptosTO;
import pe.edu.upeu.modelo.IngresosTO;
import pe.edu.upeu.modelo.ItinerarioViajesTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;

public class IngresosDAO extends AppCrud {
        Ansi color=new Ansi();
        LeerArchivo  lar;
        ConceptosTO consTO;
        IngresosTO ingresoTO;
        ItinerarioViajesTO itiviTO;
        
        LeerTeclado tre=new LeerTeclado();
        UtilsX ut=new UtilsX();
        SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");  
        
        public void ingresos() {
            System.out.println("******Regisrto de Ingresos*******");
            mostrarCategoriaConceptos();
            ingresoTO=new IngresosTO();
            ingresoTO.setIdConceptos(tre.read("", "Indique el concepto:"));
            mostrarCategoria();
            ingresoTO.setIdItineraio(tre.read("", "Indique el itinerario:"));         
            lar=new LeerArchivo("Ingresos.txt");
            ingresoTO.setIdOperacion(generarId(lar, 0, "I", 1));
            ingresoTO.setFecha(formatoFecha.format(new Date()));
            lar=new LeerArchivo("Itinerario.txt");
            Object[][] datait=buscarContenido(lar, 0, ingresoTO.getIdItineraio());
            lar=new LeerArchivo("Zona.txt");
            Object[][] dataZ=buscarContenido(lar, 0, datait[0][4].toString());
            ingresoTO.setMonto(Double.parseDouble(datait[0][5].toString())*Double.parseDouble(dataZ[0][3].toString()));

            lar=new LeerArchivo("Ingresos.txt");
            System.out.println("xd"+ingresoTO.getMonto());
            agregarContenido(lar,ingresoTO);
        }
    
        public void mostrarCategoria() {
            lar=new LeerArchivo("Itinerario.txt");
            Object[][] data=listarContenido(lar);
            for (int i = 0; i < data.length; i++) {//
                System.out.print(data[i][0]+"="+data[i][1]+" Hrs "+data[i][2]+", ");
            }
            System.out.println("");
        }
        public void mostrarCategoriaConceptos() {
            lar=new LeerArchivo("Concepto.txt");
            Object[][] data=listarContenido(lar);
            for (int i = 0; i < data.length; i++) {//
                System.out.print(data[i][0]+"="+data[i][2]+",");
            }
            System.out.println("");
        }
        public void reportarIngresosRangoFecha(){
            AnsiConsole.systemInstall();
            lar=new LeerArchivo("Ingresos.txt");
            System.out.println("************************Reporte de ventas por fechas*************************");
            String fechaInit=tre.read("", "Ingrese la fecha de Inicio (dd-MM-yyyy):");
            String fechaFin=tre.read("", "Ingrese fecha final (dd-MM-yyyy):");
            Object[][] dataV=listarContenido(lar);
            int cantidadFi=0;
            try {
                for (int i = 0; i < dataV.length; i++) {
                    String[] dataFechaV=String.valueOf(dataV[i][2]).split(" ");
                    if ((formatoFecha.parse(dataFechaV[0].toString()).after(formatoFecha.parse(fechaInit)) || 
                        dataFechaV[0].equals(fechaInit))   && (
                            formatoFecha.parse(dataFechaV[0].toString()).before(formatoFecha.parse(fechaFin)) || 
                        dataFechaV[0].equals(fechaFin)
                        )) {
                            cantidadFi++;
                    }
                }
                System.out.println("Cantidad:"+cantidadFi);
                Object[][] dataRealRF=new Object[cantidadFi][dataV[0].length];
                cantidadFi=0;
                double netoTotalX=0, igvX=0, precioTotalX=0;
    
                for (int i = 0; i < dataV.length; i++) {
                    String[] dataFechaV=String.valueOf(dataV[i][2]).split(" ");
                    if ((formatoFecha.parse(dataFechaV[0].toString()).after(formatoFecha.parse(fechaInit)) || 
                        dataFechaV[0].equals(fechaInit))   && (
                            formatoFecha.parse(dataFechaV[0].toString()).before(formatoFecha.parse(fechaFin)) || 
                        dataFechaV[0].equals(fechaFin)
                        )) {
                            for (int j = 0; j < dataV[0].length; j++) {
                                dataRealRF[cantidadFi][j]=dataV[i][j];   
                                if (j==3) { netoTotalX=netoTotalX+Double.parseDouble(dataV[i][j].toString()); }
                                if (j==4) { igvX=igvX+Double.parseDouble(dataV[i][j].toString()); }
                                if (j==5) { precioTotalX=precioTotalX+Double.parseDouble(dataV[i][j].toString()); }
                            }
                            cantidadFi++;
                    }
                }
    
                ut.clearConsole();
                System.out.println("*******************Reporte de Ventas*****************");
                System.out.println("--------Entre "+fechaInit+" a "+fechaFin+"------------");
                ut.pintarLine('H', 40);         
                ut.pintarTextHeadBody('H', 3, "ID,FECHA,IDCONCEPTO,IDITINERARIO.,MONTO S/.");              
                System.out.println(""); 
                ut.pintarLine('H', 40);            
                for (Object[] objects : dataRealRF) {
                    String datacontent=""+objects[0]+","+objects[1]+","+objects[2]+","+
                    objects[3]+","+objects[4]+","+objects[5];
                    ut.pintarTextHeadBody('B', 3, datacontent);
                }            
                ut.pintarLine('H', 40);
                System.out.println(" | Importe Total S/."+(Math.round(precioTotalX*100.0)/100.0));
                ut.pintarLine('H', 40);
                System.out.println(color.render("Resumen: @|red monto :S/. |@ @|green "+(Math.round(40.54411*100.0)/100.0)+
                "|@ | @|red IGV: S/.|@ @|green "+(Math.round(15.3333*100.0)/100.0)+"|@"));
                
                
            } catch (Exception e) {
                System.out.println("Error-------"+e.getMessage());
            }
    
        }
}
