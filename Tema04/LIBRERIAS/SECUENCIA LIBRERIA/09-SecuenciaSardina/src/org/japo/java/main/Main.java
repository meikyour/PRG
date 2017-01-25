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
        final String ARTICULO_NOMBRE   = "Sardinas";
        final double ARTICULO_CANTIDAD = 12.5;
        final double ARTICULO_PRECIO   = 1.5 / 1.5;
        
        // Cálculos
        double precioTotal = ARTICULO_CANTIDAD * ARTICULO_PRECIO;

        // Mensajes del supuesto
        System.out.printf("Artículo ..........: %s\n", ARTICULO_NOMBRE);
        System.out.printf("Cantidad pedido ...: %.1f\n", ARTICULO_CANTIDAD);
        System.out.printf("Precio unitario ...: %.1f Pta/s\n", ARTICULO_PRECIO);
        System.out.printf("Precio total ......: %.1f Pta/s\n", precioTotal);
    }
}
