package Juego;

import Personajes.Bestias;
import Personajes.Elfos;
import Personajes.Heroes;
import Personajes.Hobbits;
import Personajes.Humanos;
import Personajes.Orcos;
import Personajes.Personaje;
import Personajes.Trasgos;

/**
 *
 * @author emili
 */
public class Juego {

    private Bestias ejercitoBestias[];
    private Heroes ejercitoHeroes[];

    //private int contadorHumanos;
    public Juego() {
        ejercitoBestias = new Bestias[5];
        ejercitoHeroes = new Heroes[5];
    }

    public void presentarPersonajes(Personaje ejercito[]) {

        if (ejercito.length > 0) {
            String tempo = "";
            if (ejercito[0] instanceof Bestias) {
                tempo = "BESTIAS";
            } else {
                tempo = "HEROES";
            }

            System.out.println("\n\t EJERCITO " + tempo);

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        }
    }

    public void jugar() {

        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);

        System.out.println("\n\n");
        this.pelea();

    }

    public void pelea() {
        for (int i = 0; i < ejercitoBestias.length; i++) {
            System.out.println("------RONDA "+(i+1)+"------");
            ejercitoBestias[i].recibirAtaque(ejercitoHeroes[i]);
            ejercitoHeroes[i].recibirAtaque(ejercitoBestias[i]);
        }
        
        
    }

    public void inicializarHeroes() {
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new Humanos("Humano " + Humanos.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new Elfos("Elfo " + Elfos.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new Hobbits("Hobbit " + Hobbits.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new Elfos("Elfo " + Elfos.getInstancias());
                    break;
            }
        }
    }

    public void inicializarBestias() {
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = Dado.tirarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new Trasgos("Trasgo " + Trasgos.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new Orcos("Orco " + Orcos.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new Orcos("Orco " + Orcos.getInstancias());
                    break;
            }
        }
    }
}
