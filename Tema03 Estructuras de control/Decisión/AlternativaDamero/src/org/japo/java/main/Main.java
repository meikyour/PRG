
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
        final int ANCHO_TABLERO = 800;
        final int ALTO_TABLERO = 800;
        final char FILA_MIN = 1;
        final char FILA_MAX = 8;
        final char COLU_MIN = 'a';
        final char COLU_MAX = 'h';
        
        // Variables
        int xAct;
        int yAct;
        int filaAct;
        char coluAct;
       
        // Tamaño del damero
        int numFilas = FILA_MAX - FILA_MIN + 1;
        int numColus = COLU_MAX - COLU_MIN + 1;
       
        // Tamaño e casilla 
        int altoFila = ALTO_TABLERO / numFilas;
        int anchoColu = ANCHO_TABLERO / numColus;
        
        // Instanciar objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Introducir la coordenada X
        System.out.print("Coordenada X ...: ");
        xAct = sc.nextInt();
        
        // Introducir la coordenada Y
        System.out.print("Coordenada Y ...: ");
        yAct = sc.nextInt();
        
        // Columna actual
        if (xAct >= 0 && xAct < ANCHO_TABLERO) {
            coluAct = (char) (xAct / anchoColu + COLU_MIN);
        } else {
            coluAct = '?';
        }
        // Fila actual
        if (yAct >= 0 || yAct < ANCHO_TABLERO){
            filaAct = (char) (yAct / altoFila + FILA_MIN);
        } else {
            filaAct ='?';
        }
        
        // Muestra la posicion equivalente
        if (coluAct == '?' || filaAct == '?') {
            System.out.println("Posición incorrecta");
        } else {
            System.out.printf("Posición .......: %c%d\n", coluAct, filaAct);  
        }
    }
    
}
