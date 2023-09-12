package es.curso.java.Pruebas;

import java.util.Scanner;

public class Pruebas2 {
	public static void main(String[] arg) {
		
		//Lo único que se puede cambiar de la función es el "arg".
		Scanner scan = new Scanner(System.in);

		// Aulas del colegio
		System.out.println("Introduzca el numero de aulas: ");
		int numeroAulas = scan.nextInt();
		String[][] aulas = new String[numeroAulas][];

		// Estudiantes * aula
		for (int i = 0; i < aulas.length; i++, numeroAulas++) {
			System.out.println("Introduzca el numero de estudiantes del aula: " + (i + 1));
			int numeroEstudiantes = scan.nextInt();
			scan.nextLine();
			aulas[i] = new String[numeroEstudiantes];

		}
	}
}