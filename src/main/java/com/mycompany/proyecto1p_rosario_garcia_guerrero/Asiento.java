    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;
import enums.Disponibilidad;
import java.util.ArrayList;
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

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public String getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Disponibilidad getEstado() {
        return estado;
    }

    public void setEstado(Disponibilidad estado) {
        this.estado = estado;
    }
      
        public void asignarAsiento(){
            Vuelo vueloPrueba = new Vuelo(Sistema.getVuelos(), Sistema.getItinerarios());
            ArrayList listaCodigosAvion = vueloPrueba.getCodigoAvion();
            ArrayList listaCodigos = vueloPrueba.getCodigo();
            System.out.println(listaCodigosAvion);
            for(int i = 1; i <= listaCodigosAvion.size() - 1; i++){
                String[] in = listaCodigosAvion.get(i).split(",");
                
            }
        
            for(Asiento a: Sistema.listaAsiento){
                if(a.estado==Disponibilidad.S){
                      int num = (int)(Math.random()*6);
                      Asiento asientoDisponible = Sistema.listaAsiento.get(num);
                      System.out.println("");
                }
            }
        }

        
}
