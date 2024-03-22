package punto2.Operaciones.src.Interfaces.Interfaces.Interfaces;

import java.util.Scanner;

/**
 * Interfaz que define el comportamiento de un menú.
 * 
 * @return void
 * @see Menu
 */

public interface Menu {
    void mostrar();

    int obtenerOpcion(Scanner scanner);
}
