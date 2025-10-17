// Clase abstracta
public abstract class Personaje {
    protected String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos → las subclases deben implementarlos
    public abstract void moverse();
    public abstract void pelear();
}

