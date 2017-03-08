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

import org.japo.java.entities.Empleado;
import org.japo.java.entities.Encargado;
import org.japo.java.entities.Operario;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        System.out.println("--------------------- Objeto 1 Empleado ---------------------");
        System.out.println("Modifico el cargo a un cargo válido y que no es el predeterminado.");
        // --------------------- Objeto 1 Empleado ---------------------
        // Modifico el cargo a un cargo válido y que no es el predeterminado.
        Empleado e1 = new Empleado();
        e1.setCargo("Encargado");
        e1.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 2 Empleado ---------------------");
        System.out.println("Modifico el cargo a un cargo no válido.");
        // --------------------- Objeto 1 Empleado ---------------------
        // Modifico el cargo a un cargo no válido.
        Empleado e2 = new Empleado();
        e2.setCargo("Mecanico");
        e2.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 3 Empleado ---------------------");
        System.out.println("Dejo el valor vacío para usar el constructor predeterminado.");
        Empleado e3 = new Empleado();
        e2.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 1 Operario ---------------------");
        System.out.println("Modifico la sección y el cargo e introduzco valores válidos.");
        // --------------------- Objeto 1 Operario ---------------------
        // Modifico una sección válida y que no es la predeterminada y un cargo válido.
        Operario o1 = new Operario();
        o1.setCargo("Operario");
        o1.setSeccion("Almacén");
        o1.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 2 Operario ---------------------");
        System.out.println("Modifico la sección y el cargo e introduzco valores no válidos.");
        Operario o2 = new Operario();
        o2.setCargo("Restaurador");
        o2.setSeccion("Juguetería");
        o2.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 3 Operario ---------------------");
        System.out.println("Dejo el valor vacío para usar el constructor predeterminado.");
        Operario o3 = new Operario();
        o3.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 1 Encargado ---------------------");
        System.out.println("Modifico el cargo y la producción con valores válidos y una produccion con el objetivo conseguido.");
        Encargado em1 = new Encargado();
        em1.setProduccion(116);
        em1.setCargo("Operario");
        em1.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 2 Encargado ---------------------");
        System.out.println("Modifico el cargo e introduzco y cargo no válido y una producción que no consigue el objetivo.");
        Encargado em2 = new Encargado();
        em2.setProduccion(62);
        em2.setCargo("Telefonista");
        em2.mostrarInfo();

        System.out.println();
        System.out.println("--------------------- Objeto 3 Encargado ---------------------");
        System.out.println("Dejo los valores vacíos para utilizar el constructor predeterminado.");
        Encargado em3 = new Encargado();
        em3.setCargo("Telefonista");
        em3.mostrarInfo();
    }

}
