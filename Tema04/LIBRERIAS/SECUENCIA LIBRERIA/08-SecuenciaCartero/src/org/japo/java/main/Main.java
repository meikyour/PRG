/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
package org.japo.java.main;

public class Main {

    public static void main(String[] args) {
        // Datos del supuesto
        final String DESTINO_SI  = "Federico López";
        final String DESTINO_NO  = "Elvira Alegre";
        final int    NUM_ERRORES = 3;
        final String MSG_RETORNO = "El destinatario no es correcto";

        // Mensajes del supuesto
        System.out.printf("Destinatario correcto ..: %s\n", DESTINO_SI);
        System.out.printf("Destinatario indicado ..: %s\n", DESTINO_NO);
        System.out.printf("Equivocaciones del mes .: %d\n", NUM_ERRORES);
        System.out.printf("Mensaje de retorno .....: %s\n", MSG_RETORNO);
    }
}
