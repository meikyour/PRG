package org.japo.java.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //INSTANCIAMOS GREGORIAN CALENDAR
        GregorianCalendar gc = new GregorianCalendar();
        //INSTANCIAMOS SCANNER
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        int hIni = 0;
        int mIni = 0;
        int sIni = 0;
        int hAct;
        int mAct;
        int sAct;
        int sHIni;
        int sMIni;
        int sHAct;
        int sMAct;
        int sTotalAct;
        int sTotalIni;
        int sTotalDif;
        int hDif;
        int rHDif;
        int mDif;
        int sDif;

        boolean condicionOK = true;
        boolean testOK;
        do {
            do {
                try {

                    //OBTENEMOS ENTRADA DE LA HORA
                    System.out.println("Introduce la hora inicial:");
                    hIni = scn.nextInt();
                    System.out.println("Introduce los minutos iniciales:");
                    mIni = scn.nextInt();
                    System.out.println("Introduce los segundos iniciales:");
                    sIni = scn.nextInt();
                    condicionOK = false;

                } catch (Exception e) {
                    System.out.println("ERROR EN LA ENTRADA, PRUEBE DE NUEVO");
                    condicionOK = true;
                } finally {
                    scn.nextLine();
                }
            } while (condicionOK);
            if (hIni < 0 || hIni > 23) {
                System.out.println("La hora seleccionada está fuera de rango (0-23)");
                testOK = true;
            } else if (mIni < 0 || mIni > 59) {
                System.out.println("Los minutos seleccionados están fuera de rango (0-59)");
                testOK = true;
            } else if (sIni < 0 || sIni > 59) {
                System.out.println("Los segundos seleccionados están fuera de rango (0-59)");
                testOK = true;
            } else {
                System.out.printf("La hora seleccionada es:%02d:%02d:%02d\n", hIni, mIni, sIni);
                testOK = false;
            }
        } while (testOK);

        //OBTENEMOS LA HORA DEL SISTEMA        
        hAct = gc.get(Calendar.HOUR_OF_DAY);
        mAct = gc.get(Calendar.MINUTE);
        sAct = gc.get(Calendar.SECOND);

        //MOSTRAMOS POR PANTALLA
        System.out.printf("La hora actual del sistema es: %02d:%02d:%02d\n", hAct, mAct, sAct);

        //OPERACIONES PASAMOS TODO A SEGUNDOS y los sumamos
        sHIni = hIni * 3600;
        sMIni = mIni * 60;
        sTotalIni = sHIni + sMIni + sIni;

        sHAct = hAct * 3600;
        sMAct = mAct * 60;
        sTotalAct = sHAct + sMAct + sAct;

        sTotalDif = sTotalAct - sTotalIni;
        // Si la diferencia es negativa, la convertimos en positivo.

        if (sTotalDif < 0) {
            sTotalDif *= -1;
        }
        hDif = sTotalDif / 3600;
        rHDif = sTotalDif % 3600;
        mDif = rHDif / 60;
        sDif = rHDif % 60;
        System.out.printf("La diferencia horaria es: %d:%d:%d\n", hDif, mDif, sDif);
    }
}
