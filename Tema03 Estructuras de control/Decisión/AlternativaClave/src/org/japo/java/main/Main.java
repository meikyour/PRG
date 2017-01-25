
package org.japo.java.main;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        //Constantes.
        final String CLAVE_SECRETA = "12345";
        final String IDENTIFICATIVO ="S@rgOz";
        
        //Variables.
        boolean testOk = CLAVE_SECRETA.equals(IDENTIFICATIVO);
        String mensaje;
        
        //Cálculos.
        if(testOk){
            mensaje = "Llave SI encontrada";
        }
        else {
            mensaje = "Llave NO encontrada";
        }
        System.out.println("Parece que "+mensaje);
    }
}
