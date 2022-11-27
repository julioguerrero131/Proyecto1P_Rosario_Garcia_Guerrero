package com.mycompany.proyecto1p_rosario_garcia_guerrero;

public class Cliente extends Usuario {
    protected int num_tarjeta;
    
    public Cliente(String cedula, String nombres, int edad, String mail, String user, String password, char rol, int num_tarjeta){
     super(cedula, nombres,edad, mail, user, password, rol);
     this.num_tarjeta = num_tarjeta;
    
  }

    Cliente(String cedula, String nombres, int edad, String mail, String user, String password, char rol, String numTarjeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public String consultarReserva(){
        return null;
    }
}
