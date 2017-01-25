
package org.japo.java.main;

public class Main {
    public static void main(String[]arg){
        
        //Constantes.
        final int VACAS = 3;
        final int OVEJAS = 14;
        final int BURROS = 2;
        final int GALLINAS = 18;
        
        //Variables
        int numeroParesZapatos;         //Total de pares de zapatos que tiene.
        
        //Numero de pares de zapatos que tiene.
        numeroParesZapatos= ((VACAS + OVEJAS + BURROS) * 4 + GALLINAS * 2) / 2;
        System.out.printf("Tiene %d pares de zapatos", numeroParesZapatos);
    }
}
