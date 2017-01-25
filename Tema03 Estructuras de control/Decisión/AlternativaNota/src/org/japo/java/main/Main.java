
package org.japo.java.main;

//Importación Scanner.
import java.util.Scanner;
//Importación Locale.
import java.util.Locale;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Instancia objeto Scanner.
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        //Instancia objeto Locale.
        Locale l = new Locale("ES", "es");
        sc.useLocale(l);
        
        //Constantes.        
        //Calificaciones.
        final String CALIFICACION_1 = "Muy deficiente";
        final String CALIFICACION_2 = "Insuficiente";
        final String CALIFICACION_3 = "Suficiente";
        final String CALIFICACION_4 = "Bien";
        final String CALIFICACION_5 = "Notable";
        final String CALIFICACION_6 = "Sobresaliente";
        final String CALIFICACION_7 = "Eso no es una calificación";
        
        
        //Variables.
        //Nota obtenida.
        System.out.println("Que nota has sacado...");
        double nota = sc.nextDouble();
        //Calificación obtenida.
        String calificacion=CALIFICACION_7;
                
        //Cálculos.
        
        if (nota >= 0 && nota < 3){
            calificacion = CALIFICACION_1;
        } else if (nota >=3  && nota < 5){
               calificacion = CALIFICACION_2;
            } else if (nota >=5  && nota < 6){
                calificacion = CALIFICACION_3;
              }  else if (nota >=6  && nota < 7){
                    calificacion = CALIFICACION_4;
                 } else if (nota >=7  && nota < 9){
                     calificacion = CALIFICACION_5;
                     }  else if (nota >=9  && nota <= 10){
                         calificacion = CALIFICACION_6;
                       } else {
                          }
        //Resultado.
        System.out.printf("Tu nota es: %.2f\n", nota);
        System.out.println("Tu calificación es: "+calificacion);
        
    }   
}
