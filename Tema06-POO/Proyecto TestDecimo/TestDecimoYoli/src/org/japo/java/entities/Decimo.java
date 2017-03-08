/*
 * Copyright 2017 jOly.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.interfaces.IDecimo;
import java.util.Random;

/**
 *
 * @author jOly
 */
public class Decimo implements Serializable, IDecimo {


    //Atributos de clase
    private int numero;
    private int serie;
    private int fraccion;

    //Constructores
    //Predeterminado
    public Decimo() {
        generarDecimoAleatorio();
    }

    //Parametrizado
    public Decimo(int numero, int serie, int fraccion) {
        if (validarDecimo(numero, serie, fraccion)) {
            this.numero = numero;
            this.serie = serie;
            this.fraccion = fraccion;
        } else {
            generarDecimoAleatorio();
        }
    }

    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (validarNumero(numero)) {
            this.numero = numero;
        }
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        if (validarSerie(serie)) {
            this.serie = serie;
        }
    }

    public int getFraccion() {
        return fraccion;
    }

    public void setFraccion(int fraccion) {
        if (validarFraccion(fraccion)) {
            this.fraccion = fraccion;
        }
    }

    //Validacion
    private static boolean validarNumero(int numero) {
        return numero >= NUMERO_MIN && numero <= NUMERO_MAX;
    }

    private static boolean validarSerie(int serie) {
        return serie >= SERIE_MIN && serie <= SERIE_MAX;
    }

    private static boolean validarFraccion(int fraccion) {
        return fraccion >= FRACCION_MIN && fraccion <= FRACCION_MAX;
    }

    public static boolean validarDecimo(int num, int ser, int fra) {
        return validarNumero(num) && validarSerie(ser) && validarFraccion(fra);
    }

    //Generador aleatorio para el constructor
    private void generarDecimoAleatorio() {
        Random rdn = new Random();
        this.numero = rdn.nextInt(NUMERO_MAX - NUMERO_MIN + 1) + NUMERO_MIN;
        this.serie = rdn.nextInt(SERIE_MAX - SERIE_MIN + 1) + SERIE_MIN;
        this.fraccion = rdn.nextInt(FRACCION_MAX - FRACCION_MIN + 1) + FRACCION_MIN;
    }

    //Overrides
    @Override
    public String toString() {
        return String.format("%05d - %3d - %2d", numero, serie, fraccion);
    }
    
    @Override
    public boolean equals(Object o){
        boolean testOK = o == null ? false : o instanceof Decimo;
        if (testOK){
            Decimo d = (Decimo)o;
            testOK = this.numero == d.numero && this.serie  == d.serie && this.fraccion == d.fraccion;
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        hash = 97 * hash + this.serie;
        hash = 97 * hash + this.fraccion;
        return hash;
    }

    @Override
    public void mostrarDecimo() {
        System.out.println(toString());
    }
}
