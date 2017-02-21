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

import org.japo.java.entities.MasterChef;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        MasterChef m1 = new MasterChef();
        MasterChef m2 = new MasterChef();
        MasterChef m3 = new MasterChef();

        m1.setMiembros(6);
        m2.setMiembros(12);
        m3.setMiembros(2);

        m1.setPresupuesto(18);
        m1.setPresupuesto(14);

        System.out.println(m1.getMiembros());
        System.out.println(m2.getMiembros());
        System.out.println(m3.getMiembros());
        System.out.println();
        System.out.println(m1.getPresupuesto());
        System.out.println(m2.getPresupuesto());
        System.out.println(m3.getPresupuesto());
    }

}
