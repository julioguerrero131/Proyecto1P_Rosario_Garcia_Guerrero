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
<<<<<<< HEAD
    
    //getters y setters
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public Avion getAvion(){
        return avion;
    }
    public void setAvion(Avion avion){
        this.avion = avion;
    }
    
    public String getFechaSalida(){
        return fechaSalida;
    }
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida = fechaSalida;
    }
    
    public String getFechaLlegada(){
        return fechaLlegada;
    }
    public void setFechaLlegada(String fechaLlegada){
        this.fechaLlegada = fechaLlegada;
    }

    public Itinerario getItinerario(){
        return itinerario;
    }
    public void setItinerario(Itinerario itinerario){
        this.itinerario = itinerario;
    }
    
     public TipoVuelo getTipoVuelo(){
        return tipoVuelo;
    }
    public void setTipoVuelo(TipoVuelo tipoVuelo){
        this.tipoVuelo = tipoVuelo;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecioMillas(){
        return precioMillas;
    }
    public void setPrecioMillas(double precioMillas){
        this.precioMillas = precioMillas;
    }
    
=======
>>>>>>> origin/main
}
