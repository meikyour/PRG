
package org.japo.java.main;

//Imporatación de Scanner.
import java.util.Scanner;
//Importación de Locale.
import java.util.Locale;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instáncia objeto Scanner.
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        //Instáncia objeto Locale.
        Locale l = new Locale("ES", "es");
        sc.useLocale(l);
        
        //Constantes.
        //Signos del zodiaco.
        final String ARIES = "Aries";
        final String TAURO = "Tauro";
        final String GEMINIS = "Géminis";
        final String CANCER = "Cáncer";
        final String LEO = "Leo";
        final String VIRGO = "Virgo";
        final String LIBRA = "Libra";
        final String ESCORPIO = "Escorpio";
        final String SAGITARIO = "Sagitario";
        final String CAPRICORNIO = "Capricornio";
        final String ACUARIO = "Acuario";
        final String PISCIS = "Piscis";
      
        //Variables.
        //Día de nacimiento.
        System.out.println("Introduce el día de nacimiento: ");
        int diaNacimiento = sc.nextInt();
        //Mes de nacimiento.
        System.out.println("Introduce el mes de nacimiento: ");
        int mesNacimiento = sc.nextInt();
        //Signo del zodiaco correcto.
        String signoZodiacoCorrecto = sc.nextLine();
        
        //Cálculos.
        if ((diaNacimiento >= 21 && mesNacimiento == 3) || (diaNacimiento <= 20 && mesNacimiento == 4)){
            signoZodiacoCorrecto = ARIES;      
        } else if ((diaNacimiento >= 21 && mesNacimiento == 4) && (diaNacimiento <= 21 && mesNacimiento == 5)) {
            signoZodiacoCorrecto = TAURO;
            } else if ((diaNacimiento >= 22 && mesNacimiento == 5) && (diaNacimiento <= 21 && mesNacimiento == 6)){
                signoZodiacoCorrecto = GEMINIS;
              } else if ((diaNacimiento >= 21 && mesNacimiento == 6) || (diaNacimiento <= 23 && mesNacimiento == 7)){
                signoZodiacoCorrecto = CANCER;
                } else if ((diaNacimiento >= 24 && mesNacimiento == 7) || diaNacimiento <= 23 && mesNacimiento == 8){
                    signoZodiacoCorrecto = LEO;
                  } else if ((diaNacimiento >= 24 && mesNacimiento == 8) || diaNacimiento <= 23 && mesNacimiento == 9) {
                       signoZodiacoCorrecto = VIRGO;
                    } else if ((diaNacimiento >= 24 && mesNacimiento == 9) || diaNacimiento <= 23 && mesNacimiento == 10){
                         signoZodiacoCorrecto = LIBRA;
                      } else if ((diaNacimiento >= 24 && mesNacimiento == 10) || diaNacimiento <= 22 && mesNacimiento == 11){
                           signoZodiacoCorrecto = ESCORPIO;
                        } else if ((diaNacimiento >= 23 && mesNacimiento == 11) || diaNacimiento <= 21 && mesNacimiento == 12){
                             signoZodiacoCorrecto = SAGITARIO;
                          } else if ((diaNacimiento >= 22 && mesNacimiento == 12) || diaNacimiento <= 20 && mesNacimiento == 1){
                              signoZodiacoCorrecto = CAPRICORNIO;
                            } else if ((diaNacimiento >= 21 && mesNacimiento == 1) || diaNacimiento <= 19 && mesNacimiento == 2){
                                signoZodiacoCorrecto = ACUARIO;
                              } else if ((diaNacimiento >= 20 && mesNacimiento == 2) || diaNacimiento <= 20 && mesNacimiento == 3){
                                  signoZodiacoCorrecto = PISCIS;
                               }
                                else {
                                  System.out.println("Eso no es ninguna fecha de nacimiento.");
                               }
        //Resolución.
        System.out.printf("Tu fecha de nacimiento es: %d/%02d\n", diaNacimiento, mesNacimiento);
        System.out.println("Tu signo del zodiaco es: "+signoZodiacoCorrecto);   
}
}
