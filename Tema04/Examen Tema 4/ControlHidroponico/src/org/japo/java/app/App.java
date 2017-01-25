/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
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

//Importación de la clase Random.
import java.util.Random;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    //Constantes con los rangos de humedad mínimos y máximos.
    public static final int H_MIN = 71;
    public static final int H_MAX = 86;
    //Constantes con los rangos de temperatura mínimos y máximos.
    public static final int T_MIN = 19;
    public static final int T_MAX = 22;
    //Constantes con los rangos de iluminación mínimos y máximos.
    public static final int I_MIN = 2;
    public static final int I_MAX = 13;
    //Constantes con los mensajes de niveles aceptables o inaceptables.
    public static final String correcto = "OK";
    public static final String error = "ALARMA";

    //Instanciación de la clase Random.
    Random rnd = new Random(System.currentTimeMillis());

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Valor de humedad aleatorio.
        int numeroHumedad = rnd.nextInt(100 - 0);
        //Valor de temperatura aleatorio.
        int numeroTemperatura = rnd.nextInt(100 - 0);
        //Valor de iluminación aleatorio.
        int numeroIluminacion = rnd.nextInt(100 - 0);

        //Devuelve la humedad actual si está dentro del rango.
        boolean rangoHumedad = analizarEntero(numeroHumedad, H_MIN, H_MAX);
         //Devuelve la temperatura actual si está dentro del rango.
        boolean rangoTemperatura = analizarEntero(numeroTemperatura, T_MIN, T_MAX);
         //Devuelve la iluminación actual si está dentro del rango.
        boolean rangoIluminacion = analizarEntero(numeroIluminacion, I_MIN, I_MAX);

        //Variables que indican con mensajes si el rango de humedad es correcto (OK) o incorrecto (ALARMA).
        String humedad;
        String temperatura;
        String iluminacion;

        //Analizar rango de humedad si es correcto o no.
        if (rangoHumedad) {
            humedad = correcto;
            System.out.printf("Humedad.............: %d  -  %s\n", numeroHumedad, humedad);
        } else {
            humedad = error;
            System.out.printf("Humedad.............: %d  -  %s\n", numeroHumedad, humedad);
        }

        //Analizar rango de temperatura si es correcto o no.
        if (rangoTemperatura) {
            temperatura = correcto;
            System.out.printf("Temperatura.........: %d  -  %s\n", numeroTemperatura, temperatura);
        } else {
            temperatura = error;
            System.out.printf("Temperatura.........: %d  -  %s\n", numeroTemperatura, temperatura);
        }

        //Analizar rango de iluminación si es correcto o no.
        if (rangoIluminacion) {
            iluminacion = correcto;
            System.out.printf("Iluminación.........: %d  -  %s\n", numeroIluminacion, iluminacion);
        } else {
            iluminacion = error;
            System.out.printf("Iluminación.........: %d  -  %s\n", numeroIluminacion, iluminacion);
        }
    }

    //Analiza el numero aleatorio obtenido.
    private boolean analizarEntero(int num, int min, int max) {

        //Devuelve el valor si está dentro del rango.
        return num >= min && num <= max;
    }

}
