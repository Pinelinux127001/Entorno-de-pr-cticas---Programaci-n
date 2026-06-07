package ejerciciosApuntes;

import java.util.Arrays;

public class ActividadResuelta5_6 {

	public static void main(String[] args) {
		
		int[] apuestaPrimitiva = {35, 64, 78, 98, 32, 40};
		int[] combinacionGanadora = {15, 20, 35, 40, 50, 60};
		
		int aciertos = numeroAciertos(apuestaPrimitiva, combinacionGanadora);
		
		System.out.println("Has acertado " +aciertos+ " números");
		
	}
	
	public static int numeroAciertos(int array1[], int array2[]) {
		int contador = 0;
		for(int i = 0; i< array1.length; i++) {
			for(int j = 0; j< array2.length; j++) {
				if(array1[i] == array2[j]) contador++;
			}
		}
		return contador;
		
	}

}