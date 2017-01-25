
package org.japo.java.main;

//Importación clase Scanner;
import java.util.Scanner;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instanciación objeto Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        
        //Variable nombre del usuario.
        String nombre;
        
        //Resolución.
        try{
        System.out.printf("Por favor, introduce el nombre: ");
        nombre = scn.nextLine();
        System.out.println("Me llamo.....................:"+nombre);
        }
        catch(Exception e){
            System.out.println("Por favor, introduce un nombre correcto.");
        }
    }   
}
