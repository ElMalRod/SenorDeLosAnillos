/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author emili
 */
public class Dado {

    public Dado() {
    }

    public static int tirarDado(int Minimo, int Maximo, int DadosSuma, boolean Mensaje) {
        int Dado = Minimo;
        int Resultado = Minimo;
        for (int i = 1; i <= DadosSuma; i++) {
            Dado = (int) Math.floor(Math.random() * (Maximo - Minimo + 1) + Minimo);
            if (Mensaje) {
                System.out.println("Se lanzó el " + i + " dado y su resultado fue: " + Dado);
            }
            if (Resultado < Dado) {
                Resultado = Dado;
            }
        }
        if (DadosSuma > 1) {
            if (Mensaje) {
                System.out.println("El resultado mayor de los " + DadosSuma + " lanzados es: " + Resultado);
            }
        }
        return Resultado;
    }

}
