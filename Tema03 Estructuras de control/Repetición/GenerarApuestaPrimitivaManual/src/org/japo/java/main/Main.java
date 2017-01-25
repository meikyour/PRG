package org.japo.java.main;

//Scanner.
import java.util.Scanner;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        
        //Limites de tiradas.
        final int TIRADAS = 6;
        
        //Entrada de teclado.
        for (int i = 0; i < TIRADAS; i++){
            System.out.printf("Tirada %d ..................: ", i + 1);
            int n = scn.nextInt();
            System.out.printf("Tirada %d ..................: %d\n", i + 1, n);
        }
    }
}
