package ejerciciosApuntes;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arrayPrincipal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for(int i = 0; i < arrayPrincipal.length; i++) {
			if(arrayPrincipal[i] % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}
		
		int[] arrayPares = new int[contadorPar];
		int[] arrayImpares = new int[contadorImpar];
		
		int posPar = 0;
		int posImpar = 0;
		for(int i = 0; i < arrayPrincipal.length; i++) {
		    if(arrayPrincipal[i] % 2 == 0) {
		        arrayPares[posPar++] = arrayPrincipal[i];
		    } else {
		        arrayImpares[posImpar++] = arrayPrincipal[i];
		    }
		}
		
		System.out.println("Array original: " +Arrays.toString(arrayPrincipal));
		System.out.println("Array solo con pares: " +Arrays.toString(arrayPares));
		System.out.println("Array solo con impares: " +Arrays.toString(arrayImpares));
	}

}