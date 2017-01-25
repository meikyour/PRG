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

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia objeto Scanner.
        Scanner sc = new Scanner(System.in);
        //Instancia objeto Locale.
        Locale l = new Locale("ES", "es");
        sc.useLocale(l);
        
        //Constantes.
        //Meses del año.
        final String ENERO = "Enero";
        final String FEBRERO = "Febrero";
        final String MARZO = "Marzo";
        final String ABRIL = "Abril";
        final String MAYO = "Mayo";
        final String JUNIO = "Junio";
        final String JULIO = "Julio";
        final String AGOSTO = "Agosto";
        final String SEPTIEMBRE = "Septiembre";
        final String OCTUBRE = "Octubre";
        final String NOVIEMBRE = "Noviembre";
        final String DICIEMBRE = "Diciembre";
        final String ERROR = "Eso no es un mes del año";
        
        
        //Variables.
        //Mes numérico deseado.
        System.out.println("Introduce el mes deseado...");
        int mesDeseado = sc.nextInt();
        //Mes real con el que se corresponde.
        String mesReal = sc.nextLine();
        
        //Cálculos.
        switch (mesDeseado){
            case 1:
               mesReal = ENERO;
                break;
            case 2:
                mesReal = FEBRERO;
                break;
            case 3:
                mesReal = MARZO;
                break;
            case 4:
                mesReal = ABRIL;
                break;
            case 5:
                mesReal = MAYO;
                break;
            case 6:
                mesReal = JUNIO;
                break;
            case 7:
                mesReal = JULIO;
                break;
            case 8:
               mesReal = AGOSTO;
                break;
            case 9:
                mesReal = SEPTIEMBRE;
                break;
            case 10:
                mesReal = OCTUBRE;
                break;
            case 11:
                mesReal = NOVIEMBRE;
                break;
            case 12:
                mesReal = DICIEMBRE;
                break;
            default:
                mesReal = ERROR;
        } 
        //Mes actual.
        System.out.println("Mes: "+mesReal);  
    }   
}

