package es.curso.java.condicionales;

import java.util.Scanner;

public class Dado6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcion;
		int Saldo = 0;
		int apuesta = 0;

		do {
			System.out.println("----- MENÚ -----");
			System.out.println("1. Jugar");
			System.out.println("2. Salir");

			opcion = scan.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Cuento dinero quiere recargar a su saldo?");
				Saldo = scan.nextInt();

				System.out.println(
						"Por favor introduzca la cantidad a apostar, el valor de la ganancia será tres veces el valor apostado");
				apuesta = scan.nextInt();

				while (Saldo <= apuesta) {
					System.out.println("Saldo insuficiente, introduzca otro valor para su apuesta");
					apuesta = scan.nextInt();
				}

				System.out.println("Cuantas veces desea tirar el dado?");
				int tiradas = scan.nextInt();

				System.out.println("A que numero desea apostar?");
				int numeroganador = scan.nextInt();

				int ganancia = apuesta * 3;

				for (int num = 1; num <= tiradas; num++) {
					int dado = ((int) (Math.random() * 6) + 1);

					if (apuesta >= Saldo) {
						System.out.println("Saldo insuficiente");
						break;
					}

					if (numeroganador == dado) {
						System.out.println(dado);
						System.out.println("Has ganado " + ganancia);
						Saldo += ganancia;
					} else if (numeroganador != dado) {
						System.out.println(dado);
						System.out.println("Has perdido " + apuesta);
						Saldo -= apuesta;
					}
				}
				System.out.println("Su saldo es de " + Saldo);
				break;

			case 2:

				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
			}
		} while (opcion != 2 || Saldo <= apuesta);
	}
}
