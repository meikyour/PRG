/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probaarrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class ProbaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        int lluvia[] = new int[12];
        int plutja[][] = new int[12][31];
        
        String nomsFamilia[] = new String[4];

        try {
            for (int i = 0; i <= 3; i++) {
                nomsFamilia[i] = reader.readLine();
            }
        } catch (Exception e) {
        }

//-------------------------------------------------------------------    
        for (int i = 0; i <= 3; i++) {
            System.out.println(nomsFamilia[i]);
        }
//-------------------------------------------------------------------    

        try {
            for (int i = 0; i <= 11; i++) {  //entrada=reader.readLine();
                lluvia[i] = Integer.parseInt(reader.readLine());
            }
        } catch (Exception e) {
        }
        //------------------------------------------------------------------- 
        for (int i = 0; i <= 11; i++) {
            System.out.println("mes " + i + "lluvia " + lluvia[i]);
        }
        //-------------------------------------------------------------------    
        int lluviaAcumulada = 0;

        for (int i = 0; i <= 11; i++) {
            lluviaAcumulada = lluviaAcumulada + lluvia[i];
        }
        System.out.println("todo el anyo ha llovido: " + lluviaAcumulada);

        System.out.println("la media mensual ha sido: " + lluviaAcumulada / 12);
        //-------------------------------------------------------------------   
        int mes = 0;
        try {
            entrada = reader.readLine();
            mes = Integer.parseInt(entrada);

        } catch (Exception e) {
        }
        System.out.println(lluvia[mes]);
//-------------------------------------------------------------------   
        System.out.println(lluvia[5]);
        //-------------------------------------------------------------------   
        try {
            for (int i = 0; i <= 11; i++) {
                for (int j = 0; j <= 30; j++) {
                    entrada = reader.readLine();
                    plutja[i][j] = Integer.parseInt(entrada);
                }
            }
        } catch (Exception e) {
        }

        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 30; j++) {
                System.out.println(plutja[i][j]);
            }
        }
        //-------------------------------------------------------------------     

        int lluviaMes;
        for (int i = 0; i <= 11; i++) {
            lluviaMes = 0;
            for (int j = 0; j <= 30; j++) {
                lluviaMes = lluviaMes + plutja[i][j];
            }
            System.out.println("mes " + i + " lluvia " + lluviaMes);
        }

        //-------------------------------------------------------------------        
        mes = 0;
        try {
            entrada = reader.readLine();
            mes = Integer.parseInt(entrada);

        } catch (Exception e) {
        }

        for (int k = 0; k <= 30; k++) {
            System.out.println(plutja[mes][k]);

//-------------------------------------------------------------------------
            String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
            for (int i = 0; i <= 6; i++) {
                System.out.println(diasSemana[i]);
            }

            int[] temperaturasDias = {23, 25, 21, 20, 24, 22, 21};
            for (int j = 0; j <= 6; j++) {
                System.out.println(temperaturasDias[j]);
            }

            for (int i = 0; i <= 6; i++) {
                System.out.println("dia " + diasSemana[i] + "   temperatura " + temperaturasDias[i]);
            }

//------------------------------------------------------------------------------------------------------
            //Proba també posant  [] no en el tipo sino en el nom del Array:
            int temperaturasDiasBis[] = {23, 25, 21, 20, 24, 22, 21};
            String diasSemanaBis[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        }
    }
}
