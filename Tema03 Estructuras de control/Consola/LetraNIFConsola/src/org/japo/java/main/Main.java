
package org.japo.java.main;

//Importación clase Scanner;
import java.util.Scanner;
//Importación clase Locale.
import java.util.Locale;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instanciación objeto Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        //Instanciación objeto Locale.
        Locale lcl = new Locale("ES", "es");
        scn.useLocale(lcl);
        
        //Variables.
        char letraNIF;
        
        //Resolución.
        try{
        System.out.printf("Por favor introduce la letra del DNI: ");
        letraNIF = scn.nextLine().charAt(0);
        System.out.println("Letra NIF..........................: "+letraNIF);
        } catch (Exception e){
            System.out.println("Eso no es una letra válida del NIF, por favor introduce una letra.");
        }
    }  
}
