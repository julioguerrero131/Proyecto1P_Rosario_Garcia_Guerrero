/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;

import manejoArchivos.ManejoArchivos;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class Sistema {

    private static ArrayList<Usuario> listaUsuario;
    private static ArrayList<Reserva> listaReserva;
    private static ArrayList<VuelosReserva> VuelosReserva;
    private static ArrayList<Itinerario> listaItinerario;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    //getters y setters
    
    
    //Cargar datos de txt a las ArrayList de Usuario, Vuelos, etc
    public static void cargarUsuario(String nombreArchivoClientes, String nombreArchivoOperadores) {
        
            ArrayList<String> lineasUsuarios = ManejoArchivos.LeeFichero(nombreArchivoClientes); //leer archivo usuarios
            lineasUsuarios.remove(0); //remover la primera linea
            
            for (Usuario usuario: )
            
            
  
            
    }
    /*
    public static cargarReserva() {
        
    }
    
    public static cargarVuelosReserva() {
        
    }
    
    public static cargarItinerario() {
        
    }
    
    // metodos
    public static iniciarSesion() {
        
    }
    
    public static mostrarMenu(Usuario usuario) {
        
    }
    */
}
