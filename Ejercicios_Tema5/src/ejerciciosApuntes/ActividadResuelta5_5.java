package ejerciciosApuntes;
import java.util.Arrays;

public class ActividadResuelta5_5 {

	public static void main(String[] args) {
		
		int longitud = 10;
		int fin = 100;
		int[] arrayMain = new int[longitud];
		
		arrayMain = rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(arrayMain));
	}
	
	public static int[] rellenaPares(int longitud, int fin) {
		
		int[] arrayPrincipal = new int[longitud];
		int i = 0;
		
		// Bucle hasta llenar todas las posiciones del array
		while (i < longitud) {
			// Genera números en el rango [2, fin]
			int numeroAleatorio = (int)(Math.random() * (fin - 2 + 1)) + 2;
			
			// Si es par, se guarda y se avanza al siguiente índice
			if (numeroAleatorio % 2 == 0) {
				arrayPrincipal[i] = numeroAleatorio;
				i++;
			}
		}
		
		// Ordena el array de forma ascendente
		Arrays.sort(arrayPrincipal);
		
		return arrayPrincipal;
	}
}