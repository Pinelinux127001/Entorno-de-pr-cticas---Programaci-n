package ejerciciosApuntes;

import java.util.Arrays;
import java.util.Random;

public class ActividadResuelta5_1 {

	public static void main(String[] args) {
		
		int[] arrayAleatorios = new int[10];
		int sumaArray = 0;
		int MIN = 1;
		int MAX = 100;
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			arrayAleatorios[i] = random.nextInt((MAX - MIN) + 1) + MIN;
			sumaArray += arrayAleatorios[i];
		}
		
		System.out.println("Array: " +Arrays.toString(arrayAleatorios));
		System.out.println("Suma de los valores del array: " +sumaArray);

	}

}