
package org.japo.java.main;

//Importación de Scanner.
import java.util.Scanner;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constantes
        final int NUM_MES_INI = 1;
        final int NUM_MES_FIN = 12;
        
        // Variables de trabajo
        int numeroDiasMes;
        int numeroMes;
        int any;
        
        // Instancia un objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Introducir numero de mes
        System.out.print("Mes a analizar .: ");
        numeroMes = sc.nextInt();
        
        // Introducir año
        System.out.print("Año del mes ....: ");
        any = sc.nextInt();
        
        // Analiza el mes introducido
        if (numeroMes < NUM_MES_INI || numeroMes > NUM_MES_FIN){
            System.out.println("Dato incorrecto");
        } else {
            if (numeroMes == 2){
                if (any % 400 == 0 || any % 100 != 0 && any % 4 == 0) {
                    numeroDiasMes = 29;
                } else {
                    numeroDiasMes = 28;
                }
            }else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
                numeroDiasMes = 30;
            } else {
                numeroDiasMes = 31;
            }
            System.out.printf("El mes %d tiene %d dias\n", numeroMes, numeroDiasMes);
        }
    }
    
}
