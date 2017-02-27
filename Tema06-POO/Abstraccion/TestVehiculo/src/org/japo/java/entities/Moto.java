/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.lib.UtilesVehiculo;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Moto extends Vehiculo {

    public static final int KM_REVISION = 2000;
    public static final int KM_COMPRA = 10;
    public static final int KM_PROXIMIDAD = 30;

    public Moto() {
        super(UtilesVehiculo.obtenerInicial(KM_COMPRA), KM_COMPRA);
    }

    public Moto(int distancia) {
        super(distancia, KM_COMPRA);
    }

    @Override
    public int obtenerRevisiones() {
        return getContador() / KM_REVISION;
    }

    @Override
    public void mostrarInfo() {

        int km = getContador();

        System.out.printf("Vehículo...........: %s\n", this.getClass().getSimpleName());
        System.out.printf("Km.................: %d\n", km);
        System.out.printf("Revisiones.........: %d\n", obtenerRevisiones());

        if (UtilesVehiculo.comprobarProximidad(km, KM_REVISION, KM_PROXIMIDAD)) {
            System.out.printf("Restantes......: %d\n: ", UtilesVehiculo.obtenerRestante(km, KM_REVISION));
        }
        System.out.println("......");
    }
}
