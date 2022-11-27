/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;
import java.util.ArrayList;
/**
 *
 * @author Cliente Intel
 */
public class Reserva {
    
    private String codigo; 
    private Cliente cliente;
    private String fechaCompra;
    private double valor;
    private double valorMillas;
    ArrayList<VueloReserva> vuelosEscogidos = new ArrayList(); 
    
    //getters y setters
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public String getFechaCompra(){
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra){
        this.fechaCompra = fechaCompra;     
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;     
    }
    
    public double getValorMillas(){
        return valorMillas;
    }
    public void setValorMillas(double valorMillas){
        this.valorMillas = valorMillas;     
    }
    

}
