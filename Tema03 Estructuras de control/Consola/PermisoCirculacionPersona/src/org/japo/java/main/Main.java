package org.japo.java.main;

//Importacion clase Locale.
import java.util.Locale;
//Importación clase Scanner.
import java.util.Scanner;

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
        //Posibilidades de estado del permiso de circulación.
        boolean permisoOK = true;
        boolean permisoNO = false;
        //Estado actual del permiso de circulación.
        boolean permiso;

        //Resolución.
        try {
            System.out.printf("Indica si estás en posesión del permiso de conducción: ");
            permiso = scn.nextBoolean();
            if (permiso == true) {
                permiso = permisoOK;
            } else {
            }
            System.out.println("Permiso de circulación estado.......................:"+permiso);
        } catch (Exception e) {
            System.out.printf("Eso no es un estado válid, por favor introduce: %b o %b\n", permisoOK, permisoNO);
        }   
    }
}
