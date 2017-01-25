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
    //Constantes String.
    public static final String DECIMAL = "DECIMAL";
    public static final String OCTAL = "OCTAL";
    public static final String HEXADECIMAL = "HEXADECIMAL";
    public static final String BINARIO = "BINARIO";

    //Constantes Númericas.
    public static final int NUMO1 = 0b110;
    public static final int NUMO2 = 0b1100;
    public static final int NUMO3 = 0b11001;
    public static final int NUMO4 = 0b110011;
    public static final int NUMO5 = 01;
    public static final int NUMO6 = 013;
    public static final int NUMO7 = 0135;
    public static final int NUMO8 = 01357;
    public static final int NUMO9 = 5;
    public static final int NUM10 = 10;
    public static final int NUM11 = 20;
    public static final int NUM12 = 100;
    public static final int NUM13 = 1000;
    public static final int NUM14 = 0x2;
    public static final int NUM15 = 0xC;
    public static final int NUM16 = 0xCA;
    public static final int NUM17 = 0xB0B0;
    public static final int NUM18 = 0xDAD0;
    public static final int NUM19 = 0xFE0;
    public static final int NUM21 = 0xFF;
    public static final int NUM22 = 2048;
    public static final int NUM23 = 512;
    public static final int NUM24 = 64;
    public static final int NUM25 = 8;
    public static final int NUM26 = 0246;
    public static final int NUM27 = 052;
    public static final int NUM28 = 07;
    public static final int NUM29 = 0b10101010101;
    public static final int NUM30 = 0b111000;

    public void lanzarAplicacion() {
        /*
        //Número en decimal.
        System.out.printf("%-5d\n", NUMO2);
        //Número en binario.
        System.out.printf("0b%-16s\n", Integer.toBinaryString(NUMO2));
        //Número en octal.
        System.out.printf("0%-16s\n", Integer.toOctalString(NUMO2));
        System.out.printf("0%-6o\n", NUMO2);
        //Número en hexadecimal.
        System.out.printf("0x%-16s\n", Integer.toHexString(NUMO2));
        System.out.printf("0X%-4x\n", NUMO2);
         */

        //Mensajes con el número y cada base numérica.
        System.out.printf("%-17s  %-6s  %-5s  %-5s\n", BINARIO, OCTAL, DECIMAL, HEXADECIMAL);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO1), NUMO1, NUMO1, NUMO1);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO2), NUMO2, NUMO2, NUMO2);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO3), NUMO3, NUMO3, NUMO3);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO4), NUMO4, NUMO4, NUMO4);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO5), NUMO5, NUMO5, NUMO5);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO6), NUMO6, NUMO6, NUMO6);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO7), NUMO7, NUMO7, NUMO7);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO8), NUMO8, NUMO8, NUMO8);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUMO9), NUMO9, NUMO9, NUMO9);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM10), NUM10, NUM10, NUM10);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM11), NUM11, NUM11, NUM11);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM12), NUM12, NUM12, NUM12);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM13), NUM13, NUM13, NUM13);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM14), NUM14, NUM14, NUM14);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM15), NUM15, NUM15, NUM15);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM16), NUM16, NUM16, NUM16);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM17), NUM17, NUM17, NUM17);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM18), NUM18, NUM18, NUM18);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM19), NUM19, NUM19, NUM19);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM21), NUM21, NUM21, NUM21);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM22), NUM22, NUM22, NUM22);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM23), NUM23, NUM23, NUM23);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM24), NUM24, NUM24, NUM24);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM25), NUM25, NUM25, NUM25);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM26), NUM26, NUM26, NUM26);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM27), NUM27, NUM27, NUM27);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM28), NUM28, NUM28, NUM28);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM29), NUM29, NUM29, NUM29);
        System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(NUM30), NUM30, NUM30, NUM30);
    }

}
