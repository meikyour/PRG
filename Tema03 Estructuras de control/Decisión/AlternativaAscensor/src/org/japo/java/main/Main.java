
package org.japo.java.main;

//Importación Scanner.
import java.util.Scanner;
//Importación Locale.
import java.util.Locale;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instancia objeto Scanner.
        Scanner sc = new Scanner(System.in);
        //Instancia objeto Locale.
        Locale l = new Locale("ES", "es");
        sc.useLocale(l);
        
        //Constantes.
        //Mensajes de cada planta del edificio.
        final String PRIMERA = "Estamos en la primera planta";
        final String SEGUNDA = "Estamos en la segunda planta";
        final String TERCERA = "Estamos en la tercera planta";
        final String CUARTA = "Estamos en la cuarta planta";
        final String QUINTA = "Estamos en la quinta planta";
        final String ERROR = "El edificio sólamente incluye cinco plantas";
        
        //Variables.
        //Planta actual.
        System.out.println("Estamos en la planta....");
        int plantaActual = sc.nextInt();
        //Mensaje planta actual.
        String mensajePlanta = sc.nextLine();
        
        //Cálculos.
        switch (plantaActual){
            case 1:
                mensajePlanta = PRIMERA;
                break;
            case 2:
                mensajePlanta = SEGUNDA;
                break;
            case 3:
                mensajePlanta = TERCERA;
                break;
            case 4:
                mensajePlanta = CUARTA;
                break;
            case 5:
                mensajePlanta = QUINTA;
                break;
            default:
                mensajePlanta = ERROR;
        }
        //Resultado.
        System.out.println("Planta: "+mensajePlanta);
        }                      
}

