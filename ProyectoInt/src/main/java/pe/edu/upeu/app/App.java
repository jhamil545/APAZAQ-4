package pe.edu.upeu.app;

import pe.edu.upeu.dao.ConceptosDAO;
import pe.edu.upeu.dao.EgresosDAO;
import pe.edu.upeu.dao.IngresosDAO;
import pe.edu.upeu.dao.ItinerarioViajeDAO;
import pe.edu.upeu.dao.OperacionEgresosDAO;
import pe.edu.upeu.dao.TipoDAO;
import pe.edu.upeu.dao.UsuarioDAO;
import pe.edu.upeu.dao.VehiculoDAO;
import pe.edu.upeu.dao.ZonaDAO;
import pe.edu.upeu.util.LeerTeclado;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;

/**
 * Hello world!
 *
 */
public class App {
    static Ansi color=new Ansi(); 

    public static void menuMain() {
        String mensaje="Seleccion el algoritmo que desea probar:"+
        "\n1=Registrar Zona"+
        "\n2=Registrar Tipo"+
        "\n3=Registrar Vehiculos"+
        "\n4=Registrar Operacion de egresos"+
        "\n5=Registrar Conceptos"+
        "\n6=Registrar Itinerario Viajes"+
        "\n7=Registrar Ingresos"+
        "\n71=Reporte Ingresos por fechas"+
        "\n8=Registrar Egresos"+
        "\n9=Registrar Usuario"+
        "\n10=Reporte Ventas por fechas"+
        "\n0=Salir del sistema"
        ;     
        ZonaDAO zonaDAO;  
        TipoDAO tipDAO; 
        VehiculoDAO vehDAO;
        OperacionEgresosDAO opeDAO;
        ConceptosDAO consDAO;
        ItinerarioViajeDAO itiviDAO;
        IngresosDAO ingresoTO;
        EgresosDAO egresoTO;
        UsuarioDAO usuarioDAO;
       /* UsuarioDAO daoUso;
        ProductoDAO proDao;
        VentaDAO ventDao;*/
        LeerTeclado tre=new LeerTeclado();
        int opciones=tre.read(0, mensaje);         
        do {
            switch (opciones) {
                case 1: zonaDAO=new ZonaDAO(); zonaDAO.registrarZona(); break;
                case 11: zonaDAO=new ZonaDAO(); zonaDAO.reporteZona();; break;
                case 2: tipDAO=new TipoDAO(); tipDAO.registrarTipo(); break;
                case 21: tipDAO=new TipoDAO(); tipDAO.reporteTipo(); break;
                case 3: vehDAO=new VehiculoDAO(); vehDAO.registrarVehiculos(); break;
                case 31: vehDAO=new VehiculoDAO(); vehDAO.reporteVehiculos(); break;
                case 4: opeDAO=new OperacionEgresosDAO(); opeDAO.registrarOPe();  break;   
                case 41: opeDAO=new OperacionEgresosDAO(); opeDAO.reporteOperE();  break;   
                case 5: consDAO=new ConceptosDAO(); consDAO.registrarConceptos();break;
                case 51: consDAO=new ConceptosDAO(); consDAO.reporteConceptos();break; 
                case 6: itiviDAO=new ItinerarioViajeDAO(); itiviDAO.registrarItinerarioViajes();break; 
                case 61: itiviDAO=new ItinerarioViajeDAO(); itiviDAO.mostrarItinerarios();break;
                case 7: ingresoTO=new IngresosDAO(); ingresoTO.ingresos();break;
                case 71: ingresoTO=new IngresosDAO(); ingresoTO.reportarIngresosRangoFecha();break;
                case 8: egresoTO=new EgresosDAO(); egresoTO.egresos();break; 
                case 9: usuarioDAO=new UsuarioDAO(); usuarioDAO.registrarUsuario();  break;
                //case 6: ventDao=new VentaDAO(); ventDao.reportarVentasRangoFecha(); break;   
                default:System.out.println("Opcion no existe");   break;
            }  

            
                if (opciones!=0){ 
                System.out.println();
                String continuar=tre.read("","Desea continuar en el sistemas? SI=S/NO=N ")
                .toUpperCase();
                if(continuar.charAt(0)=='S'){
                    opciones=tre.read(0, mensaje); 
                }else{ opciones=0;}            
                }    
                      
        }while (opciones!=0);
    }

    public static void validAccessSystem() {
        AnsiConsole.systemInstall();
        System.out.println(color.render("@|red ******************* |@ @|green Sistema de Ingresos y Egresos //TAURUS//|@ @|red ******************|@"));
        //System.out.println("******************* Sistema de Ingresos y Egresos //TAURUS// ******************");
        LeerTeclado tr=new LeerTeclado();
        UsuarioDAO uDao=new UsuarioDAO();
        String usuario=tr.read("", "Ingrese su Usuario:");
        System.out.println("Ingrese su clave:");
        char[] clave=System.console().readPassword();
        if (uDao.login(usuario,clave)) {
            menuMain();
        } else {
            System.out.println("Error de autentifiacion.......Intetente nuevamente!!");
            validAccessSystem();
        }
    }


    public static void main( String[] args ){
        //menuMain();
        //AnsiConsole.systemInstall();        
        //System.out.println( color.bgBrightGreen().fg(RED).a("Hello").fg(BLACK).a(" World").reset() );        
        /*System.out.println(color.render("Resumen: @|red Neto Total:S/. |@ @|green "+(Math.round(40.54411*100.0)/100.0)+
        "|@ | @|red IGV: S/.|@ @|green "+(Math.round(15.3333*100.0)/100.0)+"|@  | @|red Monto total: S/. |@ @|green "+
        (Math.round(53.4100*100.0)/100.0)+"|@"));  */ 
        validAccessSystem();
       
    }
}
