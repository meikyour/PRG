/*
 * Copyright 2017 jOly.
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
package org.japo.java.interfaces;

/**
 *
 * @author jOly
 */
public interface IDecimo {
    
    //Contantes de clase
    public static int NUMERO_MIN = 0;
    public static int NUMERO_MAX = 99999;

    public static int SERIE_MIN = 1;
    public static int SERIE_MAX = 160;

    public static int FRACCION_MIN = 1;
    public static int FRACCION_MAX = 10;
    
    public void mostrarDecimo();
    
}
