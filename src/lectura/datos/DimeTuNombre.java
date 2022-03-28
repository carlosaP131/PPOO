package lectura.datos;

import java.util.Scanner;

public class DimeTuNombre {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// String nombre;
		System.out.print("Por favor, dime cómo te llamas: ");
		String nombre = s.nextLine();
	
		// System.out.println("Hola " + nombre + ", encantado de conocerte");
		System.out.print("Introduce tu edad: ");
		int edad = Integer.parseInt(s.nextLine());
		System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
	}

}
