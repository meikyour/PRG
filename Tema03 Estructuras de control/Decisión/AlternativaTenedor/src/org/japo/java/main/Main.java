
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
        final String COMIDA1 = "carne";
        final String COMIDA2 = "pescado";
        final int PUAS0 = 0;
        final int PUAS1 = 3;
        final int PUAS2 = 4;
        
        // Instancia un objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Introduce el tipo de comida
        System.out.print("Tipo de comida......: ");
        String tipoComida = sc.nextLine();
        
        // Analiza el tipo de comida
        int puas;
        if (tipoComida.equals(COMIDA1)){
            puas = PUAS1;
        } else if (tipoComida.equals(COMIDA2)){
            puas = PUAS2;
        } else {
            puas = PUAS0;
        };
        
        // Muestra el resultado
        System.out.printf("El tenedor tiene ...: %d púas\n", puas);
    }
}
