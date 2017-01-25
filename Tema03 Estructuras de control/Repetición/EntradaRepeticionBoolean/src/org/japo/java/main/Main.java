
package org.japo.java.main;

//Importamos la clase Scanner.
import java.util.Scanner;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
     
        //Instanciación objeto Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");         //INICIO.

        //Variables.  
        boolean b = true;                                           //INICIO.
        boolean valorPendienteOK = true;                            //INICIO.

        //Cálculos.
        do {                                                        //BUCLE.
            try {                                                   //BUCLE.
                System.out.print("Valor lógico.......: ");          //BUCLE.
                b = scn.nextBoolean();                              //BUCLE.
                valorPendienteOK = false;                           //ACTUALIZACIÓN.
            } catch (Exception e) {                                 //BUCLE.
                System.out.println("Error entrada.");               //BUCLE.
            } finally {                                             //BUCLE.
                scn.nextLine();                                     //BUCLE.
            }
        } while (valorPendienteOK);                                 //CONTROL.
        System.out.println("Valor lógico.............: "+ b);       //CONTROL.
    } 
}
