/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

//Importación de la clase Scanner.
import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class AlternativaDamero {

    //Constantes.
    // Referencias.
    public static final int TABLERO_ANCHO = 400;
    public static final int TABLERO_ALTO = 400;
    public static final char FILA_MIN = 1;
    public static final char FILA_MAX = 8;
    public static final char COLU_MIN = 'a';
    public static final char COLU_MAX = 'h';

    // Tamaño del damero.
    public static final int NUM_FILAS = FILA_MAX - FILA_MIN + 1;
    public static final int NUM_COLUMNAS = COLU_MAX - COLU_MIN + 1;

    // Tamaño de casilla
    public static final int ALTO_FILA = TABLERO_ALTO / NUM_FILAS;
    public static final int ANCHO_COLUMNA = TABLERO_ANCHO / NUM_COLUMNAS;

    // Instanciación del objeto Scanner.
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    // Variables fila y columna actuales.
    public static int xAct = entrarCoordenadaX();
    public static int yAct = entrarCoordenadaY();

    // Introducir la coordenada X.
    public static int entrarCoordenadaX() {

        System.out.print("Coordenada X ...: ");
        xAct = SCN.nextInt();

        return xAct;
    }

    // Introducir la coordenada Y.
    public static int entrarCoordenadaY() {

        System.out.print("Coordenada Y ...: ");
        yAct = SCN.nextInt();

        return yAct;
    }

    // Columna actual.
    public static char comprobarColumna() {

        char coluAct;

        if (xAct >= 0 && xAct < TABLERO_ANCHO) {
            coluAct = (char) (xAct / ANCHO_COLUMNA + COLU_MIN);
        } else {
            coluAct = '?';
        }
        return coluAct;
    }

    // Fila actual.
    public static char comprobarFila() {

        char filaAct;

        if (yAct >= 0 || yAct < TABLERO_ALTO) {
            filaAct = (char) (yAct / ALTO_FILA + FILA_MIN);
        } else {
            filaAct = '?';
        }
        return filaAct;
    }

    // Muestra la posición equivalente.
    public static void muestraPosicion() {

        char coluAct = comprobarColumna();
        int filaAct = comprobarFila();

        // Muestra la posición equivalente
        if (coluAct == '?' || filaAct == '?') {
            System.out.println("Posición incorrecta");
        } else {
            System.out.printf("Posición .......: %c%d\n", coluAct, filaAct);
        }
    }
}
