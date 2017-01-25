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
        final String VARIEDAD    = "Clementinas";
        final int BOLSA_KG       = 3;       // Kilos
        final int BOLSA_UD       = 23;      // Naranjas
        final double DINERO_PAGO = 5.0;     // Euros
        final double DINERO_VUELTA = 2.75;  // Euros

        // Cálculos
        double precioCompra = DINERO_PAGO - DINERO_VUELTA;
        double precioKg     = precioCompra / BOLSA_KG;
        double unidadesKg   = (double)BOLSA_UD / BOLSA_KG;
        double precioUd     = precioCompra / BOLSA_UD;

        // Mensajes del supuesto
        System.out.printf("Variedad de naranjas .: %s\n", VARIEDAD);
        System.out.printf("Kilos en la bolsa ....: %d\n", BOLSA_KG);
        System.out.printf("Naranjas en la bolsa .: %d\n", BOLSA_UD);
        System.out.printf("Dinero entregado .....: %.2f €\n", DINERO_PAGO);
        System.out.printf("Dinero devuelto ......: %.2f €\n", DINERO_VUELTA);

        // Mensajes del supuesto
        System.out.printf("Precio de la compra ..: %.2f €\n", precioCompra);
        System.out.printf("Precio del kilo ......: %.2f €\n", precioKg);
        System.out.printf("Naranjas por kilo ....: %.2f Ud\n", unidadesKg);
        System.out.printf("Precio por naranja ...: %.2f €\n", precioUd);
    }
}
