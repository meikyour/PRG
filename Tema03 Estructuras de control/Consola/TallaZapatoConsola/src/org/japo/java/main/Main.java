package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instancia objeto Scanner.
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        //Instancia objeto Locale.
        Locale l = new Locale("ES", "es");
        sc.useLocale(l);
        
        //Variables.
        int talla;

        //Reslocución.
        try {
        System.out.printf("Intruduzca su talla de zapato: ");
        talla = sc.nextInt();
        System.out.println("Talla de zapato.............: "+talla);
        } catch (Exception e){
            System.out.println("Eso no es una talla de zapato.");
        }
    }   
}