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
