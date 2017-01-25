package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Constantes
        final String NOMBRE_MES_01 = "Enero";
        final String NOMBRE_MES_02 = "Febrero";
        final String NOMBRE_MES_03 = "Marzo";
        final String NOMBRE_MES_04 = "Abril";
        final String NOMBRE_MES_05 = "Mayo";
        final String NOMBRE_MES_06 = "Junio";
        final String NOMBRE_MES_07 = "Julio";
        final String NOMBRE_MES_08 = "Agosto";
        final String NOMBRE_MES_09 = "Septiembre";
        final String NOMBRE_MES_10 = "Octubre";
        final String NOMBRE_MES_11 = "Noviembre";
        final String NOMBRE_MES_12 = "Diciembre";
        final String NOMBRE_MES_XX = "Indefinido";
        
        // Instancia un objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Introduce el mes a analizar
        System.out.print("Número del mes: ");
        int mes = sc.nextInt();

        // Analiza el valor introducido
        String nombre;
        switch (mes) {
            case 1:
                nombre = NOMBRE_MES_01;
                break;
            case 2:
                nombre = NOMBRE_MES_02;
                break;
            case 3:
                nombre = NOMBRE_MES_03;
                break;
            case 4:
                nombre = NOMBRE_MES_04;
                break;
            case 5:
                nombre = NOMBRE_MES_05;
                break;
            case 6:
                nombre = NOMBRE_MES_06;
                break;
            case 7:
                nombre = NOMBRE_MES_07;
                break;
            case 8:
                nombre = NOMBRE_MES_08;
                break;
            case 9:
                nombre = NOMBRE_MES_09;
                break;
            case 10:
                nombre = NOMBRE_MES_10;
                break;
            case 11:
                nombre = NOMBRE_MES_11;
                break;
            case 12:
                nombre = NOMBRE_MES_12;
                break;
            default:
                nombre = NOMBRE_MES_XX;
        }
        
        // Muestra el mes equivalente
        System.out.printf("Nombre del mes: %s\n", nombre);
    }
}
