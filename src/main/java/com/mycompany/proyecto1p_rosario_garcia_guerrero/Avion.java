package com.mycompany.proyecto1p_rosario_garcia_guerrero;
import java.util.ArrayList;
import manejoArchivos.ManejoArchivos;

public class Avion {
    protected String codigoAvion;
    protected int capacidad;
    protected ArrayList<Asiento> listaAsientosAvion;
    protected ArrayList<String> codigoAvionArchivo;
    protected ArrayList<String> capacidadArchivo;
    
    public Avion(String codigoAvion, int capacidad){
        ArrayList<String> lineasAvion = manejoArchivos.ManejoArchivos.LeeFichero(archivoAvion); 
        lineasAvion.remove(0);
        for (String l:lineasAvion){
            String[] datos = l.split(",");
            codigoAvionArchivo.add(datos[0]);
            capacidadArchivo.add(datos[1]);
        }    
    }
    
   
        
        
        
            for(int i = 1; i <= Sistema.listaVuelo.size() - 1; i++){
                String[] in = Sistema.listaVuelo.get(i).split(",");
                  codigo.add(lis[0]);
                  codigoAvion.add(lis[1]);
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

