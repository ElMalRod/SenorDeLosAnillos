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
     @Override
    public void saludar(){
        System.out.println("Hola soy un Humano y me llamo   " + this.nombre);
    }

    
}
