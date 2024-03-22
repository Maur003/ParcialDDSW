package punto2.Operaciones.src.Implementation;

import java.util.Arrays;
import punto2.Operaciones.src.Interfaces.Interfaces.Interfaces.Ordenamiento;

/**
 * Implementación de la interfaz Ordenamiento para ordenar un arreglo de Strings
 * 
 * @Param arreglo Arreglo de Strings a ordenar
 * @Param ordenar Método que ordena el arreglo de Strings
 * @return void
 * @see Ordenamiento
 * @see BurbujaStrings
 */

public class BurbujaStrings implements Ordenamiento {
    private String[] arreglo;

    public BurbujaStrings(String[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public void ordenar() {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
                    String temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        System.out.println("Después del método de la burbuja: " + Arrays.toString(arreglo));
    }
}
