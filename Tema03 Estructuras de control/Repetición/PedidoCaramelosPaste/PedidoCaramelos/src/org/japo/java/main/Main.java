package org.japo.java.main;

import java.util.Scanner;
import java.util.Locale;

/**
 * @author Angel Pastelero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO
        // Constantes
        final int MAX_CARAMELOS = 1000;
        final int MIN_CARAMELOS = 0;
        final int IVA = 21;
        final double precioPorBolsa = 5.00;
        final double precioPorSuelto = 0.07;
        final int descuento = 5;

        // Variables
        int pedido = 0;
        int bolsas = 0;
        int caramelos = 0;
        double precioDescuento;
        double precioBolsas;
        double precioSuelto;
        double precioPrevio;
        double precioBruto;
        double precioIVA;
        double precioFinal;
        boolean testOK;
        boolean rangoOK;
        // escaner y locale
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        Locale lcl = new Locale("EN", "uk");
        scn.useLocale(lcl);
        // salida inicio
        System.out.println("CARAMELOS PARA BAUTIZOS");
        System.out.printf("=======================\n\n");
        // abrir bucle comprobar entero
        do {
            // abrir bucle comprobar rango
            do {
                // abrir bucles
                testOK = true;
                rangoOK = true;
                try {
                    // escanear cantidad caramelos
                    System.out.print("Cantidad de caramelos ...: ");
                    pedido = scn.nextInt();
                    // cerrar bucle entero
                    testOK = false;
                } catch (Exception e) {
                    // mensaje error no entero
                    System.out.println(">>> Entrada errónea");
                } finally {
                    // limpiar buffer
                    scn.nextLine();
                }
            } while (testOK);
            // verificar rango
            // si utilizo este codigo : rangoOK = !(pedido >= MIN_CARAMELOS && pedido <= MAX_CARAMELOS);
            // no apareze el mensaje de error al salirte del rango
            if (pedido >= MIN_CARAMELOS && pedido <= MAX_CARAMELOS) {
                rangoOK = false;
            } else {
                System.out.println(">>> Entrada errónea");
            }
        } while (rangoOK);
        // conversion pedido a bolsas y caramelos sueltos
        // si pedido es mayor que 100
        while (pedido >= 100) {
            // restar 100 al pedido
            pedido -= 100;
            // añadir 1 a bolsas ( cada bolsa son 100)
            bolsas++;
        }
        // una vez ya no pase de 100 o sea igual a 100 pasar los restantes a caramelos sueltos
        caramelos = pedido;
        // salidas bolsas y caramelos sueltos
        System.out.printf("\nBolsas completas ........: %d\n", bolsas);
        System.out.printf("Caramelos sueltos .......: %d\n", caramelos);
        // calculo precio bolsas y sueltos
        precioBolsas = bolsas * precioPorBolsa;
        precioSuelto = caramelos * precioPorSuelto;
        // salida precio bolsas y sueltos
        System.out.printf(lcl, "\nImporte bolsas ..........: %.2f €\n", precioBolsas);
        System.out.printf(lcl, "Importe suelto ..........: %.2f €\n", precioSuelto);
        // sumar ambos precios
        precioPrevio = precioBolsas + precioSuelto;
        System.out.printf(lcl, "\nImporte previo ..........: %.2f €\n", precioPrevio);
        // calculo descuento
        if (caramelos == 0) {
            precioDescuento = precioPrevio * descuento / 100;
        } else {
            precioDescuento = 0;
        }
        // salidas + calculo IVA
        System.out.printf(lcl, "\nDescuento ( 5%% ) ........: %.2f €\n", precioDescuento);
        precioBruto = precioPrevio - precioDescuento;
        System.out.printf(lcl, "\nImporte bruto ...........: %.2f €\n", precioBruto);
        precioIVA = precioBruto * IVA / 100;
        System.out.printf(lcl, "\nIVA ( 21%% ) .............: %.2f €\n", precioIVA);
        precioFinal = precioBruto + precioIVA;
        System.out.printf(lcl, "\nImporte PVP .............: %.2f €\n", precioFinal);
        
    }
}
