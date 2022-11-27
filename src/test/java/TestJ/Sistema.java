///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package com.mycompany.proyecto1p_rosario_garcia_guerrero;
//
//import manejoArchivos.ManejoArchivos;
//import java.util.ArrayList;
//import java.util.Arrays;
//
///**
// *
// * @author julio
// */
//public class Sistema {
//
//    public static ArrayList<Usuario> listaUsuario;
//    public static ArrayList<Reserva> listaReserva;
//    public static ArrayList<VuelosReserva> VuelosReserva;
//    public static ArrayList<Itinerario> listaItinerario;
//    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//    }
//    
//    //getters y setters
//    
//    
//    //Cargar datos de txt a las ArrayList de Usuario, Vuelos, etc
//    public static void cargarUsuario(String nombreArchivoUsuarios, String nombreArchivoClientes, String nombreArchivoOperadores) {  //PENDIENTE
//            
//            ArrayList<String> listaLineasU = ManejoArchivos.LeeFichero(nombreArchivoUsuarios); 
//            listaLineasU.remove(0); 
//            
//            ArrayList<String> listaLineasC = ManejoArchivos.LeeFichero(nombreArchivoClientes); 
//            listaLineasC.remove(0); 
//            
//            ArrayList<String> listaLineasO = ManejoArchivos.LeeFichero(nombreArchivoOperadores); 
//            listaLineasO.remove(0); 
//            
//            ArrayList<>
//            
//            
//            for (String l: listaLineasU) {
//                
//                String[] datos = l.split(",");
//                
//                String cedula = datos[0];
//                String nombres = datos[1]; 
//                int edad = Integer.parseInt(datos[2]); 
//                String mail = datos[3]; 
//                String user = datos[4]; 
//                String password = datos[5]; 
//                char rol = datos[6].charAt(0);
//                
//                switch (rol){
//                    case 'S':
//                        Cliente cliente = new Cliente(cedula, nombres, edad, mail, user, password); //se necesita constructor con estos parametros
//                        listaUsuario.add(cliente);
//                    case 'V':
//                        ClienteVIP clienteV = new ClienteVIP(); 
//                }
//            }
//            
//            
//  
//            
//    }
//    
//    public static void cargarReserva(nombreArchivoReservas) {
//        ArrayList<String> listaLineasReserva = ManejoArchivos.LeeFichero(nombreArchivoReservas); 
//        listaLineasU.remove(0); 
//
//    }
//    /*
//    public static cargarVuelosReserva() {
//        
//    }
//    
//    public static cargarItinerario() {
//        
//    }
//    
//    // metodos
//    public static iniciarSesion() {
//        
//    }
//    
//    public static mostrarMenu(Usuario usuario) {
//        
//    }
//    */
//}
