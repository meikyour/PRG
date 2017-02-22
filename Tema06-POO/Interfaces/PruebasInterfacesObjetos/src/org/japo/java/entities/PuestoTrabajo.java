/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.interfaces.ITitulo;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class PuestoTrabajo {

    private ITitulo titulo;

    public PuestoTrabajo() {
    }

    public PuestoTrabajo(ITitulo titulo) {
        this.titulo = titulo;
    }

    public void setTitulo(ITitulo titulo) {
        this.titulo = titulo;
    }

    public ITitulo getTitulo() {
        return titulo;
    }
    

    public void trabajar() {
        titulo.ejercerProfesion();
        //getTitulo().ejercerProfesion();  // Tendrá código diferente según interese
    }

}
