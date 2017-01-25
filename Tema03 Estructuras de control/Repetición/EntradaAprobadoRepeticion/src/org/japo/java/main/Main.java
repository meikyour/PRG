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
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        //Instanciamos el objeto Locale.                            
        Locale lcl = new Locale("EN");
        scn.useLocale(lcl);

        //Contantes.
        //Notas máximas y mínimas para el aprobado.
        int NOTA_MINIMA = 5;
        int NOTA_MAXIMA = 10;
        //Posibles calificaciones.
        String APROBADO = "Aprobado";
        String SUSPENDIDO = "Suspendido";
        //Nota límite.
        int OK = 5;

        //Variables.  
        double nota = 0;                        //Nota del alumno.  
        String calificacionAlumno = "";         //Calificación del alumno.
        String notaNO = "Error de entrada, introduce una nota válida";
        String suspendidoNO = "Con esa nota estás suspendido, introrduce una nota apta para aprobado";

        //Evaluación de la calificación deseada.
        boolean calificacionOK = true;
        do {
            //Introducción de datos y Validación de dato Double.
            boolean testOK = true;
            do {
                try {
                    System.out.print("Nota.......: ");
                    nota = scn.nextDouble();
                    testOK = false;
                } catch (Exception e) {
                    System.out.println(notaNO);
                } finally {
                    scn.nextLine();
                }
            } while (testOK);
            calificacionOK = !(nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA);
            if (calificacionOK) {
                System.out.println(suspendidoNO);
            }
        } while (calificacionOK);

        //Mensajes de la nota y la calificación del alumno.
        System.out.printf("Nota...............: %.2f\n", nota);
        System.out.printf("Calificacion.......: %s\n", calificacionAlumno);
    }
}
