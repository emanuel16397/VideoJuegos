import java.util.Arrays;
import java.util.List;

// Clase principal para ejecutar el programa

public class main {
    public static void main(String[] args) {
        Personaje p1 = new mario("Mario");
        Personaje p2 = new principe("Príncipe de Persia");

        List<Personaje> personajes = Arrays.asList(p1, p2);

        for (Personaje p : personajes) {
            p.moverse();
            p.pelear();
            System.out.println("------------------");
        }
    }
}
