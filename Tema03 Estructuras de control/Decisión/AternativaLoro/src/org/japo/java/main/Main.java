
package org.japo.java.main;

//Importación de las clases.
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Raul
 */
public class Main {

    public static void main(String[] args) {
        //Constantes.
        final String NOMBRE_AMO = "Sócrates Martínez";
        final String SALUDO_SI = "Ave César!";
        final String SALUDO_NO = "Sócrates Socorro!";

        //Instancia objeto escaner.
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        Locale l = new Locale("ES", "es");
        sc.useLocale(l);

        //Variables
        System.out.print("Persona que se acerca: ");
        String nombrePersona = sc.nextLine();
        String mensaje;
        boolean amoOK = nombrePersona.equals(NOMBRE_AMO);          
                                                                   
        //Cálculos.                                                
        if (amoOK) {                                               
            mensaje = SALUDO_SI;                                   
        } else {
            mensaje = SALUDO_NO;
        }

        //Salida.
        System.out.printf("Dueño del loro       ... %s\n", NOMBRE_AMO);
        System.out.printf("Persona que se acerca... %s\n", nombrePersona);
        System.out.printf("Mensaje loro... %s\n", mensaje);
    }
}
