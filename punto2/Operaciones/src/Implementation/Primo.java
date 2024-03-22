package punto2.Operaciones.src.Implementation;

/**
 * Clase que define el comportamiento de un número primo.
 * 
 * @return void
 * @see Primo
 */

public class Primo {
    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
