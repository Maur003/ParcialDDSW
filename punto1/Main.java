package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import punto1.Implementation.TipoNumero;
import punto1.Interfaces.NumeroAbundante;
import punto1.Interfaces.NumeroDefectivo;
import punto1.Interfaces.NumeroPerfecto;

/**
 * Clase principal que maneja la entrada del usuario y determina el tipo de
 * número.
 * 
 * @see TipoNumero
 * @see NumeroPerfecto
 * @see NumeroDefectivo
 * @see NumeroAbundante
 * @see BufferedReader
 * @see InputStreamReader
 * @see NumberFormatException
 * @param args
 * @throws IOException
 * @throws NumberFormatException
 * @return void
 */
public class Main {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int opcion = solicitarOpcion(reader);
            int numero = solicitarNumero(reader);

            TipoNumero tipoNumero = new TipoNumero(numero);
            tipoNumero.determinarTipo(opcion);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        }
    }

    private static int solicitarOpcion(BufferedReader reader) throws IOException {
        System.out.println("Programa que detecta los siguientes tipos de números:");
        System.out.println("1. Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abundante");
        System.out.println("Seleccione su opción 1, 2 o 3: ");
        return Integer.parseInt(reader.readLine());
    }

    private static int solicitarNumero(BufferedReader reader) throws IOException {
        System.out.println("------------------------------------------------------");
        System.out.println("Escriba el número: ");
        return Integer.parseInt(reader.readLine());
    }
}
