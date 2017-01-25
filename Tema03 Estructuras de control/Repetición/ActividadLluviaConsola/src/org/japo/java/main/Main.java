package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Random.
        Random rnd = new Random(System.currentTimeMillis());

        //Constantes.
        //Lluvia mínima y máxima posible.
        final int LLUVIA_MIN = 0;
        final int LLUVIA_MAX = 500;
        //Día máximo inamovible para el contador.
        final int MAX_DIA = 7;
        //Días de la semana.
        final String DIA_1 = "Lunes";
        final String DIA_2 = "Martes";
        final String DIA_3 = "Miércoles";
        final String DIA_4 = "Jueves";
        final String DIA_5 = "Viernes";
        final String DIA_6 = "Sábado";
        final String DIA_7 = "Domingo";

        //Variables.
        //Días de más lluvia.
        int diaMaxLluvia = 7;
        //Dia de menos lluvia.
        int diaMinLluvia = 7;
        //Lluvia máxima real.
        int lluviaMaxReal = 0;
        //Lluvia mínima real.
        int lluviaMinReal = 0;
        //Lluvia acumulada.
        int lluviaAcu = 0;
        //Lluvia diaria.
        int lluviaDia;
        //Media de la lluvia semanal.
        double lluviaMedia;
        //Día de la semama.
        String diaSemana = "";
        String diaSemanaMax = "";
        String diaSemanaMin = "";

        //Calculos.
        for (int dia = 0; dia < MAX_DIA; dia++) {
            //Lluvia.
            lluviaDia = rnd.nextInt(LLUVIA_MAX - LLUVIA_MIN + 1) + LLUVIA_MIN;

            //Acumulación.
            lluviaAcu += lluviaDia;           //LluviaAcu = lluviaDia + lluviaAcu;

            //Asignación de día.
            switch (dia) {
                case 0:
                    diaSemana = DIA_1;
                    break;
                case 1:
                    diaSemana = DIA_2;
                    break;
                case 2:
                    diaSemana = DIA_3;
                    break;
                case 3:
                    diaSemana = DIA_4;
                    break;
                case 4:
                    diaSemana = DIA_5;
                    break;
                case 5:
                    diaSemana = DIA_6;
                    break;
                case 6:
                    diaSemana = DIA_7;
            }

            //Día que más a llovido.
            if (dia == 0) {
                lluviaMaxReal = lluviaDia;
                diaMaxLluvia = 0;
            } else if (lluviaDia > lluviaMaxReal) {
                lluviaMaxReal = lluviaDia;
                diaMaxLluvia = dia;
            }

            //Asignación del día que más a llovido.
            switch (diaMaxLluvia) {
                case 0:
                    diaSemanaMax = DIA_1;
                    break;
                case 1:
                    diaSemanaMax = DIA_2;
                    break;
                case 2:
                    diaSemanaMax = DIA_3;
                    break;
                case 3:
                    diaSemanaMax = DIA_4;
                    break;
                case 4:
                    diaSemanaMax = DIA_5;
                    break;
                case 5:
                    diaSemanaMax = DIA_6;
                    break;
                case 6:
                    diaSemanaMax = DIA_7;
            }

            //Día que menos a llovido.
            if (dia == 0) {
                lluviaMinReal = lluviaDia;
                diaMinLluvia = 0;
            } else if (lluviaDia < lluviaMinReal) {
                lluviaMinReal = lluviaDia;
                diaMinLluvia = dia;
            }

            //Asignación del día que menos a llovido.
            switch (diaMinLluvia) {
                case 0:
                    diaSemanaMin = DIA_1;
                    break;
                case 1:
                    diaSemanaMin = DIA_2;
                    break;
                case 2:
                    diaSemanaMin = DIA_3;
                    break;
                case 3:
                    diaSemanaMin = DIA_4;
                    break;
                case 4:
                    diaSemanaMin = DIA_5;
                    break;
                case 5:
                    diaSemanaMin = DIA_6;
                    break;
                case 6:
                    diaSemanaMin = DIA_7;
            }

            //Mensaje del día de la semana con la lluvia de cada día.
            System.out.printf("Día.............:%-9s - Lluvia..........:%d l/m2\n", diaSemana, lluviaDia);
        }

        //Lluvia media.
        lluviaMedia = lluviaAcu / MAX_DIA;

        //Lluvia acumulada durante la semana.
        System.out.printf("Lluvia acumulada...........: %d litros\n", lluviaAcu);

        //Media diaria de lluvia.
        System.out.printf("Media diaria de lluvia.....: %.2f l/m2\n", lluviaMedia);

        //Día que más a llovido en la semana.
        System.out.printf("Día de más lluvia..........:%s - Cantidad.........: %d l/m2\n", diaSemanaMax, lluviaMaxReal);

        //Día que menos a llovido en la semana.
        System.out.printf("Día de menos lluvia........:%s - Cantidad.........:%d l/m2\n", diaSemanaMin, lluviaMinReal);
    }
}
