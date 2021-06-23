package Personajes;

/**
 *
 * @author emili
 */
public class Orcos extends Bestias {

    private static int contadorInstancias;

    public static int getInstancias() {
        return Orcos.contadorInstancias;
    }

    public Orcos(String nombre) {
        super(300, 45, nombre);
    }

}
