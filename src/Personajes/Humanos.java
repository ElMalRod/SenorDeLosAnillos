/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author emili
 */
public class Humanos extends Heroes {

    private static int contadorInstancias;

    public Humanos(String nombre){
        super(180,75,nombre);
        Humanos.contadorInstancias++;
    }

    public static int getInstancias(){
        return contadorInstancias;
    }
    
}
