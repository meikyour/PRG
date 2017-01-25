
package org.japo.java.main;

public class Main {
    public static void main(String[]arg){
       
       //Constantes.
       final int DINERO_PABLO = 2;
       final int DINERO_MIGUEL = 2;
       final double PRECIO_ENTRADA= 1.30;
       final double PRECIO_PALOMITAS= 0.90;
       
       //Variables
       //Dinero que le queda a cada uno despues de salir del cine.
       double dineroRestante = ((DINERO_PABLO + DINERO_MIGUEL) - PRECIO_ENTRADA * 2 - PRECIO_PALOMITAS) / 2;
       System.out.printf("Les a sobrado %.2f euros al salir el cine a cada uno", dineroRestante);
       
    }
}
