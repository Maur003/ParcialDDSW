package punto2.Operaciones.src.Implementation;

import java.util.Scanner;

import punto2.Operaciones.src.Interfaces.Interfaces.Interfaces.Menu;

/**
 * Clase que implementa la interfaz Menu.
 * 
 * @Param mostrar
 * @Param obtenerOpcion
 * @return void
 * @see Menu
 * @see MenuImpl
 */

public class MenuImpl implements Menu {
    @Override
    public void mostrar() {
        System.out.println("Menu:");
        System.out.println("1. Ejecutar método de burbuja con números enteros.");
        System.out.println("2. Ejecutar método de burbuja con strings.");
        System.out.println("3. Verificar si un número es primo.");
        System.out.println("4. Calcular el resultado de una operación.");
        System.out.println("5. Salir.");
        System.out.print("Ingrese la opción que desea ejecutar: ");
    }

    @Override
    public int obtenerOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
