package ejerciciosApuntes;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadPropuesta5_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---NUMERO DE LA SUERTE---");
        System.out.println("Introduce la longitud del array: ");
        System.out.print("  > ");
        int longitud = sc.nextInt();

        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor " + (i + 1) + ": ");
            System.out.print("  > ");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        while (array.length > 1) {
            // Elegir dos posiciones distintas al azar
            int pos1 = (int)(Math.random() * array.length);
            int pos2;
            do {
                pos2 = (int)(Math.random() * array.length);
            } while (pos1 == pos2);

            // Obtener los valores
            int valor1 = array[pos1];
            int valor2 = array[pos2];
            int media = (valor1 + valor2) / 2;

            // Eliminar los dos valores (primero el mayor índice)
            if (pos1 > pos2) {
                array = eliminarPosicion(array, pos1);
                array = eliminarPosicion(array, pos2);
            } else {
                array = eliminarPosicion(array, pos2);
                array = eliminarPosicion(array, pos1);
            }

            // Insertar la media ordenada
            array = insertarOrdenado(array, media);

            System.out.println("Array: " + Arrays.toString(array));
        }

        System.out.println("Tu número de la suerte es: " + array[0]);
    }

    public static int[] eliminarPosicion(int[] array, int pos) {
        int[] nuevo = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < pos) {
                nuevo[i] = array[i];
            } else if (i > pos) {
                nuevo[i - 1] = array[i];
            }
        }
        return nuevo;
    }

    public static int[] insertarOrdenado(int[] array, int valor) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (valor > array[medio]) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        int indice = inicio;
        int[] nuevo = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < indice) {
                nuevo[i] = array[i];
            } else {
                nuevo[i + 1] = array[i];
            }
        }
        nuevo[indice] = valor;
        return nuevo;
    }
}