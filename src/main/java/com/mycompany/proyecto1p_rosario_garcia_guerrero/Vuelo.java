/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1p_rosario_garcia_guerrero;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cliente Intel
 */
public class Vuelo extends Itinerario {

    ArrayList<String> codigo = new ArrayList<>();
    ArrayList<String> codigoAvion = new ArrayList<>();
    Date fechaSalida= new Date();
    
    Date fechaLlegada= new Date();
//    ArrayList<Date> fechaSalida = new ArrayList<>();
//    ArrayList<Date> fechaLlegada = new ArrayList<>();
    ArrayList<Double> precio = new ArrayList<>();
    ArrayList<Double> precioMillas = new ArrayList<>();

    ArrayList<String> listavue = new ArrayList<>();
    ArrayList<String> codigoItinerario = new ArrayList<>();

    public Vuelo(ArrayList<String> vuelo, ArrayList<String> itinerario) {
        super(itinerario);
        for (int i = 1; i <= vuelo.size() - 1; i++) {
            String[] lis = vuelo.get(i).split(",");
            codigo.add(lis[0]);
            codigoAvion.add(lis[1]);
//            fechaSalida.add(lis[2]);
        }

            System.out.println("-----ORIGEN-----");
            for (int x = 1; x <= listaiti.size(); x++) {
                System.out.println(x + "." + " " + listaiti.get(x - 1));
            }
            System.out.println("Elige punto de partida: ");
            int partida = sc.nextInt();
            sc.nextLine();

            System.out.println("-----DESTINO-----");
            for (int x = 1; x <= listades.size(); x++) {
                System.out.println(x + "." + " " + listades.get(x - 1));
            }

            System.out.println("Elige punto de destino: ");
            int destino = sc.nextInt();
            sc.nextLine();

            if (partida == 1) {

            }

//        for (int i = 1; i <= vuelo.size() - 1; i++) {
//            String[] lis = vuelo.get(i).split(",");
//            if (!listavue.contains(lis[4])) {
//                listavue.add(lis[4]);
//                System.out.println(listavue);
//
//            }
//        }
            for (int x = 1; x <= itinerario.size() - 1; x++) {
                String[] codigo = itinerario.get(x).split(",");
                if (codigoiti.contains(codigo[1])) {
                    for (int i = 1; i <= vuelo.size() - 1; i++) {
                        String[] lis = vuelo.get(i).split(",");

                    }
                }
            }
        }
    }
