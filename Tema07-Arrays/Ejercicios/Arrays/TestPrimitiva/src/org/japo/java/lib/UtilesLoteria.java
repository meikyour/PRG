package org.japo.java.lib;

//@author 2K16 - Angel Pastelero angel.pastelero399@gmail.com
public class UtilesLoteria {
    
    //
    
    public static final int NUMEROS_DISPONIBLES = 49;
    public static final int NUMEROS_UTILIZABLES = 6;
    
    public static void generarApuestaPrimitiva(int[] sorteo) {
        java.util.Random rnd = new java.util.Random();
        int[] bombo = new int[NUMEROS_DISPONIBLES];
        
        for (int i = 0; i < bombo.length; i++) {
            bombo[i] = i + 1;
        }
        
        
        
            for (int i = 0; i < NUMEROS_UTILIZABLES; i++) {
                int posicion = rnd.nextInt(NUMEROS_DISPONIBLES - i);
                sorteo[i] = bombo[posicion];
                bombo[posicion] = bombo[NUMEROS_DISPONIBLES - i - 1];
                
              
                
                
            }
    }

}
