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
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        
        //Variables.
        int n = 0;
        
        try{
            System.out.printf("Número....: ");
            n = scn.nextInt();
        }catch (Exception e){
            System.out.println("Error entrada.");
        } finally{
            scn.nextLine();
        }
        
        System.out.println("Número....:"+n);
    } 
}
