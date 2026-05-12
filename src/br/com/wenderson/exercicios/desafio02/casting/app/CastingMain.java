package casting.app;

import casting.models.Animal;
import casting.models.Cachorro;
import casting.models.Gato;
import casting.models.Leao;

public class CastingMain {
    
    public static void main(String[] args) {
        Animal animal = new Cachorro(); // Upcasting
        Animal outroAnimal = new Gato(); // Upcasting
        Animal selvagem = new Leao(); // Upcasting

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal; // Downcasting
            cachorro.emitirSom(); // Chama o método da classe Cachorro
        }

        if (outroAnimal instanceof Gato) {
            Gato gato = (Gato) outroAnimal; // Downcasting
            gato.emitirSom(); // Chama o método da classe Gato
        }

        if (selvagem instanceof Leao) {
            Leao leao = (Leao) selvagem; // Downcasting
            leao.emitirSom(); // Chama o método da classe Leao
        }
    }
}
