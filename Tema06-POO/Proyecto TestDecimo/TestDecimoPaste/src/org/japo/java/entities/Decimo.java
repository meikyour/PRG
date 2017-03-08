package org.japo.java.entities;

import org.japo.java.lib.UtilesDecimo;
//@author 2K16 - Angel Pastelero angel.pastelero399@gmail.com

import org.japo.java.interfaces.IDecimo;

public class Decimo implements java.io.Serializable, IDecimo {

    private static final int N_MAX = 99999;
    private static final int N_MIN = 0;
    private static final int S_MIN = 1;
    private static final int S_MAX = 160;
    private static final int F_MIN = 1;
    private static final int F_MAX = 10;
    private int fraccion;
    private int numero;
    private int serie;

    public int getFraccion() {
        return fraccion;
    }

    public int getNumero() {
        return numero;
    }

    public int getSerie() {
        return serie;
    }

    public void setFraccion(int fraccion) {
        if (fraccion <= F_MAX && fraccion >= F_MIN) {
            this.fraccion = fraccion;
        }
    }

    public void setNumero(int numero) {
        if (numero <= N_MAX && numero >= N_MIN) {
            this.numero = numero;
        }
    }

    public void setSerie(int serie) {
        if (serie <= S_MAX && serie >= S_MIN) {
            this.serie = serie;
        }
    }

    //
    public Decimo() {
        generarDecimoAleatorio();
    }

    public Decimo(int fraccion, int numero, int serie) {
        if (validarDecimo(numero, serie, fraccion)) {
            this.fraccion = fraccion;
            this.numero = numero;
            this.serie = serie;
        } else {
            generarDecimoAleatorio();
        }

    }

    private void generarDecimoAleatorio() {
        numero = UtilesDecimo.generarDecimoAleatorio(N_MIN, N_MAX);
        serie = UtilesDecimo.generarDecimoAleatorio(S_MIN, S_MAX);
        fraccion = UtilesDecimo.generarDecimoAleatorio(F_MIN, F_MAX);
    }

    public static boolean validarDecimo(int numero, int serie, int fraccion) {
        return numero <= N_MAX && numero >= N_MIN
                && fraccion <= F_MAX && fraccion >= F_MIN
                && serie <= S_MAX && serie >= S_MIN;
    }

    @Override
    public boolean equals(Object obj) {
        boolean testOK = obj == null ? false : obj instanceof Decimo;
        if (testOK) {
            Decimo d = (Decimo) obj;
            testOK = this.numero == d.numero
                    && this.serie == d.serie
                    && this.fraccion == d.fraccion;

        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.fraccion;
        hash = 89 * hash + this.numero;
        hash = 89 * hash + this.serie;
        return hash;
    }

    @Override
    public String toString() {
        return String.format("%05d - %03d - %02d", numero, serie, fraccion);
    }

    @Override
    public void mostrarDecimo() {
        System.out.printf("Numero .....: %d\n", numero);
        System.out.printf("Serie ......: %d\n", serie);
        System.out.printf("Fraccion ...: %d\n", fraccion);
        System.out.println("-----");
    }

}
