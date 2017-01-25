
package org.japo.java.main;

public class Main {
    public static void main (String[]arg){
        
        //Constantes.
        final double NUMERO_SARDINAS = 12.5;
        final double PRECIO_SARDINA_Y_MEDIA = 1.5;
        
        //Variables.
        double PRECIO_SARDINA = (PRECIO_SARDINA_Y_MEDIA / 3) * 2;       //Precio que cuesta cada sardina.    
        
         //Precio total que cuestan las 12.5 sardinas.
        double totalPesetasSardinas = NUMERO_SARDINAS * PRECIO_SARDINA;
        System.out.println("Todas las sardinas cuestan "+totalPesetasSardinas+" pesetas");
    }
}
