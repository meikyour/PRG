/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Trasto extends Cosa{

    public Trasto() {
        this.fragilidadOK = true;
    }
    
    public Trasto(boolean fragilidadOK) {
        this.fragilidadOK = fragilidadOK;
    }
    
}
