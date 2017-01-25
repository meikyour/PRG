
package org.japo.java.main;

public class Main {
    public static void main(String[]arg){
        
        //Constantes.
        final int CANICAS_INICIALES = 5;
        
        //Variables.
        //Canicas que a perdido.
        int canicasPerdidas = 4;
        System.out.printf("Rigoberto a perdido %d canicas\n",canicasPerdidas);
         
        //Canicas que le quedan.
        int  restoCanicas = CANICAS_INICIALES - canicasPerdidas;      
        System.out.println("A Rigoberto le quedan "+restoCanicas+" canicas"); 
    }
}
