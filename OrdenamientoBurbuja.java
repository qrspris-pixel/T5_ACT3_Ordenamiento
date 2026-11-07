
import java.util.Scanner;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos numeros deseas ingresar? ");
        int cantidad = teclado.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            int[] numeros = new int[cantidad];
            int auxiliar;

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingresa un numero: ");
                numeros[i] = teclado.nextInt();
            }

            for (int i = 0; i < cantidad - 1; i++) {
                for (int j = 0; j < cantidad - 1 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        auxiliar = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = auxiliar;
                    }
                }
            }

            System.out.println("Numeros ordenados:");

            for (int i = 0; i < cantidad; i++) {
                System.out.print(numeros[i] + " ");
            }

            System.out.println();
        }

        teclado.close();
    }
}
