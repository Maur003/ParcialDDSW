package punto2.Operaciones.src.Implementation;

/**
 * Clase que define el comportamiento de el método de la burbuja
 * 
 * @return void
 * @see Burbuja
 * @Param arreglo Arreglo de Strings a ordenar
 * @Param ordenar Método que ordena el arreglo de Strings
 */

public class Burbuja {
    public static void burbujas(String[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            for (int y = 0; y < arreglo.length - 1; y++) {
                String elementoActual = arreglo[y];
                String elementoSiguiente = arreglo[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                    // Intercambiar
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
    }

    public static void burbuja(int[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            for (int y = 0; y < arreglo.length - 1; y++) {
                int elementoActual = arreglo[y];
                int elementoSiguiente = arreglo[y + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
    }
}
