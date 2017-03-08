/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import java.io.IOException;

/**
 *
 * @author (c) Raul Granel
 */
public class EntradaExcepcion extends IOException {

    
    // Constructor predeterminado.
    public EntradaExcepcion() {

        super("Mi excepcin");
    }

    // Constructor parametizado.
    public EntradaExcepcion(String nombre) {

        super("Mi excepción");
    }

}
