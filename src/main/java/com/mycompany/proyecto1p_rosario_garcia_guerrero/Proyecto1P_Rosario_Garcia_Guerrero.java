/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1p_rosario_garcia_guerrero;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class Proyecto1P_Rosario_Garcia_Guerrero {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<String> strings = ManejoArchivos.LeeFichero("usuarios.txt");
        System.out.println(strings);
    }
}
