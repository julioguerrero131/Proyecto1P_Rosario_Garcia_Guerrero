/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cliente Intel
 */
public class Itinerario {

    protected ArrayList<String> origen;
    protected ArrayList<String> destino;
    protected ArrayList<String> duracion;
    protected ArrayList<String> horaSalida;
    protected ArrayList<String> horaLlegada;
    
    Scanner sc = new Scanner(System.in);
    
    ArrayList<String> listaiti = new ArrayList<>();
    ArrayList<String> codigoiti = new ArrayList<>();
    ArrayList<String> listades = new ArrayList<>();

    public Itinerario() {

    }

    public Itinerario(ArrayList<String> itinerario) {
        for (int i = 1; i <= itinerario.size() - 1; i++) {
            String[] lista = itinerario.get(i).split(",");
            codigoiti.add(lista[0]);
//            origen.add(lista[1]);
//            destino.add(lista[2]);
//            duracion.add(lista[3]);
//            horaSalida.add(lista[4]);
//            horaLlegada.add(lista[5]);
//            System.out.println(codigoiti);
            if (!listaiti.contains(lista[1])) {
                listaiti.add(lista[1]);

            } else if (!listades.contains(lista[2])) {
                listades.add(lista[2]);
            }

        }

    }

}
