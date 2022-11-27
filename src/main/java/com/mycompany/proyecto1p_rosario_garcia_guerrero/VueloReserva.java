/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;

/**
 *
 * @author julio
 */
public class VueloReserva {
    
    Vuelo vuelo;
    TipoVuelo tipoVuelo;
    TipoTarifa tarifa;
    Asiento asiento;
    
    public VueloReserva(Vuelo vuelo, TipoVuelo tipoVuelo, TipoTarifa tarifa, Asiento asiento){
        this.vuelo = vuelo;
        this.tipoVuelo = tipoVuelo;
        this.tarifa = tarifa;
        this.asiento = asiento;
    }
}
