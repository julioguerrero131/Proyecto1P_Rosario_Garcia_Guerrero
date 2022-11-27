/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;

import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

/**
 *
 * @author julio
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
//    private static ArrayList<Usuario> listaUsuario;
    private static ArrayList<Reserva> listaReserva;
    private static ArrayList<String> itinerarios = ManejoArchivos.LeeFichero("itinerarios.txt");
    private static ArrayList<String> vuelos = ManejoArchivos.LeeFichero("vuelos.txt");

    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Itinerario iti = new Itinerario(itinerarios);
        Vuelo vue = new Vuelo(vuelos, itinerarios);
//        System.out.println(iti);
//        System.out.println(vue);

    }
    
    //getters y setters

    //Cargar datos de txt a las ArrayList de Usuario, Vuelos, etc
    public static void cargarUsuario(String nombreArchivoClientes, String nombreArchivoOperadores) {

        ArrayList<String> lineasUsuarios = ManejoArchivos.LeeFichero(nombreArchivoClientes); //leer archivo usuarios
        lineasUsuarios.remove(0); //remover la primera linea

//            for (Usuario usuario: )
    }
}
