package Personajes;

/**
 *
 * @author emili
 */
public class Hobbits extends Heroes {

    private static int contadorInstancias;


    public static int getInstancias(){
        return Hobbits.contadorInstancias++;
    }

    public Hobbits(String nombre){
        super(200, 40, nombre);
        Hobbits.contadorInstancias++;
    }
     @Override
    public void saludar(){
        System.out.println("Hola soy un Hobbit y me llamo   " + this.nombre);
    }


}
