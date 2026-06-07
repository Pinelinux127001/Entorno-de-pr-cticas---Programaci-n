package ejerciciosApuntes;

public class ActividadPropuesta5_4 {

	public static void main(String[] args) {
		
		int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int clave = 10;
		
		int resultado = buscar(t, clave);
		
		System.out.println(resultado);
		
	}
	
	public static int buscar(int t[], int clave) {
		
		int indiceBusqueda = 0;
		
		while(indiceBusqueda < t.length && t[indiceBusqueda] != clave) {
			indiceBusqueda++;
		}
		
		if(indiceBusqueda < t.length) {
			System.out.println("Se ha encontrado la clave de búsqueda.");
		} else {
			System.out.println("No se ha encontrado la clave de búsqueda.");
			indiceBusqueda = -1;
		}
		
		return indiceBusqueda;
		
	}

}