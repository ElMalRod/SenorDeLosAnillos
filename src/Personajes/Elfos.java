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
public class Elfos extends Heroes {

    private static int contadorInstancias;

    public static int getInstancias() {
        return Elfos.contadorInstancias;
    }

    public Elfos(String nombre) {
        super(250, 60, nombre);
    }

}
