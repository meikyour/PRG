package org.japo.java.main;

//Importamos la clase Scanner.
import java.util.Scanner;
//Importamos la clase Locale.
import java.util.Locale;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        //Instanciación objeto Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");     
        //Instanciamos el objeto Locale.                        
        Locale lcl = new Locale("EN");
        scn.useLocale(lcl);

        //Variables.  
        double n = 0;                                           
        boolean numeroPendienteOK = true;                       

        //Cálculos.
        do {                                                    
            try {                                               
                System.out.print("Número....: ");               
                n = scn.nextDouble();                           
                numeroPendienteOK = false;                      
            } catch (Exception e) {                             
                System.out.println("Error entrada.");           
            } finally {                                         
                scn.nextLine();                                 
            }
        } while (numeroPendienteOK);
        
        //Mensaje.
        System.out.printf("Número...........: %.2f", n);             
    }
}
