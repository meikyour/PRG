/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

//Importamos la clase Scanner.
import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class AlternativaMes {

    //Constantes.
    public static final int MES_INICIO = 1;
    public static final int MES_FINAL = 12;

    //Insanciación del objeto Scanner.
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    // Variables de trabajo.
    public static int mes = entrarMes();
    public static int any = entrarAny();
    public static int numeroDiasMes = analizarMes(mes, any);

    // Introducir número de mes.
    public static int entrarMes() {

        System.out.print("Mes de la fecha ...: ");
        int numeroMes = SCN.nextInt();

        //Devuelve el mes introducido.
        return numeroMes;
    }

    // Introducir año.
    public static int entrarAny() {

        System.out.print("Año de la fecha ...: ");
        int numeroAny = SCN.nextInt();

        //Devuelve el año introducido.
        return numeroAny;
    }

    // Analiza el mes introducido.
    public static int analizarMes(int mes, int any) {

        int numeroDias = 0;

        if (mes < MES_INICIO || mes > MES_FINAL) {
            System.out.println("Dato incorrecto");
        } else {
            switch (mes) {
                case 2:
                    if (any % 400 == 0 || any % 100 != 0 && any % 4 == 0) {
                        numeroDias = 29;
                    } else {
                        numeroDias = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numeroDias = 30;
                    break;
                default:
                    numeroDias = 31;
                    break;
            }
        }
        //Devuelve el número de días que tiene ese mes.
        return numeroDias;
    }

    //Mensaje con el mes introducido y su numero de días.
    public static void mensajeDiasMes() {

        System.out.printf("El mes %d tiene %d dias\n", mes, numeroDiasMes);
    }
}
