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
}
