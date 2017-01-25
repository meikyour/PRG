package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Yolanda Gaona Ríos www.gaori.es
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Inicializacion Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        //Locale
        Locale lcl = new Locale("EN");
        scn.useLocale(lcl);

        //Variables
        int totalPedido = 0;
        boolean condicionOK = true;
        boolean testOK = true;
        //CONSTANTES
        final int MAX_CARAMELOS = 1000;
        final int TAM_BOLSA = 100;
        final double VALUE_BOLSA = 5.0f;
        final double VALUE_SUELTO = 0.07f;

      
        final float IVA = 0.21f;

        // int bCompletas = n / 100;
        // int caramelosSueltos = n % 100;
        //double importeBolsas = totalPedido /100 * 5;
        //     double importeSueltos = caramelosSueltos * 0.07;
        //  double importePrevio = bCompletas + caramelosSueltos;
        // final double IVA = ImporteBruto * 0.21;
        //double importePVP =  ImporteBruto * 1.21;
//Prints
        System.out.printf(
                "CARAMELOS PARA BAUTIZOS\n");
        System.out.printf(
                "=======================\n\n");
        do {
            do {

                try {
                    System.out.print("Cantidad de caramelos ...: ");
                    totalPedido = scn.nextInt();
                    condicionOK = false;
                } catch (Exception e) {
                    System.out.printf(">>> Entrada errónea\n");
                } finally {
                    scn.nextLine();
                }
            } while (condicionOK);
            condicionOK = !(totalPedido <= 1000 && totalPedido >= 0);
            if (condicionOK) {
                System.out.printf(">>> Entrada errónea\n");
            }
        } while (condicionOK);

        //Distribuir caramelos en bolsas +sueltos
        int bolsasCompletas = totalPedido / TAM_BOLSA;
        int caramelosSueltos = totalPedido % TAM_BOLSA;

        System.out.println("Bolsas completas ........: " + bolsasCompletas);
        System.out.println("Caramelos sueltos .......: " + caramelosSueltos);

        System.out.println();

        //Importe de caramelos
        double importeBolsas = bolsasCompletas * VALUE_BOLSA;
        double importeSuelto = caramelosSueltos * VALUE_SUELTO;
        

        System.out.printf("Importe bolsas ..........: %.2f €", importeBolsas);
        System.out.println();
        System.out.printf("Importe suelto ..........: %.2f €", importeSuelto);
        System.out.println();

        System.out.println();

        //importe previo
        double importePrevio = importeBolsas + importeSuelto;

        System.out.printf("Importe previo ..........: %.2f €", importePrevio);
        System.out.println();
        
        if (caramelosSueltos == 0){
            System.out.printf("Descuento ( 5% ).........:%.2f€\n \n", importePrevio * 0.05);
            System.out.printf("Importe bruto............:%f\n \n", importePrevio * 1.05);
        } else{
            System.out.println("jaja");
        }
    }
}
