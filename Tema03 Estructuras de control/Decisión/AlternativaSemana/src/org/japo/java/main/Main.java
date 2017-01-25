package org.japo.java.main;

//Importación de Scanner.
import java.util.Scanner;
//Importación de Locale.
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
        //Días de la semana.
        final String LUNES = "Lunes";
        final String MARTES = "Martes";
        final String MIERCOLES = "Miércoles";
        final String JUEVES = "Jueves";
        final String VIERNES = "Viernes";
        final String SABADO = "Sábado";
        final String DOMINGO = "Domingo";
        final String ERROR = "Eso no esa un día de la semana";
        
        //Variables.
        //Día numérico de la semana deseado.
        System.out.println("Introduce el número del día de la semana...");
        int diaSemanaDeseado = sc.nextInt();
        //Día de la semana real al que correspode.
        String diaSemanaCorrecto = sc.nextLine();
        
        //Cálculos.
        switch (diaSemanaDeseado){
            case 1:
               diaSemanaCorrecto = LUNES;
                break;
            case 2:
                diaSemanaCorrecto = MARTES;
                break;
            case 3:
                diaSemanaCorrecto = MIERCOLES;
                break;
            case 4:
                diaSemanaCorrecto = JUEVES;
                break;
            case 5:
                diaSemanaCorrecto = VIERNES;
                break;
            case 6:
                diaSemanaCorrecto = SABADO;
                break;
            case 7:
                diaSemanaCorrecto = DOMINGO;
                break;
            default:
                diaSemanaCorrecto = ERROR;
        }
        //Resultado.
        System.out.println("Día de la semana: "+diaSemanaCorrecto);
        }
    }

