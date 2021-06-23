package Personajes;

/**
 *
 * @author emili
 */
public class Personaje {

    private int vida;
    private int armadura;
    private int ataque;
    String nombre;
    private boolean esHeroe;

    public Personaje (int vida, int armadura, int ataque, String nombre, boolean esHeroe) {
        this.vida = vida;
        this.armadura = armadura;
        this.ataque = ataque;
        this.nombre = nombre;
        this.esHeroe = esHeroe;
    }

    public void saludar() {
        System.out.println("Hola soy un heroe " + this.nombre);
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getArmadura() {
        return this.armadura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean get() {
        return this.esHeroe;
    }
}
