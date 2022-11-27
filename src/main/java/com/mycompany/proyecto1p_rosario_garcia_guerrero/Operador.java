package usuario;
import java.util.ArrayList;

public class Operador extends Usuario{
    protected double sueldo;
    
    
    public Operador(String cedula, String nombres, int edad, String mail, String user, String password, char rol){
    super(cedula, nombres,edad, mail, user, password, rol, listaUsuario);
    
    
  }
    public String consultarUsuario(ArrayList listaUsuario){
        System.out.println("Lista de usuarios:");
        for(Usuario u: listaUsuario){
            if(u.getRol().equals("O")){
                System.out.println(u.getNombres() + "," + u.getRol() + "," + u.getSueldo());
                
            }else if(u.getRol().equals("S") or u.getRol().equals("V")){
                System.out.println(u.getNombres() + "," + u.getRol() + "," + u.getCedula());
            }
        }
    }
    
    @Override
    public String consultarReserva(){
        
    }
    
}
