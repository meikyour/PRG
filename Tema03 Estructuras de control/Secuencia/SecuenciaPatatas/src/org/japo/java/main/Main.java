
package org.japo.java.main;

public class Main {
    public static void main(String[]arg){
       
        //Constantes
        final double PRECIO_PATATAS = 0.3;
        final double PRECIO_PIRULETA = 0.2;
        final double DINERO_INICIAL = 1.0;
       
        //Variables
        int numeroKilos;
        double vueltas;
       
        //Dinero restante - piruleta
        vueltas = DINERO_INICIAL - PRECIO_PIRULETA;
       
        //Kilos de patatas
        numeroKilos = (int)(vueltas/PRECIO_PATATAS);
       
        //Vueltas
        vueltas = vueltas - numeroKilos * PRECIO_PATATAS;
       
        //Cuantos KG Patatas
        System.out.println("Ha comprado " + numeroKilos + " kg. de patatas.");
       
        //Cuantas vueltas
        System.out.println("Han sobrado " + vueltas + " €.");
       
       }
}