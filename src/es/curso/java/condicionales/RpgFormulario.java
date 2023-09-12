package es.curso.java.condicionales;

import java.util.Scanner;

public class RpgFormulario {
	public static void main (String[]arg) {
		
		System.out.println("Introduzca su nombre");
		Scanner IngresoNombre = new Scanner(System.in);
		String Nombre = IngresoNombre.nextLine();
		
		System.out.println("¿Escogeras facción Horda o Alianza?");
		Scanner IngresoFaccion = new Scanner(System.in);
		String Faccion = IngresoFaccion.nextLine();
		
		System.out.println("¿Serás Arquero, Guerrero o Mago");
		Scanner IngresoClase = new Scanner(System.in);
		String Clase = IngresoClase.nextLine();
		
		System.out.println("¿A que raza pertenecerás?¿Elfos, Humanos o Enanos?");
		Scanner IngresoRaza = new Scanner(System.in);
		String Raza = IngresoRaza.nextLine();
		
		System.out.println("¿Estas listo para empezar tu aventura? S/N");
		Scanner IngresoR = new Scanner(System.in);
		String R = IngresoR.nextLine();
		
		System.out.println("Bienvenido " + Nombre + ", entiendo que haces parte de la " + Faccion + 
							"\n¿Que trae por aquí a un " + Raza + "?" + 
							"A juzgar por tus vestimentas eres un " + Clase + " ¿Me equivoco? " + 
							"\nBueno no es de mi incunvencia, ten una cerveza. Invita la casa");
		
	}
}
