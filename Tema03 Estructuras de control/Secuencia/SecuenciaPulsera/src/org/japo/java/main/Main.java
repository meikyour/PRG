
package org.japo.java.main;

public class Main {
    public static void main(String[]arg){
        
    //Constantes.
        
    final int DINERO_INICIAL = 1;    
    final double PRECIO_PULSERA = 0.5;
    
    //Variables.
    double dineroRestante;              //Dinero que le queda.
    
    //Dinero que le queda al comprar la pulsera.
    dineroRestante= DINERO_INICIAL - PRECIO_PULSERA;
        System.out.println("A Marta le quedan "+dineroRestante+" Euros");
}
}
