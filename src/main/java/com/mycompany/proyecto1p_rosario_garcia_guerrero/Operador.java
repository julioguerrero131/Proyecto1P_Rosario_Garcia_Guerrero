package com.mycompany.proyecto1p_rosario_garcia_guerrero;

public class Operador extends Usuario{
    protected double sueldo;
    
    
    public Operador(String cedula, String nombres, int edad, String mail, String user, String password, char rol, double sueldo){
    super(cedula, nombres,edad, mail, user, password, rol);
    this.sueldo = sueldo;
    
  }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void consultarUsuario(){
        System.out.println("Lista de usuarios:");
        for(Usuario u: Sistema.listaUsuario){
            if(u.getRol()=='O'){
                System.out.println(u.getNombres() + "," + u.getRol() + "," + sueldo);
                
            }else {
                System.out.println(u.getNombres() + "," + u.getRol() + "," + u.getCedula());
            }
        }
    }
    
    @Override
    public String consultarReserva(){
        return null;
    }
    
}
