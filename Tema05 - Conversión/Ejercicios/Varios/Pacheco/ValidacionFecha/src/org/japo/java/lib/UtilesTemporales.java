package org.japo.java.lib;

public class UtilesTemporales {

    // Separadores de fechas
    public static final String SEPARADOR_FECHA1 = "/";
    public static final String SEPARADOR_FECHA2 = "-";

    public static boolean validarFecha(String fecha) {
        // Semáforo de validación
        boolean analisisOK;

        try {
            // Obtener las partes de la fecha
            String dia = obtenerDia(fecha);
            String mes = obtenerMes(fecha);
            String any = obtenerAny(fecha);

            // Convertir partes
            int d = Integer.parseInt(dia);
            int m = Integer.parseInt(mes);
            int a = Integer.parseInt(any);

            // Validar fecha
            analisisOK = validarFecha(d, m, a);
        } catch (Exception e) {
            analisisOK = false;
        }

        // Devolver análisis
        return analisisOK;
    }

    private static String obtenerDia(String fecha) {
        int posicion = fecha.indexOf(SEPARADOR_FECHA1);
        if (posicion < 0) {
            posicion = fecha.indexOf(SEPARADOR_FECHA2);
        }
        return fecha.substring(0, posicion);
    }

    private static String obtenerMes(String fecha) {
        int posIni = fecha.indexOf(SEPARADOR_FECHA1);
        int posFin = fecha.lastIndexOf(SEPARADOR_FECHA1);
        if (posIni < 0) {
            posIni = fecha.indexOf(SEPARADOR_FECHA2);
            posFin = fecha.lastIndexOf(SEPARADOR_FECHA2);
        }
        return fecha.substring(posIni + 1, posFin);
    }

    private static String obtenerAny(String fecha) {
        int posicion = fecha.lastIndexOf(SEPARADOR_FECHA1);
        if (posicion < 0) {
            posicion = fecha.lastIndexOf(SEPARADOR_FECHA2);
        }
        return fecha.substring(posicion + 1);
    }

    private static boolean validarFecha(int d, int m, int a) {
        return validarDia(d, m, a) && validarMes(m);
    }

    private static boolean validarMes(int m) {
        return m >= 1 && m <= 12;
    }

    private static boolean validarDia(int d, int m, int a) {
        // Obtener los dias del mes actual
        int diasMes = obtenerDiasMes(m, a);

        // Validar si el dia actual esta en los dias del mes
        return d >= 1 && d <= diasMes;
    }

    private static int obtenerDiasMes(int m, int a) {
        int diasMes;
        if (comprobarMes31(m)) {
            diasMes = 31;
        } else if (comprobarMes30(m)) {
            diasMes = 30;
        } else if (comprobarBisiesto(a)) {
            diasMes = 29;
        } else {
            diasMes = 28;
        }
        return diasMes;
    }

    private static boolean comprobarMes31(int m) {
        return m == 1 || m == 3 || m == 5 || m == 7
                || m == 8 || m == 10 || m == 12;
    }

    private static boolean comprobarMes30(int m) {
        return m == 4 || m == 6 || m == 9 || m == 11;
    }

    private static boolean comprobarBisiesto(int a) {
        return a % 400 == 0
                || a % 100 != 0
                && a % 4 == 0;
    }
}
