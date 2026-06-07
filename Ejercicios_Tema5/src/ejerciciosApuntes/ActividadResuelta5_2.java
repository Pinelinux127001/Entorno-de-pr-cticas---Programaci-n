package ejerciciosApuntes;

import java.util.Scanner;
import java.util.Arrays;

public class ActividadResuelta5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arrayPrincipal = new int[5];
		
		for(int i = 0; i< arrayPrincipal.length; i++) {
			System.out.print("Introduce un número:\n  >"); arrayPrincipal[i] = sc.nextInt();
		}
		
		System.out.println("Array: " +Arrays.toString(arrayPrincipal));
	}

}