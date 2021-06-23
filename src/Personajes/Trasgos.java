
package Personajes;

/**
 *
 * @author emili
 */
public class Trasgos extends Bestias {

    private static int contadorInstancias;

    public static int getInstancias() {
        return Trasgos.contadorInstancias;
    }

    public Trasgos(String nombre) {
        super(325, 46, nombre);
    }

}
