package punto2.Operaciones.src;

import java.util.Arrays;
import java.util.Scanner;

import punto2.Operaciones.src.Implementation.Burbuja;
import punto2.Operaciones.src.Implementation.MenuImpl;
import punto2.Operaciones.src.Interfaces.Interfaces.Interfaces.Menu;
import punto2.Operaciones.src.Utilities.Utilidades;

/**
 * Clase principal que ejecuta las operaciones de la aplicación.
 * 
 * @return void
 * @see Main
 * @see Burbuja
 * @see Utilidades
 * @see MenuImpl
 * @see Menu
 * 
 * 
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new MenuImpl();
        int opcion;

        do {
            menu.mostrar();
            opcion = menu.obtenerOpcion(scanner);

            switch (opcion) {
                case 1:
                    ejecutarMetodoBurbujaEnteros();
                    break;
                case 2:
                    ejecutarMetodoBurbujaStrings();
                    break;
                case 3:
                    verificarPrimo(scanner);
                    break;
                case 4:
                    calcularOperacion(scanner);
                    break;
                case 5:
                    System.out.println("La ejecución ha terminado.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void ejecutarMetodoBurbujaEnteros() {
        int[] numeros = { 1, 9, 23, 4, 55, 100, 1, 1, 23 };
        System.out.println("Antes del método de la burbuja: " + Arrays.toString(numeros));
        Burbuja.burbuja(numeros);
        System.out.println("Después del método de la burbuja: " + Arrays.toString(numeros));
    }

    private static void ejecutarMetodoBurbujaStrings() {
        String[] nombres = { "Leon", "Chris", "Jill", "Wesker", "Ada" };
        System.out.println("Antes del método de la burbuja: " + Arrays.toString(nombres));
        Burbuja.burbujas(nombres);
        System.out.println("Después del método de la burbuja: " + Arrays.toString(nombres));
    }

    private static void verificarPrimo(Scanner scanner) {
        System.out.print("Ingrese el número para verificar si es primo: ");
        int numero = scanner.nextInt();
        boolean esPrimo = Utilidades.esPrimo(numero);
        System.out.println(numero + " es primo: " + esPrimo);
    }

    private static void calcularOperacion(Scanner scanner) {
        System.out.println("Ingrese los 4 números para la operación:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double resultado = Utilidades.calcularResultado(a, b, c, d);
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
