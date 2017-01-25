/*
 * Copyright 2016 2K16 - Angel Pastelero angel.pastelero399@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 * @author 2K16 - Angel Pastelero angel.pastelero399@gmail.com
 */
public class App {
    // Iniciar Aplicacion  
    private static final int ANY = 2016;
    private static final int MES = 12;
    private static final int DIA = 31;
    
    public void lanzarAplicacion() {
        
        if (comprobarFecha(ANY, MES, DIA)) {
            System.out.printf("La fecha %02d/%02d/%02d SI es correcta\n",DIA, MES, ANY );
        } else {
            System.out.printf("La fecha %02d/%02d/%02d NO es correcta\n",DIA, MES, ANY );
        }
    }
    
    private boolean comprobarFecha(int any, int mes, int dia){
        return comprobarMes(mes) && comprobarDia(any, mes, dia);
    }

    
    private boolean comprobarMes(int mes) {
        return mes >= 0 && mes <= 12;
    }
    
    private boolean comprobarDia(int any , int mes ,int dia){
    int diasMax = obtenerDiasDelMes(any, mes);
    return dia >= 0 && dia <= diasMax;
    
    }
    
    private boolean comprobarMes31(int mes) {
        return mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
    }
    
    private boolean comprobarMes30(int mes) {
        return mes == 4 || mes == 6 || mes == 9 || mes == 11;
    }
    
    private int obtenerDiasDelMes(int any, int mes) {
        int dias;
        if (comprobarMes31(mes)) {
            dias = 31;
        } else if (comprobarMes30(mes)){
            dias = 30;
        } else {
            dias = obtenerDiasFebrero(any);
        }
        return dias;
    }
    
    private boolean comprobarBisiesto(int any) {
        return any % 400 == 0 || any % 100 != 0 && any % 4 == 0;
    }
    
    private int obtenerDiasFebrero(int any) {
        int dias;
        if (comprobarBisiesto(any)) {
            dias = 29;
        } else {
            dias = 28;
        }
        return dias;
    }
            
            
}
