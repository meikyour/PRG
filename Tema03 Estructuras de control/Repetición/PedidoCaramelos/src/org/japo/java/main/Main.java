package org.japo.java.main;

//Importamos la clase Locale.
import java.util.Locale;
//Importamos la clase Scanner.
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        // Escaner
        Scanner scn = new Scanner(System.in);
        //Instanciación Locale.
        Locale lcl = new Locale("EN", "uk");
        scn.useLocale(lcl);

        //Constantes.
        //Cantidad máxima de caramelos que se puede solicitar en un mismo pedido.
        final int PEDIDO_MAXIMO = 1000;
        //Precio bruto de la bolsa de caramelos.
        final double PRECIO_BOLSA = 5.0;
        //Precio bruto de la unidad de caramelo.
        final double PRECIO_CARAMELO = 0.07;
        //Cantidad de caramelos que contiene una bolsa.
        final int CARAMELOS_BOLSA = 100;
        //Porcentaje de descuento.
        final int DESCUENTO = 5;
        //Porcentaje de IVA.
        final int IVA = 21;

        //Variables.
        //Cantidad de IVA a deducir.
        double ivaEfectivo;
        //Descuento que se realiza por la compra exclusiva de bolsas.
        double descuentoEfectivo;
        //Precio neto.
        double precioNeto;
        //Cantidad de caramelos que introduce / desea el usuario en su pedido.
        int caramelos = 0;
        //Cantidad de bolsas de caramelos que se suministran.
        int bolsas = 0;
        //Cantidad de unidades de caramelos que se suministran en el pedido.
        int unidadesCaramelos = 0;
        //Precio bruto del pedido.
        double precioBruto;
        //Precio con decuento aplicado.
        double precioConDescuento;
        //Importe de las bosas.
        double importeBolsas;
        //Importe de caramelos.
        double importeCaramelos;

        //Verificación de que la cantidad de caramelos solicitada es una cantidad posible.
        boolean condicionOK = true;
        do {
            //Comprobación de errores al introducir el dato numérico en el pedido de caramelos.
            boolean testOK = true;
            do {
                try {
                    System.out.printf("Introduce la cantidad de caramelos deseada.......: ");
                    caramelos = scn.nextInt();
                    scn.nextLine();
                    testOK = false;
                } catch (Exception e) {
                    System.out.println("Error de entrada, introduce una cantidad correcta.");
                scn.nextLine();
                }
            } while (testOK);
            condicionOK = !(caramelos >= 0 && caramelos <= 1000);
            if (condicionOK) {
                System.out.println("Error e entrada, introduce una cantidad correcta.");
            }
            if (caramelos >= 100 && caramelos < 200) {
                bolsas = 1;
                unidadesCaramelos = caramelos - 100;
            } else if (caramelos >= 200 && caramelos < 300) {
                bolsas = 2;
                unidadesCaramelos = caramelos - 200;
            } else if (caramelos >= 300 && caramelos < 400) {
                bolsas = 3;
                unidadesCaramelos = caramelos - 300;
            } else if (caramelos >= 400 && caramelos < 500) {
                bolsas = 4;
                unidadesCaramelos = caramelos - 400;
            } else if (caramelos >= 500 && caramelos < 600) {
                bolsas = 5;
                unidadesCaramelos = caramelos - 500;
            } else if (caramelos >= 600 && caramelos < 700) {
                bolsas = 6;
                unidadesCaramelos = caramelos - 600;
            } else if (caramelos >= 700 && caramelos < 800) {
                bolsas = 7;
                unidadesCaramelos = caramelos - 700;
            } else if (caramelos >= 800 && caramelos < 900) {
                bolsas = 8;
                unidadesCaramelos = caramelos - 800;
            } else if (caramelos >= 900 && caramelos < 1000) {
                bolsas = 9;
                unidadesCaramelos = caramelos - 900;
            }

            //Importe de las bolsas.
            importeBolsas = bolsas * PRECIO_BOLSA;
            //Importe de caramelos.
            importeCaramelos = unidadesCaramelos * PRECIO_CARAMELO;
            //Precio bruto del pedido.
            precioBruto = PRECIO_BOLSA * bolsas + PRECIO_CARAMELO * unidadesCaramelos;
            //Cantidad de IVA.
            ivaEfectivo = IVA * precioBruto / 100;
            //Cantidad de descuento.
            descuentoEfectivo = 5 * bolsas / 100;
            //Precio neto.
            precioNeto = precioBruto + ivaEfectivo;
            //Precio del pedido con descuento.
            precioConDescuento = precioBruto - descuentoEfectivo;
            
            if (unidadesCaramelos == 0) {
                precioConDescuento = precioBruto;
            }
        } while (condicionOK);

        //Cantidad de bolsas completas que se suministran en el pedido.
        System.out.printf("Bolsas completas............: %d\n", bolsas);
        //Cantidad de caramelos sueltos que se suministran en el pedido.
        System.out.printf("Caramelos sueltos...........: %d\n\n", unidadesCaramelos);

        //Importe de las bolsas que se suministran.
        System.out.printf("Importe bolsas..............:%.2f\n", importeBolsas);
        //Importe de los caramelos que se suministran.
        System.out.printf("Importe bolsas..............:%.2f\n\n", importeCaramelos);

        //Importe bruto del pedido.
        System.out.printf("Importe previo..............:%.2f\n", precioBruto);

        //Cantidad de descuento.
        System.out.printf("Descuento...................: %.2f\n\n", descuentoEfectivo);

        //Importe bruto con descuento aplicado.
        System.out.printf("Precio con decuento.........: %.2f\n\n", precioConDescuento);

        //Cantidad de IVA aplicado.
        System.out.printf("IVA.........................: %.2f\n\n", ivaEfectivo);

        //Importe con IVA aplicado.
        System.out.printf("Precio con IVA aplicado.....: %.2f\n", precioNeto);
    }
}
