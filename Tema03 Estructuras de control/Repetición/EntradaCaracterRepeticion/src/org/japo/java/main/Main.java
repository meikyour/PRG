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
        char c = '0';                                           //INICIO.

        //Cálculos.
        boolean testOK = true;                                  //INICIO.
        do {                                                    //BUCLE.
            try {                                               //BUCLE.
                System.out.print("Carácter......: ");           //BUCLE.
                c = scn.nextLine().charAt(0);                   //BUCLE.
                testOK = false;                                 //ACTUALIZACIÓN.
            } catch (Exception e) {                             //BUCLE.
                System.out.println("Error entrada.");           //BUCLE.
            }
        } while (testOK);                                       //CONTROL.
        
        //Mensaje.                
        System.out.printf("Carácter......: %c\n", c);           //CONTROL.
    }
}

