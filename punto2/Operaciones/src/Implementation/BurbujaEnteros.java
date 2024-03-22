package punto2.Operaciones.src.Implementation;

import java.util.Arrays;
import punto2.Operaciones.src.Interfaces.Interfaces.Interfaces.Ordenamiento;

/**
 * Implementación de la interfaz Ordenamiento para ordenar un arreglo de enteros
 * 
 * @Param arreglo Arreglo de enteros a ordenar
 * @Param ordenar Método que ordena el arreglo de enteros
 * @Param arreglo Arreglo de enteros a ordenar
 * @return void
 * @see Ordenamiento
 * @see BurbujaEnteros
 * @see BurbujaStrings
 * 
 */

public class BurbujaEnteros implements Ordenamiento {
    private int[] arreglo;

    public BurbujaEnteros(int[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public void ordenar() {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        System.out.println("Después del método de la burbuja: " + Arrays.toString(arreglo));
    }
}
