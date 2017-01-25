/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class ValidacionFecha {

    public static final int DIA = 10;
    public static final int MES = 6;
    public static final int ANY = 2002;

    public void testFecha(int d, int m, int a) {

        if (comprobarFecha(ANY, MES, DIA)) {
            System.out.printf("La fecha %02d/%02d/%02d SI es correcta\n", DIA, MES, ANY);
        } else {
            System.out.printf("La fecha %02d/%02d/%02d NO es correcta\n", DIA, MES, ANY);
        }
    }

    private boolean comprobarFecha(int any, int mes, int dia) {
        return comprobarMes(mes) && comprobarDia(any, mes, dia);
    }

    private static boolean comprobarMes(int mes) {
        return mes >= 0 && mes <= 12;
    }

    private boolean comprobarDia(int any, int mes, int dia) {
        int diasMax = obtenerDiasDelMes(any, mes);
        return dia >= 0 && dia <= diasMax;

    }

    private static boolean comprobarMes31(int mes) {
        return mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
    }

    private static boolean comprobarMes30(int mes) {
        return mes == 4 || mes == 6 || mes == 9 || mes == 11;
    }

    private int obtenerDiasDelMes(int any, int mes) {
        int dias;
        if (comprobarMes31(mes)) {
            dias = 31;
        } else if (comprobarMes30(mes)) {
            dias = 30;
        } else {
            dias = obtenerDiasFebrero(any);
        }
        return dias;
    }

    private static boolean comprobarBisiesto(int any) {
        return any % 400 == 0 || any % 100 != 0 && any % 4 == 0;
    }

    private int obtenerDiasFebrero(int any) {
        int dias;
        if (comprobarBisiesto(any)) {
            dias = 29;
        } else {
            dias = 28;
        }
        return dias;
    }
}
