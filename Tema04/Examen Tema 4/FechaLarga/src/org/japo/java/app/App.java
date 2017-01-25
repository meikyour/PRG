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

//Importación clase Gregorian Calendar.
import java.util.GregorianCalendar;

//Importacion clase Calendar.
import java.util.Calendar;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    //1-Instanciación Gregorian Calendar.
    GregorianCalendar gc = new GregorianCalendar();

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Variables día, mes y año.
        int dia;
        int mes;
        int any;

        //Obtener valores del sistema del día, mes y año actuales.
        dia = gc.get(Calendar.DAY_OF_MONTH);
        mes = gc.get(Calendar.MONTH) + 1;
        any = gc.get(Calendar.YEAR);

        //Variable que contiene el nombre del mes del año actual.
        String nameMonth = nombreMes(mes);

        //Mensaje con la fecha actual.
        System.out.printf("Estamos a %d de %s de %d\n", dia, nameMonth, any);

    }

    //Analiza el mes en que estamos y lo asocia a su nombre.
    private String nombreMes(int mes) {

        String nombre = "";

        switch (mes) {
            case 1:
                nombre = "enero";
                break;
            case 2:
                nombre = "febrero";
                break;
            case 3:
                nombre = "marzo";
                break;
            case 4:
                nombre = "abril";
                break;
            case 5:
                nombre = "mayo";
                break;
            case 6:
                nombre = "junio";
                break;
            case 7:
                nombre = "julio";
                break;
            case 8:
                nombre = "agosto";
                break;
            case 9:
                nombre = "septiembre";
                break;
            case 10:
                nombre = "octubre";
                break;
            case 11:
                nombre = "noviembre";
                break;
            case 12:
                nombre = "diciembre";
                break;
        }
        //Devuelve el nombre del mes actual.
        return nombre;
    }

}
