package ejerciciosApuntes;

import java.util.Arrays;

public class ActividadPropuesta5_5 {

	public static void main(String[] args) {
		
		int[] arrayOriginal = {11, 12, 13, 14, 15, 17, 18, 19, 20};
		int valorAIntroducir = 16;
		
		int[] resultado = introducirValor(valorAIntroducir, arrayOriginal);
		
		System.out.println("Resultado: " +Arrays.toString(resultado));
		
	}
	
	public static int[] introducirValor(int valorAIntroducir, int[] arrayOriginal){
		int inicio = 0;
		int fin = arrayOriginal.length - 1;
		int medio = 0;

		while(inicio <= fin) {
		    medio = (inicio + fin) / 2;
		    if(valorAIntroducir > arrayOriginal[medio]) {
		        inicio = medio + 1;
		    } else {
		        fin = medio - 1;
		    }
		}
		int indiceInsercion = inicio;
		
		int[] arrayCopia = new int[arrayOriginal.length + 1];
		
		for(int i = 0; i < arrayOriginal.length; i++) {
		    if(i < indiceInsercion) {
		        arrayCopia[i] = arrayOriginal[i];
		    } else {
		        arrayCopia[i + 1] = arrayOriginal[i];
		    }
		}
		
		arrayCopia[indiceInsercion] = valorAIntroducir;
		return arrayCopia;

	}
}