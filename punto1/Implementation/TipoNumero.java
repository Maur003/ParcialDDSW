package punto1.Implementation;

import punto1.Interfaces.NumeroAbundante;
import punto1.Interfaces.NumeroDefectivo;
import punto1.Interfaces.NumeroPerfecto;

/**
 * Clase que determina el tipo de número.
 * 
 * @param numero
 * @see NumeroPerfecto
 * @see NumeroDefectivo
 * @see NumeroAbundante
 * @see TipoNumero
 * @return void
 * @throws IOException
 * @throws NumberFormatException
 * @see BufferedReader
 * @see InputStreamReader
 * 
 */

public class TipoNumero implements NumeroPerfecto, NumeroDefectivo, NumeroAbundante {
    private int numero;

    public TipoNumero(int numero) {
        this.numero = numero;
    }

    public void determinarTipo(int opcion) {
        switch (opcion) {
            case 1:
                if (esNumeroPerfecto(numero))
                    System.out.println("El número " + numero + " es perfecto.");
                else
                    System.out.println("El número " + numero + " NO es perfecto.");
                break;
            case 2:
                if (esNumeroDefectivo(numero))
                    System.out.println("El número " + numero + " es defectivo.");
                else
                    System.out.println("El número " + numero + " NO es defectivo.");
                break;
            case 3:
                if (esNumeroAbundante(numero))
                    System.out.println("El número " + numero + " es abundante.");
                else
                    System.out.println("El número " + numero + " NO es abundante.");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    @Override
    public boolean esNumeroPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0)
                suma += i;
        }
        return suma == numero;
    }

    @Override
    public boolean esNumeroDefectivo(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0)
                suma += i;
        }
        return suma < numero;
    }

    @Override
    public boolean esNumeroAbundante(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0)
                suma += i;
        }
        return suma > 2 * numero;
    }
}
