package Ejercicio03;

import java.util.Scanner;

public class MainPizza {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		int codigo=0;
		String tamayo="";
		String tipo="";
		String estado="";

		while (!(opcion == 4)) {
			menu();
			System.out.print("Introduzca la opcion que deseas utilizar: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Estas son las pizza--> ");
				System.out.println(ArraysPizzas.recorre()); 
				break;
				
			case 2:
				System.out.print("Introduce el codigo -->");
				 codigo = sc.nextInt();
				 sc.nextLine();
				 
				 System.out.print("Introduce el tamaño -->");
				 tamayo = sc.nextLine();
				 
				 System.out.print("Introduce el tipo -->");
				 tipo = sc.nextLine();
				 
				 Pizza pizza1= new Pizza(codigo, tamayo, tipo);
				 
				 if(!ArraysPizzas.buscarCodigo(codigo) && ArraysPizzas.addPizza(pizza1)) {
					 System.out.println("Se a añadido correctamente.");
				 } else {
					 System.out.println("No se ha podido añadir.");
				 }
				break;
			
			case 3:
				
				break;
			default:
				System.out.println();
				break;

			}
		}

	}

	public static void menu() {
		System.out.println("!BIENVENIDOS A PIZZAS PACA!");
		System.out.println("---------------------------");

		System.out.println("1. Listado de pizza: ");
		System.out.println("2. Nuevo pedido: ");
		System.out.println("3. Pizza servida: ");
		System.out.println("4. Salir: ");
	}

}
