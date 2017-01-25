package org.japo.java.app;

import org.japo.java.lib.Jaimito;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {

    public void lanzarAplicacion() {
        // Variables 
        double vueltas = Jaimito.restarReales(Jaimito.DINERO_INICIAL, Jaimito.PRECIO_PIRULETA);
        int numeroKilos = Jaimito.obtenerCocienteEntero(vueltas, Jaimito.PRECIO_PATATAS);
        double dineroDevuelto = Jaimito.DINERO_INICIAL - Jaimito.PRECIO_PIRULETA - numeroKilos * Jaimito.PRECIO_PATATAS;

        // Mostrar datos supuesto
        Jaimito.mostrarDatosSupuesto(numeroKilos, dineroDevuelto);
    }



}
