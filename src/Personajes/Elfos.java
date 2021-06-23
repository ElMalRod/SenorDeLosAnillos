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
        Elfos.contadorInstancias++;
    }
     @Override
    public void saludar(){
        System.out.println("Hola soy un elfo y me llamo   " + this.nombre);
    }

    @Override
    public int obtenerAtaque(Personaje defensor){
        if (defensor instanceof Orcos){
            System.out.println(" "+ this.getNombre() + "FURIA");
            return this.getAtaque() + 10;

        }
        
        return this.getAtaque();
    }

}
