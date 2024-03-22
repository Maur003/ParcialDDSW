package punto2.Operaciones.src.Utilities;

/**
 * Clase que define el comportamiento de las utilidades
 * 
 * 
 * @return void
 * @see Utilidades
 * @Param esPrimo Método que verifica si un número es primo
 * @Param calcularResultado Método que calcula el resultado de una operación
 * 
 */

public class Utilidades {
	public static boolean esPrimo(int numero) {
		if (numero <= 1)
			return false;
		for (int i = 2; i * i <= numero; i++) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}

	public static double calcularResultado(double a, double b, double c, double d) {
		return ((a + b) * (c - d)) / (a * d);
	}
}
