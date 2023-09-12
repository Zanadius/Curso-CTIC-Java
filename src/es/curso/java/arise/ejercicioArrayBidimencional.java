package es.curso.java.arise;

import java.util.Scanner;

public class ejercicioArrayBidimencional {
	public static void main(String[] arg) {

		System.out.println("Introduce el numero de filas para el Array:");
		Scanner scan = new Scanner(System.in);
		int longitud = scan.nextInt();
		int[][] datos = new int[longitud][longitud];

		for (int num = 0; num < datos.length; num++) {
			for (int i = 0; i < datos[num].length; i++) {
				System.out.println("Introduce el dato de la cordenada " + num + "," + i);
				datos[num][i] = scan.nextInt();
			}
		}
		for (int num = 0; num < datos.length; num++) {
			for (int dato : datos[num]) {
				System.out.print(dato + " ");
			}
			System.out.println();
		}

		int[] diagonal = new int[longitud];

		for (int num = 0; num < datos.length; num++) {
			diagonal[num] = datos[num][num];
			System.out.print(diagonal[num] + " ");
		}
		System.out.println();
		System.out.println("Final:");

		for (int i = 0, j = datos.length - 1; i < datos.length / 2; i++, j--) {
			int aux = datos[i][j];
			datos[i][j] = datos[j][i];
			datos[j][i] = aux;
		}
		for (int num = 0; num < datos.length; num++) {
			for (int dato : datos[num]) {
				System.out.print(dato + " ");
			}
			System.out.println();
		}
	}

}
