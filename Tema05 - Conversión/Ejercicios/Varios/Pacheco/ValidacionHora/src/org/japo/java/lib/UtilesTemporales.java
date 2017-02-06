/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesTemporales {
    public static boolean validarHora(String hora) {
        boolean analisisOK;
        
        try {
            // Extraer componentes
            String h = hora.substring(0, hora.indexOf(':'));
            String m = hora.substring(hora.indexOf(':') + 1, hora.lastIndexOf(':'));
            String s = hora.substring(hora.lastIndexOf(':') + 1);

            // Conversiones numéricas
            int hor = Integer.parseInt(h);
            int min = Integer.parseInt(m);
            int seg = Integer.parseInt(s);
            
            // Validar datos
            analisisOK = validarHor(hor) && validarMin(min) && validarSeg(seg);
        } catch (Exception e) {
            analisisOK = false;
        }
        
        // Devolver valor
        return analisisOK;
    }

    private static boolean validarHor(int hor) {
        return hor >= 0 && hor <= 23;
    }

    private static boolean validarMin(int min) {
        return min >= 0 && min <= 59;
    }

    private static boolean validarSeg(int seg) {
        return seg >= 0 && seg <= 59;
    }
}
