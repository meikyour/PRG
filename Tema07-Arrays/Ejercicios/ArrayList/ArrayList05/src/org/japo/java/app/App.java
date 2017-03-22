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

import java.util.ArrayList;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Jaimito");
        lista.add("Paqkito");
        lista.add("Jorgito");
        lista.add("Pakito");
        lista.add("Juanito");

        System.out.println("Sobrinos de Donald");
        System.out.println("==================");

        System.out.printf("Sobrinos.....: %d\n", lista.size());

        for (String sobrino : lista) {
            System.out.printf("Sobrino....: %s\n", sobrino);
        }

        for (int i = 0; i < lista.size(); i++) {
            String sobrino = lista.get(i);
            if (sobrino.equals("Pakito")) {
                lista.remove(i);
            }
        }
        String[] sobrinos = lista.toArray(new String[lista.size()]);

        System.out.println("Sobrinos[AUTENTICOS] de Donald");
        System.out.println("===============================");
        System.out.printf("Sobrinos.....: %d\n", sobrinos.length);

        for (String sobrino : sobrinos) {
            System.out.printf("Sobrino......: %s\n", sobrino);
        }
    }

}
