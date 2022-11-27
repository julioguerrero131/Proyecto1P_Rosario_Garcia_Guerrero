package com.mycompany.proyecto1p_rosario_garcia_guerrero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author julio
 */
public class Itinerario {
    String codigo;
    String origen;
    String destino;
    String horaSalida;
    String horaLlegada;
    String duracion;
    
    public Itinerario(String codigo, String origen, String destino, String horaSalida, String horaLlegada, String duracion){
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.duracion = duracion;
    }
    
    //getters y setters
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getOrigen(){
        return origen;
    }
    public void setOrigen(String origen){
        this.origen = origen;
    }
    
    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    
    public String getHoraSalida(){
        return horaSalida;
    }
    public void setHoraSalida(String horaSalida){
        this.horaSalida = horaSalida;
    }
    
    public String getHoraLlegada(){
        return horaLlegada;
    }
    public void setHoraLlegada(String horaLlegada){
        this.horaLlegada = horaLlegada;
    }
    
    public String getDuracion(){
        return duracion;
    }
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
}
