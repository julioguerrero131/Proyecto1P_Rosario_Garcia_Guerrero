package com.mycompany.proyecto1p_rosario_garcia_guerrero;

public class ClienteVIP extends Cliente{
    protected String tipoVIP;
    protected int millas;

    public ClienteVIP(String cedula, String nombres, int edad, String mail, String user, String password, char rol, int num_tarjeta, String tipoVIP, int millas){
     super(cedula, nombres,edad, mail, user, password, rol, num_tarjeta);
     this.tipoVIP = tipoVIP;
     this.millas = millas;
     
  }
    public int acumuladorMillas(int millas){
        int totalMillas = 1000;
        for(Usuario u: Sistema.listaUsuario){
            if(u.getRol()=='V'){
            totalMillas = millas + totalMillas;           
            }
        } 
        return totalMillas;
    }
}
