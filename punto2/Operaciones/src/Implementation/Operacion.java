package punto2.Operaciones.src.Implementation;

/**
 * Clase que define una operación matemática.
 * 
 * @return double
 * @see Operacion
 */

public class Operacion {
    public static double calcularResultado(double a, double b, double c, double d) {
        return ((a + b) * (c - d)) / (a * d);
    }
}
