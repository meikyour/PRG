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

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        System.out.println("--------------------WRAPPERS--------------------------");
        System.out.println();

        System.out.println("-------------Cantidad de bytes de: byte, short, int, long----------------");
        System.out.println();
        System.out.println("Bytes - byte...." + Byte.BYTES);
        System.out.println("Bits - byte....." + Byte.SIZE);
        System.out.println();
        System.out.println("Bytes - short..." + Short.BYTES);
        System.out.println("Bits - short...." + Short.SIZE);
        System.out.println();
        System.out.println("Bytes - int....." + Integer.BYTES);
        System.out.println("Bits - int......" + Integer.SIZE);
        System.out.println();
        System.out.println("Bytes - long...." + Long.BYTES);
        System.out.println("Bits - long....." + Long.SIZE);
        System.out.println();

        System.out.println("---------------Máximo valor positivo-----------------");
        System.out.println();
        System.out.println("Máximo valor positivo - float....." + Float.MAX_VALUE);
        System.out.println("Máximo valor positivo - double....." + Double.MAX_VALUE);

        System.out.println();
        System.out.println("---------------Mínimo valor negativo-----------------");
        System.out.println();
        System.out.println("Mínimo valor negativo - float....." + Float.MIN_VALUE);
        System.out.println("Mínimo valor negativo - double....." + Double.MIN_VALUE);
        System.out.println();

        System.out.println("----Proceso BOXING para crear objeto Wrapper (Double) de las clases primitivas----");
        System.out.println();

        new Double(123);
        Double.valueOf(123);
        Double a = (double)123;
        System.out.println("Integer: " + a + " ---- Clase primitiva: " + 123);

        new Double(43.21);
        Double.valueOf(43.21);
        Double b = (43.21);
        System.out.println("Integer: " + b + " ---- Clase primitiva: " + 43.21);

        new Double('W');
        Double.valueOf('W');
        Double c = (double) ('W');
        System.out.println("Integer: " + c + " ---- Clase primitiva: " + 'W');

        
        new Double(2 + 3);
        Double.valueOf(2 + 3);
        Double d = (double)2 + 3;
        System.out.println("Integer: " + d + " ---- Clase primitiva: " + "2 + 3");

        new Double((int) (20 / 3.0));
        Double.valueOf((int) (20 / 3.0));
        Double e = (20 / 3.0);
        System.out.println("Integer: " + e + " ---- Clase primitiva: " + "20 /3.0");

        new Double((char) ('\u0041' + 4));
        Double.valueOf((char) ('\u0041' + 4));
        Double f = (double)'\u0041' + 4;
        //Integer i = (int)(char)('\u0041' + 4);
        System.out.println("Integer: " + f + " ---- Clase primitiva: " + "(char)('\\u0041' + 4)");
        System.out.println("Boolean no se puede.");

        System.out.println();
        System.out.println("----Proceso UNBOXING para obtener el dato primitivo que contiene Wrapper (Double)----");
        System.out.println();

        Integer z = 123;

        byte g = z.byteValue();
        System.out.println("Integer: " + z + " ---- byte: (byte)" + g);

        short h = z.shortValue();
        System.out.println("Integer: " + z + " ---- short: (short)" + h);

        int i = z.shortValue();
        System.out.println("Integer: " + z + " ---- int: " + i);

        System.out.println("Integer: " + z + " ---- byte: (byte)" + z.byteValue());
        System.out.println("Integer: " + z + " ---- short: (short)" + z.shortValue());
        System.out.println("Integer: " + z + " ---- int: " + z.intValue());
        System.out.println("Integer: " + z + " ---- long: " + z.longValue() +"(L)");
        System.out.println("Boolean no se puede.");

        System.out.println();
        System.out.println("----Generar Objeto String con Wrappers (Double)----");
        System.out.println();

        System.out.println("Base 10: " + Double.toString(123.45));
        System.out.println("Base 16: " + Double.toHexString(123.45));

        System.out.println();
        System.out.println("----Operaciones con los recursos de la clase INTEGER----");
        System.out.println();

        System.out.println("Relación entre dos Double");
        System.out.println();
        System.out.println("Interger.compare(3.5, 5.3) >> " + Double.compare(3.5, 5.3));
        System.out.println("Interger.compare(5.3, 3.5) >> " + Double.compare(5.3, 3.5));
        System.out.println("Interger.compare(5.3, 5.3) >> " + Double.compare(5.3, 5.3));

        System.out.println();
        System.out.println("Máximo entre dos Double");
        System.out.println();
        System.out.println("Integer.max(3.5, 5.3) >> " + Double.max(3.5, 5.3));
        System.out.println("Integer.max(5.3, 3.5) >> " + Double.max(5.3, 3.5));
        System.out.println("Integer.max(5.3, 5.3) >> " + Double.max(5.3, 5.3));

        System.out.println();
        System.out.println("Mínimo entre dos Double");
        System.out.println();
        System.out.println("Integer.max(3.5, 5.3) >> " + Double.min(3.5, 5.3));
        System.out.println("Integer.max(5.3, 3.5) >> " + Double.min(5.3, 3.5));
        System.out.println("Integer.max(5.3, 5.3) >> " + Double.min(5.3, 5.3));

        System.out.println();
        System.out.println("Suma de dos Double");
        System.out.println();
        System.out.println("Integer.sum(3 , 5) >> " + Double.sum(3.5, 5.3));
    }

}
