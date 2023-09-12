package es.curso.java.Pruebas;

import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float media = 0;
		float notaMaxima = 0;
		float notaMinima = 10;

		System.out.println("Cuantos estudiantes hay en la clase?");
		int numeroE = scan.nextInt();
		scan.nextLine();

		float[] notas = new float[numeroE];
		String[] estudiantes = new String[numeroE];

		for (int num = 0; num < numeroE; num++) {
			System.out.println("Introduzca el nombre del estudiante #" + (num + 1));
			estudiantes[num] = scan.nextLine();

			System.out.println("Introduce su nota");
			notas[num] = scan.nextFloat();
			scan.nextLine();
		}
		// Media
		for (float nota : notas) {
			media = media + nota;
		}
		media = media / estudiantes.length; // El length manda el numero de valores, no empieza desde 0.
		System.out.println("La nota media es:" + media);

		// Nota Maxima
		for (float nota : notas) {
			if (nota > notaMaxima) {
				notaMaxima = nota;
			}
		}
		System.out.println("La nota maxima es:" + notaMaxima);

		for (float nota : notas) {
			System.out.println(nota);
		}

		// Nota Minima
		for (float nota : notas) {
			if (nota < notaMinima) {
				notaMinima = nota;
			}
		}
		System.out.println("La nota minima es:" + notaMinima);

		// Orden Mayor->Menor
		for (int num = 0; num < numeroE; num++) {
			for (float nota : notas) {
				if (notas[num] < nota) {
					float cambio = notas[num];
					notas[num] = nota;
				}

				System.out.println("Verificación sub-Float");
			}
			System.out.println("Verificacion Float");
		}
		System.out.println("Las notas organizadas de mayor a menor.");
		for (float nota : notas) {
			System.out.println(nota);
		}

	}
}
