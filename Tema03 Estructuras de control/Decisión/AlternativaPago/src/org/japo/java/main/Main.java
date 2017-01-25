
package org.japo.java.main;

//import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Constantes.
        final int MAX_ARTICULOS = 10;
        final String MENSAJE_SI = "Caja rápida";
        final String MENSAJE_NO = "Caja normal";
        
        //Instancia objeto escaner.
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);  // "ISO-8859-1");
        //Locale l = new Locale("ES", "es");
        //sc.useLocale(l);
        
        //Variables.
        System.out.println("Cuantos articulos tiene     .....");
        int numArticulos = sc.nextInt();
        boolean testOk = numArticulos <= MAX_ARTICULOS;
        String mensaje;
        
        //Cálculos.
        if (testOk){
            mensaje = MENSAJE_SI;
        }
        else{
            mensaje = MENSAJE_NO;
        }  
        //Salida.
        System.out.printf("Límite de artículos       ... %d\n", MAX_ARTICULOS);
        System.out.printf("Atención por la... %s\n", mensaje);
 
    }  
}
