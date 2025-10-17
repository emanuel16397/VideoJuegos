// Clase concreta: principe
public class principe extends Personaje {

    public principe(String nombre) {
        super(nombre);
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre y hace acrobacias por las paredes.");
    }

    @Override
    public void pelear() {
        System.out.println(nombre + " lucha con su espada contra los enemigos.");
    }
}
