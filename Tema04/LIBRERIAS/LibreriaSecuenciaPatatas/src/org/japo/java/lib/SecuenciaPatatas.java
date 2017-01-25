/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class SecuenciaPatatas {

    // Constantes
    public static final String NOMBRE_PERSONA = "Jaimito";
    public static final String NOMBRE_ENCARGO = "Patatas";
    public static final String NOMBRE_ANTOJO = "Piruleta";
    public static final int CANTIDAD_ENCARGO = 3;
    public static final double PRECIO_PATATAS = 0.30;
    public static final double PRECIO_PIRULETA = 0.20;
    public static final double DINERO_INICIAL = 1.0;

    public double dineroDevuelto(double di, double pp) {

        // Recalcula el dinero disponible para el encargo
        double vueltas = di - pp;
        
        return vueltas;
    }
    
    public int posiblesKilos (double v, double price){
        
        int numeroKilos;
        
        numeroKilos = (int) (v / price);
        
        return numeroKilos;        
    }
    
    public static void mensajesPatata(){
        
        // Mensajes del supuesto
        System.out.printf("Persona encargada .....: %s\n", NOMBRE_PERSONA);
        System.out.printf("Artículo encargado ....: %s\n", NOMBRE_ENCARGO);
        System.out.printf("Cantidad encargada ....: %d kg\n", CANTIDAD_ENCARGO);
        System.out.printf("Precio encargo ........: %.2f €/kg\n", PRECIO_PATATAS);
        System.out.printf("Dinero suministrado ...: %.2f €\n", DINERO_INICIAL);
        System.out.printf("Artículo imprevisto ...: %s\n", NOMBRE_ANTOJO);
        System.out.printf("Precio imprevisto .....: %.2f €\n", PRECIO_PIRULETA);
    }
}
