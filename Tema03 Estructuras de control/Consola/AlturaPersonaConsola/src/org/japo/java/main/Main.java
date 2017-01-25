
package org.japo.java.main;

//Importación objeto Scanner.
import java.util.Locale;
//Importación objeto Locale.
import java.util.Scanner;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instanciación objeto Scanner.
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        //Instanciación objeto Locale.
        Locale l = new Locale("EN");
        sc.useLocale(l);
        
        //Variables.
        double altura;
        
        //Resolución.
        try{
        System.out.printf("Introduce tus metros de altura: ");
        altura = sc.nextDouble();
        System.out.printf("Tu altura es de %.2f metros", altura);
        } catch (Exception e){
            System.out.println("No puedes medir eso...");
        }
    } 
}
