package com.mycompany.proyecto1p_rosario_garcia_guerrero;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class Vuelo {
    String codigo;
    private Avion avion; 
    private String fechaSalida;
    private String fechaLlegada;
    private Itinerario itinerario; 
    private TipoVuelo tipoVuelo;
    private double precio;
    private double precioMillas;
    
    public Vuelo(String codigo, Avion avion, String fechaSalida, String fechaLlegada, Itinerario itinerario,TipoVuelo tipoVuelo, double precio, double precioMillas){
        this.codigo = codigo;
        this.avion = avion;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.avion = avion;
        this.itinerario = itinerario;
        this.tipoVuelo = tipoVuelo; 
        this.precio = precio; 
        this.precioMillas = precioMillas; 
    }
}
