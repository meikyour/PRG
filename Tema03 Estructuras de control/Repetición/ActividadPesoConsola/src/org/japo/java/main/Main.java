package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        // Escaner
        Scanner scn = new Scanner(System.in);

        //Constantes.
        //Peso mínimo y máximo.
        int PESO_MIN = 0;
        int PESO_MAX = 250;
        //Período máximo para la cuenta de introducción de datos.
        int PERIODO_MAX = 7;
        //Días de la semana.
        final String DIA_1 = "Lunes";
        final String DIA_2 = "Martes";
        final String DIA_3 = "Miércoles";
        final String DIA_4 = "Jueves";
        final String DIA_5 = "Viernes";
        final String DIA_6 = "Sabado";
        final String DIA_7 = "Domingo";

        //Variables.
        //Peso de la persona en ese momento.
        int peso = 0;
        //Acumulación de los valores de peso introducidos durante la semana.
        int pesoAcumulado = 0;
        //Media de pesos introducidos.
        int pesoMedio = 0;
        //Día de la semana.
        String dia = "";

        //Período durante el que se repite la introducción de datos de peso.
        for (int periodo = 1; periodo <= PERIODO_MAX; periodo++) {

            //Validación de peso válido.
            boolean pesoOK = true;
            do {
                //Intrudcción de dato y Evaluacion del tipo de dato Int.
                boolean testOK = true;
                do {
                    try {
                        //Introducción de datos.
                        System.out.printf("Introduce tu peso.......: ");
                        peso = scn.nextInt();
                        testOK = false;
                    } catch (Exception e) {
                        System.out.println("Error de entrada.");
                    } finally {
                        scn.nextLine();
                    }
                } while (testOK);
                pesoOK = !(peso <= PESO_MAX);
                pesoAcumulado = peso + pesoAcumulado;
                pesoMedio = pesoAcumulado / PERIODO_MAX;
                if (pesoOK) {
                    System.out.println("Error, introduce un peso válido.");
                }
            } while (pesoOK);

            //Asignación del día.
            switch (periodo) {
                case 1:
                    dia = DIA_1;
                    break;
                case 2:
                    dia = DIA_2;
                    break;
                case 3:
                    dia = DIA_3;
                    break;
                case 4:
                    dia = DIA_4;
                    break;
                case 5:
                    dia = DIA_5;
                    break;
                case 6:
                    dia = DIA_6;
                    break;
                case 7:
                    dia = DIA_7;
            }
            //Mensaje con el día y el peso introducido ese día.
            System.out.printf("Día.......: %s. - Peso.......: %2d\n", dia, peso);
        }
        //Mensajes finales de los datos.
        System.out.println("Peso acumulado...............: " + pesoAcumulado);
        System.out.println("Media de peso semanal........: " + pesoMedio);
    }
}
