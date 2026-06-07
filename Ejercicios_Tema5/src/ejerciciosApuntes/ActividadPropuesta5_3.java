package ejerciciosApuntes;

import java.util.Scanner;
import java.util.Arrays;

public class ActividadPropuesta5_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int longitudArray = 0;
		int numeroIntroducido = 0;
		int numerosPositivos = 0;
		int contadorPositivos = 0;
		int numerosNegativos = 0;
		int contadorNegativos = 0;
		int contadorCeros = 0;
		double mediaPositivos = 0;
		double mediaNegativos = 0;
		
		System.out.println("Introduce la longitud del array (n): ");
		System.out.print("  > "); 
		longitudArray = sc.nextInt();
		
		int[] arrayPrincipal = new int[longitudArray];
		
		for(int i = 0; i < arrayPrincipal.length; i++) {
			System.out.print("Introduce un número (" + (i + 1) + "/" + longitudArray + "):\n  > "); 
			numeroIntroducido = sc.nextInt();
			arrayPrincipal[i] = numeroIntroducido;
			
			// Clasificación correcta de cada caso
			if (arrayPrincipal[i] > 0) {
				numerosPositivos += arrayPrincipal[i];
				contadorPositivos++;
			} else if (arrayPrincipal[i] < 0) {
				numerosNegativos += arrayPrincipal[i];
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
		}
		
		// Cálculo de medias casteando a double para obtener precisión
		if(contadorPositivos > 0) {
			mediaPositivos = (double) numerosPositivos / contadorPositivos;
		}
		if(contadorNegativos > 0) {
			mediaNegativos = (double) numerosNegativos / contadorNegativos;
		}
		
		System.out.println("\n---RESULTADOS---");
		System.out.println("Array original: " + Arrays.toString(arrayPrincipal));
		System.out.println("Media de números positivos: " + mediaPositivos);
		System.out.println("Media de números negativos: " + mediaNegativos);
		System.out.println("El número 0 se ha introducido " + contadorCeros + " veces.");
	}
}