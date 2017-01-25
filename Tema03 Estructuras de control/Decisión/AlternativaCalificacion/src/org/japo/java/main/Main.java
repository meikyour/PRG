
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
        final String CAL_NE = "No evaluado";
        final String CAL_NP = "No presentado"; 
        final String CAL_MD = "Muy deficiente"; 
        final String CAL_IN = "Insuficiente"; 
        final String CAL_SF = "Suficiente"; 
        final String CAL_BN = "Bien"; 
        final String CAL_NT = "Notable";
        final String CAL_SB = "SobresalienteSobresaliente";
        final String CAL_XX = "Calificación errónea";
try {   
    
    // Instancia un objeto Scanner
    Scanner sc = new Scanner(System.in);
    
    // Introduce la calificación numérica
    System.out.print("Calificación numérica ....: ");
    int calNumerica = sc.nextInt();
    
    // Gestiona la nota
    String calDescriptiva;
    switch (calNumerica) {
        case 0:
            calDescriptiva = CAL_NE;
            break;
        case 1:
            calDescriptiva = CAL_NP;
            break;
        case 2:
        case 3:
            calDescriptiva = CAL_MD;
            break;
        case 4:
            calDescriptiva = CAL_IN;
            break;
        case 5:
            calDescriptiva = CAL_SF;
            break;
        case 6:
            calDescriptiva = CAL_BN;
            break;
        case 7:
        case 8:
            calDescriptiva = CAL_NT;
            break;
        case 9:
            calDescriptiva = CAL_SB;
            break;
                    
       default:
            calDescriptiva = CAL_XX;
    }
       // Muestra la calificación
       System.out.printf("Calificación descriptiva .: %s\n", calDescriptiva);
} catch (Exception e) {
       System.out.println("Error en la entrada");
        }
    } 
}
