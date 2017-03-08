package org.japo.java.app;
import org.japo.java.entities.Decimo;
//@author 2K16 - Angel Pastelero angel.pastelero399@gmail.com
public class App {
    //
    //
    public void lanzarAplicacion() {
        Decimo d1 = new Decimo();
        Decimo d2 = new Decimo(5, 55000, 50);
        Decimo d3 = new Decimo(11, 55000, 42);
        Decimo d4 = new Decimo(8, 41247, 66);
        
         System.out.printf("D1 : \n");
         d1.mostrarDecimo();
         System.out.printf("D2 : \n");
        d2.mostrarDecimo();
        
        d1.setFraccion(8);
        d1.setNumero(41247);
        d1.setSerie(66);
        System.out.printf("D1 : \n");
        d1.mostrarDecimo();
        System.out.printf("D3 : \n");
        d3.mostrarDecimo();
        System.out.printf("D4 : \n");
        d4.mostrarDecimo();
        
        System.out.println("D4 : " + d4.toString());

        
        System.out.printf(d1.equals(d4)  + "\n" + d1.equals(d3) + "\n");

    }
}