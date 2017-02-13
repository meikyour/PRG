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

        System.out.println("----Plantilla-----");

        System.out.println();
        System.out.println("ejercicio ");
        System.out.println();

        System.out.println("Ejercicio 1");

        char b = '\u0033';
        double c = 0.11011;
        boolean d = true;
        int e = 0x33;
        char p = (char) (0b11011);

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(p);
        System.out.println(0b11011);

        System.out.println();
        System.out.println("Ejercicio 2");

        System.out.println(01750);
        System.out.println('\u1750');
        System.out.println(0x3E8);

        System.out.println();
        System.out.println("Ejercicio 3");

        System.out.println('\176');
        System.out.println();

        System.out.println();
        System.out.println("ejercicio 4");
        System.out.println('\u03a9');

        System.out.println();
        System.out.println("ejercicio 5");
        System.out.println(Byte.SIZE);

        System.out.println();
        System.out.println("ejercicio 6");
        System.out.println(Float.SIZE);

        System.out.println();
        System.out.println("ejercicio 7");
        System.out.println(Short.SIZE);

        System.out.println();
        System.out.println("ejercicio 8");
        System.out.println(Double.SIZE);

        System.out.println();
        System.out.println("ejercicio 9");
        System.out.println(Double.SIZE);

        System.out.println();
        System.out.println("ejercicio 10");
        System.out.println((int) 543.21);

        System.out.println();
        System.out.println("ejercicio 11");
        System.out.println((double) '@');

        System.out.println();
        System.out.println("ejercicio 12");
        System.out.println("error");

        System.out.println();
        System.out.println("ejercicio 13");
        System.out.println("error");

        System.out.println();
        System.out.println("ejercicio 14");
        String f = String.valueOf(3 + 2);
        System.out.println(f);

        System.out.println();
        System.out.println("ejercicio 15");
        String g = String.valueOf(true && false);
        System.out.println(g);

        System.out.println();
        System.out.println("ejercicio 16");
        System.out.println("texto1".equalsIgnoreCase("TEXTO1"));
        System.out.println("No estricta, ignora mayusculas y minúsculas");

        System.out.println();
        System.out.println("ejercicio 17");
        System.out.println("texto1".equalsIgnoreCase("TEXTO1"));
        System.out.println("No estricta, ignora mayusculas y minúsculas");

        System.out.println();
        System.out.println("ejercicio 18");
        String fecha = "20/09/1988";
        System.out.println(fecha.substring(fecha.indexOf("/") + 1, fecha.lastIndexOf("/")));

        System.out.println();
        System.out.println("ejercicio 19");
        System.out.println("\"  m a n o l o  \"".trim());

        System.out.println();
        System.out.println("ejercicio 20");
        System.out.println("tacirupeka".charAt("A".length()));
        System.out.println((int) ("tacirupeka".charAt("A".length())));

        System.out.println();
        System.out.println("ejercicio 21");
        System.out.println("Pakito".replace('i', 'e'));

        System.out.println();
        System.out.println("ejercicio 22");
        System.out.println("Nabucodonosor".startsWith("Nabuco"));

        System.out.println();
        System.out.println("ejercicio 23");
        System.out.println("Nabucodonosor");
        String i = "Nabuco" + ("donosor");
        System.out.println("Nabuco".concat("donosor"));
        System.out.println(i);

        System.out.println();
        System.out.println("ejercicio 24");
        System.out.println(String.format("%s%s", "Nabuco", "donosor"));

        System.out.println();
        System.out.println("ejercicio 25");
        System.out.println(String.format("%.6s", "Nabucodonosor"));
        System.out.println(String.format("%6s", "Nabucodonosor"));
        System.out.println(String.format("%6.6S", "Nabucodonosor"));

        System.out.println();
        System.out.println("ejercicio 26");
        System.out.println("Error");

        System.out.println();
        System.out.println("ejercicio 27");
        int v = Integer.parseInt("12345");
        System.out.println(v);

        System.out.println();
        System.out.println("ejercicio 28");
        String j = 12345 + "";
        System.out.println();

        System.out.println();
        System.out.println("ejercicio 29");
        System.out.println(Boolean.parseBoolean(String.valueOf(12345 != 0)));
        System.out.println(new Boolean((12345 + "").equals("12345")));
        System.out.println(Boolean.parseBoolean("" + (12345 >= 0)));

        System.out.println();
        System.out.println("ejercicio 30");
        double radio = 2.6;
        System.out.println(Math.PI * Math.pow(radio, 2));
        System.out.println(Math.PI * Math.sqrt(radio));
        System.out.println(Math.PI * Math.round(radio));
    }

}
