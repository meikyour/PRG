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
        Scanner scn = new Scanner(System.in, "ISO-8859-1");     //INICIO.
        //Instanciamos el objeto Locale.                        //INICIO.
        Locale lcl = new Locale("EN");
        scn.useLocale(lcl);

        //Variables.  
        boolean b = true;                                          
        boolean numeroPendienteOK = true;                       

        //Cálculos.
        do {                                                    
            try {                                              
                System.out.print("Número....: ");               
                b = scn.nextBoolean();                           
                numeroPendienteOK = false;                      
            } catch (Exception e) {                            
                System.out.println("Error entrada, introduce un valor lógico.");           
            } finally {                                         
                scn.nextLine();                                 
            }
        } while (numeroPendienteOK);                            
        
        //Mensajes.    
        System.out.printf("Número....: %b\n", b);               
    }
}
