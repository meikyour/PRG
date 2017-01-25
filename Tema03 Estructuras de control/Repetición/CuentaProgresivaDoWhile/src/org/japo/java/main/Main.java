
package org.japo.java.main;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //Constantes, valores de la cuenta.
        final int LIM_INF = 0;
        final int LIM_SUP = 10;
        
        //Variables, veces que se realiza la cuenta.
        int i = 1;
        
        //Resolución / Cuenta.
        do {
            System.out.println("Cuenta.........: "+i);
            i++;
        }  while(i < LIM_SUP);
    } 
}
