
package org.japo.java.main;

public class Main {
    public static void main(String[] args){
        
        //Constantes.
        final double DINERO_PAGADO= 5.0;
        final int  PESO_BOLSA= 3, NARANJAS_BOLSA= 23;
        
        //Variables.
        
        //Dinero que le han devuleto al comprar.
        double dineroDevuelto= 2.75;
        
        //Precio de la compra.
        double precioCompra = DINERO_PAGADO - dineroDevuelto;
        System.out.println("La compra le a costado "+precioCompra+" euros");
        
        //Precio del kilo de naranja
        double precioKilo= precioCompra / 3;
        System.out.println("El kilo cuesta "+precioKilo+" euros");
        
        //Precio de cada naranja
        double  precioNaranja= precioCompra / 23;
        int naranjasPorKilo;       //Naranjas que entraron en un kilo.
        System.out.printf("Cada naranja cuesta %.2f euros", precioNaranja);
                       
    }
}
