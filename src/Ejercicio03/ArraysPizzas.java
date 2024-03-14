package Ejercicio03;

public class ArraysPizzas {
	
	private static Pizza[] pizzas = new Pizza[50];
	
	public static String recorre() {
		String cadena="";
		for(int i=0; i < pizzas.length; i++) {
			if(pizzas[i] != null) {
				cadena += pizzas[i].toString();
			}
		}
		
		return cadena;
	}
	
	public static boolean addPizza(Pizza piz) {
		int posicion;
		boolean addPiz=false;
		
		posicion = buscarPosicion();
		
		if(posicion >= 0) {
			pizzas[posicion] = piz;
			addPiz = true;
		}
		
		return addPiz;
	}
	
	public static int buscarPosicion() {
		int posicion=0;
		int posicionNulo=-1;
		boolean encontrado=false;
		
		while(posicion < pizzas.length && !encontrado) {
			if(pizzas[posicion]== null) {
				posicionNulo = posicion;
				encontrado=true;
			}
			posicion++;
		}
		
		return posicionNulo;
	}
	
	public static boolean buscarCodigo(int codigo) {
		int posicion=0;
		boolean repetido=false;
		
		while(posicion < pizzas.length && !repetido) {
			if(pizzas[posicion]!= null) {
				if(pizzas[posicion].getCodigo() == codigo) {
					repetido=true;
				}
			}
			posicion++;
		}
		
		return repetido;
	}
	
}
