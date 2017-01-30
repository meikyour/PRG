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
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        System.out.println("--------------------WRAPPERS--------------------------");
        System.out.println();

        System.out.println("-------------Cantidad de bits y bytes----------------");
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
        System.out.println("Máximo valor positivo - byte......" + Byte.MAX_VALUE);
        System.out.println("Máximo valor positivo - short....." + Short.MAX_VALUE);
        System.out.println("Máximo valor positivo - int....." + Integer.MAX_VALUE);
        System.out.println("Máximo valor positivo - long....." + Long.MAX_VALUE);

        System.out.println();
        System.out.println("---------------Mínimo valor negativo-----------------");
        System.out.println();
        System.out.println("Mínimo valor negativo - byte......" + Byte.MIN_VALUE);
        System.out.println("Mínimo valor negativo - short....." + Short.MIN_VALUE);
        System.out.println("Mínimo valor negativo - int....." + Integer.MIN_VALUE);
        System.out.println("Mínimo valor negativo - long....." + Long.MIN_VALUE);
        System.out.println();

        System.out.println("----Proceso BOXING para crear objeto Wrapper (Integer) de las clases primitivas----");
        System.out.println();

        new Integer(123);
        Integer.valueOf(123);
        Integer a = 123;
        System.out.println("Integer: " + a + " ---- Clase primitiva: " + 123);

        new Integer((int) 43.21);
        Integer.valueOf((int) 43.21);
        Integer b = (int) (43.21);
        System.out.println("Integer: " + b + " ---- Clase primitiva: " + 43.21);

        new Integer('W');
        Integer.valueOf('W');
        Integer c = (int) ('W');
        System.out.println("Integer: " + c + " ---- Clase primitiva: " + 'W');

        new Integer(2 + 3);
        Integer.valueOf(2 + 3);
        Integer d = 2 + 3;
        System.out.println("Integer: " + d + " ---- Clase primitiva: " + "2 + 3");

        new Integer((int) (20 / 3.0));
        Integer.valueOf((int) (20 / 3.0));
        Integer e = (int) (20 / 3.0);
        System.out.println("Integer: " + e + " ---- Clase primitiva: " + "20 /3.0");

        new Integer((char) ('\u0041' + 4));
        Integer.valueOf((char) ('\u0041' + 4));
        Integer f = '\u0041' + 4;
        //Integer i = (int)(char)('\u0041' + 4);
        System.out.println("Integer: " + f + " ---- Clase primitiva: " + "(char)('\\u0041' + 4)");
        System.out.println("Boolean no se puede.");

        System.out.println();
        System.out.println("----Proceso UNBOXING para obtener el dato primitivo que contiene Wrapper (Integer)----");
        System.out.println();

        Integer z = 123;

        byte g = z.byteValue();
        System.out.println("Integer: " + z + " ---- byte: (byte)" + g);

        short h = z.shortValue();
        System.out.println("Integer: " + z + " ---- short: (short)" + h);

        int i = z.shortValue();
        System.out.println("Integer: " + z + " ---- int: " + i);

        System.out.println("Integer: " + z + " ---- long: "+z.longValue() +"L");
        System.out.println("Integer: " + z + " ---- float: "+z.floatValue() +"f");
        System.out.println("Integer: " + z + " ---- double: "+z.doubleValue() +"d");
        System.out.println("Integer: " + z + " ---- char: "+ (char)z.intValue());
        System.out.println("Boolean no se puede.");
        
        System.out.println();
        System.out.println("----Generar Objeto String con Wrappers (Integer)----");
        System.out.println();
        
        String j = Integer.toBinaryString(123);
        System.out.println("Base 2: "+j);
        
        String k = Integer.toOctalString(123);
        System.out.println("Base 8: "+k);
        
        System.out.println("Base 10: "+Integer.toString(123));
        System.out.println("Base 16: "+Integer.toHexString(123));
        System.out.println("Base 5: "+Integer.toString(123, 5));
        System.out.println("Unsigned: "+Integer.toUnsignedString(123));
        System.out.println("Unsigned: "+Integer.toUnsignedString(-123));
        System.out.println("Unsigned Base 16: "+Integer.toUnsignedString(123, 16));
        System.out.println("Unsigned Base 16: "+Integer.toUnsignedString(-123, 16));
        
        System.out.println();
        System.out.println("----Operaciones con los recursos de la clase INTEGER----");
        System.out.println();
        
        System.out.println("Relación entre dos Integer");
        System.out.println();
        System.out.println("Interger.compare(3, 5) >> "+Integer.compare(3, 5));
        System.out.println("Interger.compare(5, 3) >> "+Integer.compare(5, 3));
        System.out.println("Interger.compare(5, 5) >> "+Integer.compare(5, 5));
        
        System.out.println();
        System.out.println("Relación entre dos Integer Unsigned");
        System.out.println();
        System.out.println("Integer.compareUnsigned(-3, 5) >> "+Integer.compareUnsigned(-3, 5));
        System.out.println("Integer.compareUnsigned(5, -3) >> "+Integer.compareUnsigned(5, -3));
        System.out.println("Integer.compareUnsigned(5, 5) >> "+Integer.compareUnsigned(5, 5));
        
        System.out.println();
        System.out.println("Máximo entre dos Integer");
        System.out.println();
        System.out.println("Integer.max(3, 5) >> "+Integer.max(3, 5));
        System.out.println("Integer.max(5, 3) >> "+Integer.max(5, 3));
        System.out.println("Integer.max(5, 5) >> "+Integer.max(5, 5));
        
        System.out.println();
        System.out.println("Mínimo entre dos Integer");
        System.out.println();
        System.out.println("Integer.min(3, 5) >> "+Integer.min(3, 5));
        System.out.println("Integer.min(5, 3) >> "+Integer.min(5, 3));
        System.out.println("Integer.min(5, 5) >> "+Integer.min(5, 5));
        
        System.out.println();
        System.out.println("Signo del Integer");
        System.out.println();
        System.out.println("Integer.signum(3) >> "+Integer.signum(3));
        System.out.println("Integer.signum(-3) >> "+Integer.signum(-3));
        
        System.out.println();
        System.out.println("Suma de dos Integer");
        System.out.println();
        System.out.println("Integer.sum(3 , 5) >> "+Integer.sum(3 , 5));
    }

}
