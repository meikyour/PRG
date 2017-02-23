/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.interfaces.IAnimal;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Animal implements IAnimal {

    private int patas;

    // ------- Constructores ------------
    public Animal() {
        this.patas = 4;
    }

    public Animal(int patas) {
        if (patas >= 2 && patas % 2 == 0) {
            this.patas = patas;
        } else {
            this.patas = 4;
        }
    }

    // ------- Setters y Getters ------------
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        if (patas >= 2 && patas % 2 == 0) {
            this.patas = patas;
        }
    }

    // ----------- Método Override -------------
    @Override
    public void mostrarPatas() {
        System.out.println(getPatas());
    }

}
