package es.curso.java.condicionales;

import java.util.Scanner;

public class Llamadas {
	public static void main(String[] args) {

		System.out.println("Bienvenido/a al calculador de coste de llamadas:"
				+ "Por favor indique cuanto tiempo durará su llamada(minutos)");
		Scanner consultaminutos = new Scanner(System.in);
		//Se puede usar System.err.println(); para imprimir errores

		int minutos = consultaminutos.nextInt();

		double tarifa = 0;

		if (minutos <= 5) {
			tarifa = 1;
		} else if (minutos <= 8) {
			tarifa = 1.8;
		} else if (minutos <= 10) {
			tarifa = 2.5;
		} else if (minutos > 10) {
			tarifa = 2.5 + ((minutos - 10) * 0.5);
		}

		System.out.println("¿Que día realizará su llamada?");
		Scanner consultadia = new Scanner(System.in);
		String dia = consultadia.nextLine();

		if (dia.equalsIgnoreCase("domingo")) {
			tarifa = tarifa * 1.03;
			
			//%.1f -> se formatea el resultado para mostrar una cantidad de decimales especifica.
			//printf -> Se formatea el print
			System.out.println("El valor de la llamada a realizar sería de: " + tarifa + "Є");
		} else {
			System.out.println("¿En que hora realizará su llamada? (formato 24Hrs)");
			Scanner consultajornada = new Scanner(System.in);
			int jornada = consultajornada.nextInt();

			if (jornada <13) {
				tarifa *= 1.15;
				// Es igual a tarifa = tarifa * 1.10;
				System.out.println("El valor de la llamada a realizar sería de: " + tarifa + "Є");
			} else {
				tarifa *= 1.10;
				System.out.println("El valor de la llamada a realizar sería de: " + tarifa + "Є");
			}
		}
	}
}