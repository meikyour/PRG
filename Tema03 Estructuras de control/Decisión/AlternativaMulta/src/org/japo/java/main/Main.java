
package org.japo.java.main;

//Importación de Scanner.
import java.util.Scanner;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        // Referencias
        final double IMPORTE_MULTA = 60.0;
        final int TIPO_DESCUENTO = 20;
        final int DIAS_DESCUENTO = 30;
        // Variables auxiliares
        double importeFinal;
        double importeDecto = 0.0;
        int diasDemora;
        boolean testOk;
        
        // instancia el objecto Scanner
        Scanner sc = new Scanner(System.in);
       
        //Introducir los dias de demora
        System.out.print("Dias de demora..........: ");
        diasDemora = sc.nextInt();
        
        // Comparación 
        testOk = diasDemora <= DIAS_DESCUENTO;
        
        // Calcula el descuento
        if (testOk) {
            importeDecto = IMPORTE_MULTA * TIPO_DESCUENTO / 100;
        }
        
        // Calcula el importe final
        importeFinal = IMPORTE_MULTA - importeDecto;
        
        // Muestra el importe de la multa
         System.out.printf("Importe inicial multa...: %.2f\n", IMPORTE_MULTA);
         System.out.printf("Plazo con descuento.....: %d dias\n", DIAS_DESCUENTO);
         System.out.printf("Tipo de descuento.......: %d %%\n", TIPO_DESCUENTO);
         System.out.printf("Importe descuento.......: %.2f €\n", importeDecto);
         System.out.printf("Importe inicial multa...: %.2f €\n", importeFinal);
    } 
}
