    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;
import enums.Disponibilidad;
import java.util.Random;

/**
 *
 * @author julio
 */
public class Asiento {
    
        private String codigoAvion; 
        private String numAsiento;
        private Disponibilidad estado;
        
        public Asiento(String codigoAvion, String numAsiento, Disponibilidad estado){
            this.codigoAvion = codigoAvion;
            this.numAsiento = numAsiento;
            this.estado = estado;
        }

        
}
