package Personajes;

/**
 *
 * @author emili
 */
public class Bestias extends Personaje {

    private static int ataqueMaximo = 90;

    public Bestias(int vida, int armadura, String nombre) {
        super(vida, armadura, Bestias.ataqueMaximo, nombre, false);
    }
}
