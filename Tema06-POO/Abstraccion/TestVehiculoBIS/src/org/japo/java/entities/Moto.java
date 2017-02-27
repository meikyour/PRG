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
public class Moto extends Vehiculo {

    public static final int KM_REVISION = 12500;
    public static final int KM_COMPRA = 5;
    public static final int KM_MARGEN_REVISION = 50;

    @Override
    public int obtenerNumeroRevisiones() {
        return KM_REVISION / getContador();
    }

    @Override
    public void mostrarInfoRevisiones() {

        
    }
    
    private boolean avisarRevision() {

        boolean revisionOK;

        if (getContador() % KM_REVISION <= KM_MARGEN_REVISION) {
            revisionOK = true;
        } else {
            revisionOK = false;
        }

        return revisionOK;
    }

}
