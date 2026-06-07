package ejerciciosHoja;

import java.util.Arrays;

public class Ejercicio5_11 {

	public static void main(String[] args) {
		
		int[] arrayPrincipal = {1, 2, 3, 3, 4, 5, 6, 6, 7, 6, 8, 9};
		int clave = 6;
		
		int[] arraySecundario = buscaTodos(arrayPrincipal, clave);
		System.out.println("La clave " +clave+ " se encuentra en los siguientes índices: ");
		System.out.println(Arrays.toString(arraySecundario));

	}
	
	public static int[] buscaTodos(int array[], int clave) {
		
		int contador = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == clave) contador++;
		}
		
		int[] arrayFuncion = new int[contador];
		int pos = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == clave) {
			    arrayFuncion[pos++] = i;
			}
		}
		
		return arrayFuncion;
		
	}

}
