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
     public int obtenerArmadura(Personaje atacante){
        return this.getArmadura();
    }

    public int obtenerAtaque(Personaje defensor){
        return this.getAtaque();
    }

    public void recibirAtaque(Personaje atacante){
        System.out.println(" " + atacante.getNombre() + " atacará a "+ this.getNombre());

        int danyoRecibido = this.obtenerArmadura(atacante) - atacante.obtenerAtaque(this);
        if (danyoRecibido <= 0){
            this.vida += danyoRecibido;
        }
        else{
            danyoRecibido = 0;
        }
        System.out.println(" "+atacante.getNombre()+  " ataco a  " + this.getNombre() + " hizo daño: " + danyoRecibido  + " le queda vida: "+this.getVida());
    }

}
