/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;
import java.util.Scanner;
/**
 *
 *  @author julio
 */
public class Sistema {
       /**
     * @param args the command line arguments
     */
//    private static ArrayList<Usuario> listaUsuario;
    public static ArrayList<Usuario> listaUsuario;
    private static ArrayList<Reserva> listaReserva;
    private static ArrayList<String> itinerarios = ManejoArchivos.LeeFichero("itinerarios.txt");
    private static ArrayList<String> vuelos = ManejoArchivos.LeeFichero("vuelos.txt");

    public static void main(String[] args) {
        // TODO code application logic here
        cargarUsuario("usuarios.txt","clientes.txt","operadores.txt");
        Usuario usu = iniciarSesion();
        String rol = usu.getRol(); //se necesita el get

        Itinerario iti = new Itinerario(itinerarios);
        Vuelo vue = new Vuelo(vuelos, itinerarios);

//        System.out.println(iti);
//        System.out.println(vue);

    }
 //getters y setters

    //Cargar datos de txt a las ArrayList de Usuario, Vuelos, etc
    public static void cargarUsuario(String archivoUsuario, String archivoClientes, String archivoOperadores) {

        ArrayList<String> lineasU = ManejoArchivos.LeeFichero(archivoUsuario); 
        lineasU.remove(0);
        
        ArrayList<String> lineasC = ManejoArchivos.LeeFichero(archivoClientes); 
        lineasC.remove(0);
        
        ArrayList<String> lineasO = ManejoArchivos.LeeFichero(archivoOperadores); 
        lineasO.remove(0);
       
        ArrayList<String> cedulasLU = new ArrayList(); //archivo usuarios.txt
        ArrayList<String> nombresL = new ArrayList();
        ArrayList<String> edadesL = new ArrayList(); 
        ArrayList<String> mailsL = new ArrayList();
        ArrayList<String> usersL = new ArrayList();
        ArrayList<String> paswordsL = new ArrayList();
        ArrayList<String> rolesL = new ArrayList();
        
        for (String l:lineasU){
            String[] datos = l.split(",");
            cedulasLU.add(datos[0]);
            nombresL.add(datos[1]);
            edadesL.add(datos[2]);
            mailsL.add(datos[3]);
            usersL.add(datos[4]);
            paswordsL.add(datos[5]);
            rolesL.add(datos[6]);
        }
        
        ArrayList<String> cedulasLC = new ArrayList(); //archivo clientes.txt
        ArrayList<String> numTarjetasL = new ArrayList();
        ArrayList<String> tipoVIPL = new ArrayList();
        ArrayList<String> millasL = new ArrayList();
        
        for (String l:lineasC){
            String[] datos = l.split(",");
            cedulasLC.add(datos[0]);
            numTarjetasL.add(datos[1]);
            tipoVIPL.add(datos[2]);
            millasL.add(datos[3]);
        }
        
        ArrayList<String> cedulasLO = new ArrayList(); //archivo operadores.txt
        ArrayList<String> sueldosL = new ArrayList();
        
        for (String l:lineasO){
            String[] datos = l.split(",");
            cedulasLO.add(datos[0]);
            sueldosL.add(datos[1]);
        }

        //crear los Clientes, Operadores y Clientes VIP y anadirlos a listaUsuario
        for (int i=0;i<=cedulasLU.size()-1;i++) {
            
            String r = rolesL.get(i);
            
            if (r.equals("S")){
                
                String cedula = cedulasLU.get(i);
                String nombres = nombresL.get(i);
                int edad = Integer.parseInt(edadesL.get(i));
                String mail = mailsL.get(i);
                String user = usersL.get(i);
                String password = paswordsL.get(i);
                String numTarjeta = "t";
                char rol = 'S';
                for (int j=0;j<=cedulasLC.size()-1;j++){
                    String ced = cedulasLC.get(j);
                    if (ced.equals(cedula)){
                        numTarjeta = numTarjetasL.get(j);
                    }
                }

                Cliente cliente = new Cliente (cedula, nombres, edad, mail, user, password, rol, numTarjeta); //constructor necesario
                listaUsuario.add(cliente);
                
            } if (r.equals("V")) {
                
                String cedula = cedulasLU.get(i);
                String nombres = nombresL.get(i);
                int edad = Integer.parseInt(edadesL.get(i));
                String mail = mailsL.get(i);
                String user = usersL.get(i);
                String password = paswordsL.get(i);
                String numTarjeta = "t";
                String tipoVIP = "v";
                int millas = 0;
                char rol = 'V';
                for (int j=0;j<=cedulasLC.size()-1;j++){
                    String ced = cedulasLC.get(j);
                    if (ced.equals(cedula)){
                        numTarjeta = numTarjetasL.get(j);
                        tipoVIP = tipoVIPL.get(j);
                         millas = Integer.parseInt(millasL.get(j));
                    }
                }
                ClienteVIP clienteVip = new ClienteVIP (nombres, edad, mail, user, password, rol, numTarjeta, tipoVIP, millas); //necesita constructor 
                listaUsuario.add(clienteVip);
                
            } if (r.equals("O") ) {
                
                String cedula = cedulasLU.get(i);
                String nombres = nombresL.get(i);
                int edad = Integer.parseInt(edadesL.get(i));
                String mail = mailsL.get(i);
                String user = usersL.get(i);
                String password = paswordsL.get(i);
                double sueldo = 0;
                for (int j=0;j<=cedulasLO.size()-1;j++){
                    String ced = cedulasLO.get(j);
                    if (ced.equals(cedula)){
                        sueldo = Double.parseDouble(millasL.get(j));
                    }
                }
                Operador operador = new Operador (nombres, edad, mail, user, password, rol, sueldo); //necesita constructor 
                listaUsuario.add(operador);
            }

        }
}
   
    public static Usuario iniciarSesion(){

        System.out.println("+++++++++++++++++++++++++++++++++++\n");
        System.out.println("\n             BIENVENIDO AL SISTEMA                     \n");
        System.out.println("+++++++++++++++++++++++++++++++++++\n");

        boolean val = false;
        while (val!=true){

            Scanner sc = new Scanner(System.in);
            System.out.println("USUARIO: ");
            String u = sc.nextLine();
            System.out.println("CONTRASEÑA: ");
            String p = sc.nextLine();

             for (Usuario usuario:listaUsuario){
                if (u.equals(usuario.getUsuario())){ //se necesita el getter
                    String pCorrecta = usuario.getContrasena(); //se necesita el getter
                    if (p.equals(pCorrecta)){
                        val = true;
                        System.out.println("Inicio de Sesión Correcto.\n");
                        return usuario;
                    } else {
                        System.out.println("Contraseña o Usuario incorrectos. Intente de nuevo.\n");
                    }
                }
            }
        }


        }
    
    public static void mostrarMenu(){
        
    }
}

