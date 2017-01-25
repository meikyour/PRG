package org.japo.java.lib;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */


public class Jaimito {
        // Constantes
    public static final String NOMBRE_PERSONA = "Jaimito";
    public static final String NOMBRE_ENCARGO = "Patatas";
    public static final String NOMBRE_ANTOJO = "Piruleta";
    public static final int CANTIDAD_ENCARGO = 3;
    public static final double PRECIO_PATATAS = 0.30;
    public static final double PRECIO_PIRULETA = 0.20;
    public static final double DINERO_INICIAL = 1.0;

    public static double restarReales(double n1, double n2) {
        return n1 - n2;
    }

    public static int obtenerCocienteEntero(double n1, double n2) {
        return (int) (n1 / n2);
    }
    
    public static void mostrarDatosSupuesto(int numeroKilos, double dineroDevuelto) {
        // Mensajes del supuesto
        System.out.printf("Persona encargada .....: %s\n", NOMBRE_PERSONA);
        System.out.printf("Artículo encargado ....: %s\n", NOMBRE_ENCARGO);
        System.out.printf("Cantidad encargada ....: %d kg\n", CANTIDAD_ENCARGO);
        System.out.printf("Precio encargo ........: %.2f €/kg\n", PRECIO_PATATAS);
        System.out.printf("Dinero suministrado ...: %.2f €\n", DINERO_INICIAL);
        System.out.printf("Artículo imprevisto ...: %s\n", NOMBRE_ANTOJO);
        System.out.printf("Precio imprevisto .....: %.2f €\n", PRECIO_PIRULETA);

        // Mensajes del supuesto
        System.out.printf("Cantidad comprada .....: %d kg\n", numeroKilos);
        System.out.printf("Dinero devuelto .......: %.2f €\n", dineroDevuelto);
    }

}
