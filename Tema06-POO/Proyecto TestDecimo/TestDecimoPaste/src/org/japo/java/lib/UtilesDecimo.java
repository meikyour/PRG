package org.japo.java.lib;
//@author 2K16 - Angel Pastelero angel.pastelero399@gmail.com

public class UtilesDecimo {
    public static int generarDecimoAleatorio(int MIN, int MAX) {
        java.util.Random rnd = new java.util.Random();
        return rnd.nextInt(MAX - MIN + 1) + MIN;
    }
}
