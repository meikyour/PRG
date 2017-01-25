
package org.japo.java.main;

//Importación de Scanner.
import java.util.Scanner;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        // instancia un objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // introduce el año a analizar
        System.out.print("Introduzca año: ");
        int any = sc.nextInt();
        
        // Acceso al calendario del sistema
        //GregorianCalendar gc = new GregorianCalendar();
        //int any = gc.get(Calendar.YEAR);
       
        // Analiza el año
        String decision;
        if (any %400 ==0){
            decision = "SI";
        } else if(any % 100 == 0){
            decision = "NO";
        } else if (any % 4 == 0){
            decision = "SI";
        } else {
            decision = "NO";
        }
        
        // Mensaje resultado 
        System.out.printf("El año %d %s es bisiesto\n", any, decision);
        }
    }
    

