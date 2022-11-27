package usuario;

public class ClienteVIP extends Cliente{
    protected String tipoVIP;
    protected int millas;

    public ClienteVIP(String cedula, String nombres, int edad, String mail, String user, String password, char rol, int num_tarjeta, String tipoVIP, int millas){
     super(cedula, nombres,edad, mail, user, password, rol,listaUsuarios, num_tarjeta);
     this.tipoVIP = tipoVIP;
     this.millas = millas;
     
  }
    public int acumuladorMillas(int millas){
        int totalMillas = 1000;
        for(Usuario u: listaUsuarios){
            if(u.getRol()equals("V")){
            totalMillas = millas + totalMillas;           
            }
        } return totalMillas;
    }
}
