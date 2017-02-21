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
package org.japo.java.entities;

import java.io.Serializable;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Posicion implements Serializable {

    // Tamaño pantalla
    public final static int W_SCR = 800; // Ancho
    public final static int H_SCR = 600; // Alto

    // Posición por defecto
    public final static int X_DEF = W_SCR / 2;
    public final static int Y_DEF = H_SCR / 2;

    // Coordenadas
    private int x;
    private int y;

    public Posicion() {
        x = X_DEF;
        y = Y_DEF;
    }

    public Posicion(int x, int y) {
        // Validación de X
        if (validarX(x)) {
            this.x = x;
        } else {
            this.x = X_DEF;
        }

        // Validación de Y
        if (validarY(y)) {
            this.y = y;
        } else {
            this.y = Y_DEF;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (validarX(x)) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (validarY(y)) {
            this.y = y;
        }
    }

    private static boolean validarX(int x) {
        return x >= 0 && x < W_SCR;
    }

    private static boolean validarY(int y) {
        return y >= 0 && y < H_SCR;
    }
}
