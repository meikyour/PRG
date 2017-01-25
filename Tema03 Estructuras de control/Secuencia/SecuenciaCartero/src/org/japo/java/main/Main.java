package org.japo.java.main;

public class Main {
    public static void main(String[]arg){
        
        //Constantes.
        final String DESTINATARIO_CORRECTO = "Elvira Alegre";
        final String DESTINATARIO_ACTUAL = "Federico López";
        System.out.printf("%s recibió una carta y la dirección era correcta, pero el destinatario no, estaba a nombre de %s\n ",DESTINATARIO_CORRECTO, DESTINATARIO_ACTUAL);
        
        //Veces al mes que a llegado la carta hasta ahora.
        final int vecesCartaMes= 3;
        System.out.printf("Este mes había recibido mal la carta %d veces\n ",vecesCartaMes);
        
        //Variables.
        //Veces actuales al mes que a llegado la carta.
        int posiblesVecesCartaMes = 4;            //Veces al mes que puede llegar la carta, puede variar y con ello varia el resultado.
        System.out.println("Será la última vez que le llegue mal este mes...");
        
        //Boolean que si se cumplen afectan para que llegue la carta.
        boolean federicoLopez = false;
        boolean llegoLaCarta = posiblesVecesCartaMes <= 3 || federicoLopez;
        
        //Si cambiarán los valores de las variables cambiaria esta situación.
        if (posiblesVecesCartaMes <= 3) {
            System.out.println("Se han vuelto a equivocar, la han enviado a nombre de "+DESTINATARIO_ACTUAL);
        }   
            else {
                if (federicoLopez) {
            System.out.println("Se han vuelto a equivocar, a llegado a la carta a nombre de "+DESTINATARIO_ACTUAL);
                }
                
                    else {
                    System.out.println("Por ahora no se han equivocado...");
                    }
            }
    }
}
      
        
        

