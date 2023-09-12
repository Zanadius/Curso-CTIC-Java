package es.curso.java.arise;

import java.util.Scanner;

public class colegiosArrays {
	public static void main(String[] arg) {

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
		// Rellenar los datos de cada estudiante
		for (int i = 0; i < aulas.length; i++) {
			for (int j = 0; j < aulas[i].length; j++) {

				System.out.println("Introduzca los datos del estudiante ubicado en el aula " + (i + 1) + "," + (0 + 1));
				System.out.println("Nombre: ");
				String nombre = scan.nextLine();
				System.out.println("DNI: ");
				String dni = scan.nextLine();
				System.out.println("Nota: ");
				String nota = scan.nextLine();
				aulas[i][j] = nombre.concat(":" + dni + ":" + nota);
			}
		}

		// Mostrar datos Estudiantes
		for (int i = 0; i < aulas.length; i++) {
			System.out.println("Estudiantes aula" + " " + (i + 1) + ":");
			for (int j = 0; j < aulas[i].length; j++) {
				String[] datosEstudiante = aulas[i][j].split(":");
				String nombre = datosEstudiante[0];
				String dni = datosEstudiante[1];
				String nota = datosEstudiante[2];
				System.out.println("	" + nombre + " " + dni + " " + nota);
			}
		}

		// Mostrar datos aprobados.
		String[][] aprobados = new String[aulas.length][];

		for (int i = 0; i < aulas.length; i++) {
			aprobados[i] = new String[aulas[i].length];

			for (int j = 0; j < aulas[i].length; j++) {
				String[] datosEstudiantes = aulas[i][j].split(":");
				int nota = Integer.parseInt(datosEstudiantes[2]);

				if (nota >= 8) {
					String estudianteAprobado = datosEstudiantes[0] + ":" + datosEstudiantes[1] + ":"
							+ datosEstudiantes[2];
					aprobados[i][j] = estudianteAprobado;
				}
			}
		}

		for (int i = 0; i < aprobados.length; i++) {
			for (String aprobado : aprobados[i]) {
				System.out.println(aprobado);
			}
		}
	}
}