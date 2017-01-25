package org.japo.java.main;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        //Contstante base / tabla sobres la que se multiplica.
        final int TABLA = 9;
        //Constante veces máximas que se multiplicará sobre la constante tabla.
        final int MULTIPLICACION_MAX = 10;

        //Variables.
        //Resultado de la operación de multiplicar la TABLA * multiplicación.
        int resultado = 0;

        //Veces que se multiplica y Número que se multiplica sobre la base / tabla.
        for (int multiplicacion = 0; multiplicacion <= MULTIPLICACION_MAX; multiplicacion++) {
            //Resultado de la operación de multiplicar TABLA * multiplicación.
            resultado = TABLA * multiplicacion;
            System.out.printf("%d * %d = %d\n", TABLA, multiplicacion, resultado);
        }
    }
}
