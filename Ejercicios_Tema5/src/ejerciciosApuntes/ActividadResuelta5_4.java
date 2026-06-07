package ejerciciosApuntes;

import java.util.Arrays;

public class ActividadResuelta5_4 {

	public static void main(String[] args) {
		
		int[] arrayPrincipal = {1, 5, 2, 4, 6, 5, 767, 445 ,45};
		
		int maximo = maximo(arrayPrincipal);
		
		System.out.println(maximo);

	}
	
	public static int maximo(int t[]) {
		int maximo = 0;
		Arrays.sort(t);
		maximo = t[t.length -1];
		return maximo;
	}
	
}