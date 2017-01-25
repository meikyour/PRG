
package org.japo.java.main;

//Importamos la clase Scanner.
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        //Instanciación objeto Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");     //INICIO.

        //Variables.  
        int n = 0;                                            
        boolean numeroPendienteOK = true;                       

        //Cálculos.
        do {                                                    
            try {                                              
                System.out.print("Número....: ");               
                n = scn.nextInt();                              
                numeroPendienteOK = false;                      
            } catch (Exception e) {                            
                System.out.println("Error entrada.");          
            } finally {                                         
                scn.nextLine();                                 
            }
        } while (numeroPendienteOK);
        
        //Mensaje.
        System.out.println("Número..........: "+ n);            
    }
}
