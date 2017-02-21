/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Fecha {

    // Nombres de los días de la semana.
    public final static String[] DIAS = {"lunes", "martes",
        "miércoles", "jueves", "viernes", "sábado", "domingo"};

    // Nombres de los meses del año.
    public final static String[] MESES = {"enero", "febrero",
        "marzo", "abril", "mayo", "junio", "julio", "agosto",
        "septiembre", "octubre", "noviembre", "diciembre"};

    // Nombres de las estaciones del año.
    public final static String[] ESTACIONES = {"primavera",
        "verano", "otoño", "invierno"};

    // Constantes.
    // Día y mes mínimos.
    public static final int DIA_MIN = 1;
    public static final int MES_MIN = 1;
    // Días máximos.
    public static final int DIA_MAX1 = 31;
    public static final int DIA_MAX2 = 30;
    public static final int DIA_MAX3 = 29;
    public static final int DIA_MAX4 = 28;
    // Mes máximo.
    public static final int MES_MAX = 12;

    // Día, mes y año numérico.
    private int dia;
    private int mes;
    private int any;

    // Día, mes y año escrito.
    private String day;
    private String month;
    private String estacion;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int any, String day, String month, String estacion) {
        if (comprobarMes31(mes) || comprobarMes30(mes) || comprobarBisiesto(any)) {
            this.dia = dia;
        }

        if (comprobarMes31(mes) || comprobarMes30(mes) || comprobarBisiesto(any)) {
            this.dia = mes;
        }
        
        this.any = any;

        this.day = day;
        this.month = month;
        this.estacion = estacion;
    }

    // --------------------------- Atributos int ---------------------------------------.
    public void setMes(int mes) {

        if (comprobarMes31(mes) || comprobarMes30(mes) || mes == 2) {
            this.mes = mes;
        }
    }

    public int getMes() {

        return mes;
    }

    public void setDia(int dia) {

        if (comprobarMes31(mes) || comprobarMes30(mes) || comprobarBisiesto(any)) {
            this.dia = dia;
        }
    }

    public int getDia() {

        return dia;
    }

    public void setAny(int any) {

        this.any = any;
    }

    public int getAny() {

        return any;
    }

    // -------------------------------- Atributos String -----------------------------------------------.
    public void setDay(int dia) {

        try {
            this.day = DIAS[dia];
        } catch (Exception e) {
        }
    }

    public String getDay() {

        return day;
    }

    public void setMonth(int mes) {

        try {
            this.month = MESES[mes];
        } catch (Exception e) {
        }
    }

    public String getMonth() {

        return month;
    }

    public void setEstacion(int mes) {

        try {
            if ((mes >= 3 && dia >= 21) && (mes <= 6 && dia <= 21)) {
                this.estacion = ESTACIONES[0];
            } else if ((mes >= 6 && dia >= 21) && (mes <= 9 && dia <= 23)) {
                this.estacion = ESTACIONES[1];
            } else if ((mes >= 9 && dia >= 23) && (mes <= 12 && dia <= 21)) {
                this.estacion = ESTACIONES[2];
            } else {
                this.estacion = ESTACIONES[3];
            }
        } catch (Exception e) {
        }
    }

    public String getEstacion() {

        return estacion;
    }

    // ----------------------------------------- MÉTODOS -------------------------------------------------------------
    private static boolean comprobarMes31(int mes) {
        return mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
    }

    private static boolean comprobarMes30(int mes) {
        return mes == 4 || mes == 6 || mes == 9 || mes == 11;
    }

    private static boolean comprobarBisiesto(int any) {
        return any % 400 == 0 || any % 100 != 0 && any % 4 == 0;
    }

}
