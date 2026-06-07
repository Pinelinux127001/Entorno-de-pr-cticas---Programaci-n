package ejerciciosApuntes;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int longitudArray = 0;
		int numeroIntroducido = 0;
		
		System.out.print("Introduce la longitud del array:\n  >");
		longitudArray = sc.nextInt();
		
		int[] arrayNormal = new int[longitudArray];
		int[] arrayInvertido = new int[longitudArray];
		
		for(int i = 0; i < arrayNormal.length; i++) {
			System.out.print("Introduce un número\n  > "); 
			numeroIntroducido = sc.nextInt();
			arrayNormal[i] = numeroIntroducido;
		}
		
		// CORRECCIÓN: Bucle para invertir el array
		for(int i = 0; i < arrayNormal.length; i++) {
			arrayInvertido[i] = arrayNormal[arrayNormal.length - 1 - i];
		}
		
		System.out.println("Array normal: " + Arrays.toString(arrayNormal));
		System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));
		
	}
}