/*
 * Copyright 2017 CicloM.
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
package org.japo.java.lib;

/**
 *
 * @author Raul Granel - raul.granel@gmail.com
 */
public class UtilesSemana {

    //Codigos
    public static final int CODIGO_ESP = 34;
    public static final int CODIGO_ING = 44;
    public static final int CODIGO_ALE = 49;

    //Nombres
    public static final String NOMBRE_ESP = "Español";
    public static final String NOMBRE_ING = "Ingles";
    public static final String NOMBRE_ALE = "Aleman";

    //Días
    public static final String[] DIAS_ESP = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    public static final String[] DIAS_ING = {"Monday", "Tuestay", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static final String[] DIAS_ALE = {"Montag", "Dienstag", "Miitwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};

    public static String obtenerNombreDia(int dia, int idioma) {
        String nombre = "Desconocido";

        switch (idioma) {
            case CODIGO_ESP:
                nombre = String.format("%s (%s)", DIAS_ESP[dia - 1], NOMBRE_ESP);
                break;
            case CODIGO_ING:
                nombre = String.format("%s (%s)", DIAS_ING[dia - 1], NOMBRE_ING);
                break;
            case CODIGO_ALE:
                nombre = String.format("%s (%s)", DIAS_ALE[dia - 1], NOMBRE_ALE);
        }
        return nombre;

    }

}
