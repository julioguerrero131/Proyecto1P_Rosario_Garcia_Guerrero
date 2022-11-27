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
    public static ArrayList<Usuario> listaUsuario;
    public static ArrayList<Asiento> listaAsiento;
    public static ArrayList<Itinerario> listaItinerario;
    public static ArrayList<Vuelo> listaVuelo;
    public static ArrayList<Avion> listaAvion;
    

    
    public static void main(String[] args) {
        // TODO code application logic here 
        cargarUsuario("usuarios.txt","clientes.txt","operadores.txt");
        cargarAsiento("asientos.txt");
        cargarItinerario("itinerarios.txt");
        cargarVuelo("vuelos.txt");
        Usuario usu = iniciarSesion();
        mostrarMenu(usu);

//        System.out.println(iti);
//        System.out.println(vue);

    }

    public static ArrayList<String> getItinerarios() {
        return itinerarios;
    }

    public static void setItinerarios(ArrayList<String> itinerarios) {
        Sistema.itinerarios = itinerarios;
    }

    public static ArrayList<String> getVuelos() {
        return vuelos;
    }

    public static void setVuelos(ArrayList<String> vuelos) {
        Sistema.vuelos = vuelos;
    }

    
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
                char rol= 'V';
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
    
    public static void cargarAsiento(String archivoAsiento){
        
         ArrayList<String> lineasA = ManejoArchivos.LeeFichero(archivoAsiento); 
        lineasA.remove(0);
        
        ArrayList<String> codigoAvionL = new ArrayList(); //archivo asientos.txt
        ArrayList<String> numAsientoL = new ArrayList();
        ArrayList<String> disponibleL = new ArrayList(); 
        
        for (String l:lineasA){
            String[] datos = l.split(",");
            codigoAvionL.add(datos[0]);
            numAsientoL.add(datos[1]);
            disponibleL.add(datos[2]);
        }
        
        for (int i=0;i<codigoAvionL.size()-1;i++) {
            String cod = codigoAvionL.get(i);
            String num = numAsientoL.get(i);
            Disponibilidad dis = Disponibilidad.valueOf(disponibleL.get(i));
            Asiento asiento = new Asiento(cod, num, dis);
            listaAsiento.add(asiento);
        }
    }
    
    public static void cargarItinerario(String archivoItineario){
        ArrayList<String> lineasI = ManejoArchivos.LeeFichero(archivoItineario); 
        lineasI.remove(0);
        
        ArrayList<String> codigoL = new ArrayList(); //archivo itinerarios.txt
        ArrayList<String> origenL = new ArrayList();
        ArrayList<String> destinoL = new ArrayList(); 
        ArrayList<String> horaSalidaL = new ArrayList(); 
        ArrayList<String> horaLlegadaL = new ArrayList(); 
        ArrayList<String> duracionL = new ArrayList(); 
        
        for (String l:lineasI){
            String[] datos = l.split(",");
            codigoL.add(datos[0]);
            origenL.add(datos[1]);
            destinoL.add(datos[2]);
            horaSalidaL.add(datos[3]);
            horaLlegadaL.add(datos[4]);
            duracionL.add(datos[5]);

        }
        
        for (int i=0;i<codigoL.size()-1;i++) {
            String cod = codigoL.get(i);
            String ori = origenL.get(i);
            String des = origenL.get(i);
            String hS = horaSalidaL.get(i);
            String hL = horaLlegadaL.get(i);
            String dur = duracionL.get(i);
            Itinerario itinerario = new Itinerario(cod, ori, des, hS, hL, dur);
            listaItinerario.add(itinerario);
        }
    }
    
    public static void cargarVuelo(String archivoVuelo){
        ArrayList<String> lineasI = ManejoArchivos.LeeFichero(archivoVuelo); 
        lineasI.remove(0);
        
        ArrayList<String> codigoL = new ArrayList(); //archivo itinerarios.txt
        ArrayList<String> codigoAvionL = new ArrayList();
        ArrayList<String> fechaSalidaL = new ArrayList(); 
        ArrayList<String> fechaLlegadaL = new ArrayList(); 
        ArrayList<String> codigoItinerarioL = new ArrayList(); 
        ArrayList<String> precioL = new ArrayList(); 
        ArrayList<String> precioMillasL = new ArrayList(); 
        
        for (String l:lineasI){
            String[] datos = l.split(",");
            codigoL.add(datos[0]);
            codigoL.add(datos[0]);

        }
        
        for (int i=0;i<codigoL.size()-1;i++) {
            String cod = codigoL.get(i);
            String codA = codigoAvionL.get(i);
            Avion av = null;
            for (Avion a:listaAvion){
                if (codA.equals(a.getCodigo())){ //SE NECESITA EL GET
                    av=a;
                }
            }
            String fS = fechaSalidaL.get(i);
            String fL = fechaLlegadaL.get(i);
            String codI = codigoItinerarioL.get(i);
            Itinerario it = null;
            for (Itinerario iti:listaItinerario){
                if (codI.equals(it.getCodigo())){ //SE NECESITA EL GET
                    it = iti;
                }
            }
            String p = precioL.get(i);
            String pM = precioMillasL.get(i);
            Vuelo vuelo = new Vuelo(cod, av, fS, fL, codI, it);
            listaVuelo.add(vuelo);
        }
    }
   
    public static Usuario iniciarSesion(){ //corregir

        System.out.println("+++++++++++++++++++++++++++++++++++\n");
        System.out.println("\n             BIENVENIDO AL SISTEMA                     \n");
        System.out.println("+++++++++++++++++++++++++++++++++++\n");

        boolean val = false;
        Usuario us = null;
        while (val!=true){

            Scanner sc = new Scanner(System.in);
            System.out.println("USUARIO: ");
            String u = sc.nextLine();
            System.out.println("CONTRASEÑA: ");
            String p = sc.nextLine();
            

             for (Usuario usuario:listaUsuario){
                if (u.equals(usuario.getUser())){ //se necesita el getter
                    String pCorrecta = usuario.getPassword(); //se necesita el getter
                    if (p.equals(pCorrecta)){
                        val = true;
                        System.out.println("Inicio de Sesión Correcto.\n");
                        us=usuario;
                    } else {
                        System.out.println("Contraseña o Usuario incorrectos. Intente de nuevo.\n");
                    }
                }
            }
        }
        return us;

     }
    
    public static void mostrarMenu(Usuario usuario){
        Scanner sc = new Scanner(System.in);
        char rol = usuario.getRol();
        if ( rol=='S' || rol=='V' ){ //son char por lo que se puede usar ==
            
            System.out.println("1. Comprar tickets aereos");
            System.out.println("2. Consultar reservas");
            System.out.println("3. Salir");
            System.out.println("Escriba el numero de la opción que escogio:");
            int op = sc.nextInt();
            sc.nextLine();
            
            switch (op){ 
                
                case 1: //Comprar tickets aereos
                    
                    //Arraylist<Vuelo> vuelosE= new ArryaList();
                    int cont = 1;
                    System.out.println("----------ORIGEN-----------");
                    for (Itinerario itinerario: listaItinerario){
                        System.out.println(cont+"."+itinerario.getOrigen());
                        cont++;
                    }
                    System.out.println("Elige punto de partida:");
                    int ori = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("----------DESTINO-----------");
                    for (Itinerario itinerario: listaItinerario){
                        System.out.println(cont+"."+itinerario.getDestino());
                        cont++;
                    }
                    System.out.println("Elige punto de destino:");
                    int des = sc.nextInt();
                    sc.nextLine();

                    System.out.println("*************Paso 1******************");
                    System.out.println("*************************************");
                    System.out.println("");
                    System.out.println("---------------Vuelos Disponibles IDA------------");    
                    System.out.println("");
                   
                    for (Vuelo vuelo: listaVuelo){
                        boolean value = false;
                        for (Asiento a: vuelo.getAvion().getListaAsientos()){ //definir get en Avion
                            if (a.getDisponibilidad()==Disponibilidad.S){
                                value = true;
                            }
                        }
                        if (value == true) {
                            System.out.println("-----------------------(cont)---------------------------")
                            System.out.println();
                        }
                        
                    }
                    
                case 2:
                    
                    
                case 3:
                    
                    System.out.println("FIn del Programa.");
                    
            }
            
        } if (rol=='O'){
            
            System.out.println("1. Consultar usuarios");
            System.out.println("2. Consultar Reservas");
            System.out.println("3. Salir");
            System.out.println("Escriba el numero de la opción que escogio:");
            int op = sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1:
                case 2:
                case 3:
                    System.out.println("FIn del Programa.");
        }
    }
} //corregir 
    
}

