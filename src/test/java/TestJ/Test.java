package TestJ;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import com.mycompany.proyecto1p_rosario_garcia_guerrero.ManejoArchivos;
import java.util.ArrayList;
/**
 *
 * @author julio
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> lineas = ManejoArchivos.LeeFichero("usuarios.txt");
        lineas.remove(0);
        //System.out.println(lineas);
        
        for (String l:lineas) {
            String[] lista = l.split(",");
            ArrayList<String> temp = new ArrayList<>();
            for (String e:lista){
                temp.add(e);
            }
            System.out.println(temp);
        }
        
    }
    
}
