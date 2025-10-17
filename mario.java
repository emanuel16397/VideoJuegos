// Clase concreta: mario

public class mario extends Personaje {

    // Constructor

    public mario(String nombre) {
        super(nombre);
    }

    // Implementación de los métodos abstractos
    @Override
    public void moverse() {
        System.out.println(nombre + " salta sobre los obstáculos.");
    }

    @Override
    public void pelear() {
        System.out.println(nombre + " pisa a los enemigos para derrotarlos.");
    }
}
