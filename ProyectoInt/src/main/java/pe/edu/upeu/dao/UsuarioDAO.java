package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class UsuarioDAO extends AppCrud{
    LeerArchivo lar;
    UsuarioTO usuTO;

    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX(); 

    public void registrarUsuario() {
        usuTO=new UsuarioTO();
        String usuario=tre.read("", "Ingrese un usuario").toLowerCase();
        if (validExist(usuario)) {
            usuTO.setUsuario(usuario);
        usuTO.setPerfil(tre.read("","Ingrese el perfil(ADMIN,SECRETARIO)").toUpperCase());
        lar = new LeerArchivo("Usuario.txt");
        usuTO.setIdUsuario(generarId(lar, 0, "U", 1));
        Console cons=System.console();
        System.out.println("Ingrese su clave");
        char[] clave=cons.readPassword();
        usuTO.setClave(String.valueOf(clave));
        lar=new LeerArchivo("Usuario.txt");
        agregarContenido(lar, usuTO);
        } 
        else {
            System.out.println("El usuario ya existe intenta con otro usuario");
            registrarUsuario();
        }
        
        }

        public boolean validExist(String usuario) {
            lar=new LeerArchivo("Usuario.txt");
            Object[][] data=buscarContenido(lar, 1, usuario);
            if (data!=null && data.length>0) {
                return false;
            }        
            return true;
        }

        public boolean login(String usuario, char[] clave) {
            lar=new LeerArchivo("Usuario.txt");
            Object[][] data=buscarContenido(lar, 1, usuario);
            if (data!=null && data.length==1 && data[0][2].equals(String.valueOf(clave))) {
                return true;
            }
            return false;
        }

        }