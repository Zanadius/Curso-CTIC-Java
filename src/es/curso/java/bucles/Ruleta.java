package es.curso.java.bucles;

import java.util.Scanner;

public class Ruleta {
	public static void main(String[] arg) {

		Scanner scan = new Scanner(System.in);
		int opcion;
		int opciondocena;
		int saldo = 1000;
		int numeroapostar = 0;
		int apuesta = 0;
		int numeroganador;
		int end = 0;

		do {
			System.out.println("----- JUEGO DE LA RULETA -----");
			System.out.println("1. Apostar por un numero");
			System.out.println("2. Apostar por docenas");
			System.out.println("3. Apostar por par/impar");
			System.out.println("4. Apostar rojo/negro");
			System.out.println("5. Dejar de jugar");
			System.out.println("-----------------");
			System.out.print("Seleccione una opción: ");
			opcion = scan.nextInt();
			end = 0;
			if (opcion>=6) {
				System.out.println("Numero invalido, introduzca otro:");
				opcion = scan.nextInt();
			}

			switch (opcion) {

			case 1: // Numero especifico

				System.out.println("Introduzca el numero al que decea apostar (0-36):");
				numeroapostar = scan.nextInt();
				while (numeroapostar >= 36+1) {
					System.out.println("El numero debe estar entre el rango 0-36.");
					numeroapostar = scan.nextInt();
				}

				System.out.println("Cuanto dinero desea apostar?");
				apuesta = scan.nextInt();
				while (apuesta >= saldo+1 || apuesta <= 0) {
					System.out.println(
							"Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu saldo actual.");
					System.out.println("Saldo actual: " + saldo);
					apuesta = scan.nextInt();
				}
				saldo-=apuesta;
				numeroganador = ((int) (Math.random() * 36));
				System.out.println("Ha salido el numero: " + numeroganador);

				if (numeroganador == numeroapostar) {
					int ganancia = apuesta * 36;
					saldo += ganancia;
					System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
					end = 1;
				}break;

			case 2: // Docenas

				System.out.println("----- SELECCIONE UNA DODCENA -----");
				System.out.println("1. 0-12");
				System.out.println("2. 13-24");
				System.out.println("3. 26-36");
				opciondocena = scan.nextInt();
				
				if (opcion>=4) {
					System.out.println("Numero invalido, introduzca otro:");
					opcion = scan.nextInt();
				}

				switch (opciondocena) {

				case 1:
					System.out.println("Cuando dinero desea apostar?");
					apuesta = scan.nextInt();
					while (apuesta >= saldo+1 || apuesta <= 0) {
						System.out.println(
								"Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
						System.out.println("Saldo actual: " + saldo);
						apuesta = scan.nextInt();
					}
					saldo+=apuesta;
					numeroganador = ((int) (Math.random() * 36));
					System.out.println("Ha salido el numero " + numeroganador);

					if (numeroganador <= 12) {
						int ganancia = apuesta *= 12;
						saldo += ganancia;
						System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
						end = 1;
					}break;
					
				case 2:
					System.out.println("Cuando dinero desea apostar?");
					apuesta = scan.nextInt();
					while (apuesta >= saldo+1 || apuesta <= 0) {
						System.out.println(
								"Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
						System.out.println("Saldo actual: " + saldo);
						apuesta = scan.nextInt();
					}
					saldo-=apuesta;
					numeroganador = ((int) (Math.random() * 36));
					System.out.println("Ha salido el numero " + numeroganador);

					if (numeroganador >= 13 && numeroganador <= 24) {
						int ganancia = apuesta *= 12;
						saldo += ganancia;
						System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
						end = 1;
					}break;
					
				case 3:
					System.out.println("Cuando dinero desea apostar?");
					apuesta = scan.nextInt();
					while (apuesta >= saldo+1 || apuesta <= 0) {
						System.out.println(
								"Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
						System.out.println("Saldo actual: " + saldo);
						apuesta = scan.nextInt();
					}
					saldo-=apuesta;
					numeroganador = ((int) (Math.random() * 36));
					System.out.println("Ha salido el numero " + numeroganador);

					if (numeroganador >= 25 && numeroganador <= 36) {
						int ganancia = apuesta *= 12;
						saldo += ganancia;
						System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
						end = 1;
					}break;
				}
				break;			
			case 3: //Apostar Par/Impar
				
				System.out.println("\"----- SELECCIONE UN GRUPO DE NUMEROS -----\"");
				System.out.println("1. Numeros Pares.");
				System.out.println("2. Numeros Impares");
				opcion = scan.nextInt();
				
				if (opcion>=6) {
					System.out.println("Numero invalido, introduzca otro:");
					opcion = scan.nextInt();
				}
				
				switch (opcion) {
				
				case 1: //Numeros Pares
				
				System.out.println("Cuando dinero desea apostar?");
				apuesta = scan.nextInt();
				while (apuesta >= saldo+1 || apuesta <= 0) {
					System.out.println(
							"Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
					System.out.println("Saldo actual: " + saldo);
					apuesta = scan.nextInt();
				}
				saldo-=apuesta;
				numeroganador = ((int) (Math.random() * 36));
				System.out.println("Ha salido el numero " + numeroganador);

				if (numeroganador%2==0) {
					int ganancia = apuesta *= 2;
					saldo += ganancia;
					System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
					end = 1;
				}break;
				
				case 2: //Numeros Pares
					
					System.out.println("Cuando dinero desea apostar?");
					apuesta = scan.nextInt();
					while (apuesta >= saldo+1 || apuesta <= 0) {
						System.out.println(
								"Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
						System.out.println("Saldo actual: " + saldo);
						apuesta = scan.nextInt();
					}
					saldo-=apuesta;
					numeroganador = ((int) (Math.random() * 36));
					System.out.println("Ha salido el numero " + numeroganador);

					if (numeroganador%3==0) {
						int ganancia = apuesta *= 2;
						saldo += ganancia;
						System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
						end = 1;
					}break;
				}
				break;
			case 4: //Apostar por Colores
				System.out.println("\"----- SELECCIONE UN GRUPO DE COLORES -----\"");
				System.out.println("1. Verde: 0");
				System.out.println("2. Negro: 1-18");
				System.out.println("3. Negro: 19-36");
				opcion = scan.nextInt();
				
				if (opcion>=4) {
					System.out.println("Numero invalido, introduzca otro:");
					opcion = scan.nextInt();
				}
				
				switch (opcion) {
				
				case 1: // Verde: 0
					System.out.println("Cuanto desea apostar?");
					apuesta = scan.nextInt();
					while (apuesta >= saldo+1 || apuesta <= 0) {
						System.out.println("Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
						apuesta = scan.nextInt();
					}
					saldo-=apuesta;
					numeroganador = ((int) (Math.random() * 36));
					System.out.println("Ha salido el numero " + numeroganador);
					
					if (numeroganador == 0) {
						int ganancia = apuesta*36;
						saldo += ganancia;
						System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
						end = 1;
					}break;
					
				case 2: // Negro: 1-18 
					System.out.println("Cuanto desea apostar?");
					apuesta = scan.nextInt();
					while (apuesta >= saldo+1 || apuesta <= 0) {
						System.out.println("Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
						apuesta = scan.nextInt();
					}
					saldo-=apuesta;
					numeroganador = ((int) (Math.random() * 36));
					System.out.println("Ha salido el numero " + numeroganador);
					
					if (numeroganador >=1 && numeroganador <=18 ) {
						int ganancia = apuesta*2;
						saldo += ganancia;
						System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
						end = 1;
					}break;
					
				case 3: // Rojos: 19-36
					System.out.println("Cuanto desea apostar?");
					apuesta = scan.nextInt();
					while (apuesta >= saldo+1 || apuesta <= 0) {
						System.out.println("Recuerda, el valor de la apuesta no puede ser inferior a Cero ni superar tu Saldo actual.");
						apuesta = scan.nextInt();
					}
					saldo-=apuesta;
					numeroganador = ((int) (Math.random() * 36));
					System.out.println("Ha salido el numero " + numeroganador);
					
					if (numeroganador >=19 && numeroganador <=36 ) {
						int ganancia = apuesta*2;
						saldo += ganancia;
						System.out.println("Has ganado " + ganancia + ", tu saldo es de " + saldo + ".");
						end = 1;
					}break;
				}
				break;
			}
			
			if (end !=1){
				System.out.println("Has perdido, tu saldo es " + saldo);
				}
			
			if (saldo == 0) {
				System.out.println("----- SALDO INFUDICIENTE ¿QUE DESEAN HACER? -----");
				System.out.println("1. Recargar Saldo");
				System.out.println("2. Salir");
				opcion = scan.nextInt();
				if (opcion>=3) {
					System.out.println("Numero invalido, introduzca otro:");
					opcion = scan.nextInt();
				}

				switch (opcion) {
				case 1:

				System.out.println("Cuanto desea recargar?");
				saldo+= scan.nextInt();
				break;
				
				case 2:
				break;}
			}
		} while (opcion != 5);
		System.out.println("Gracias por jugar, su saldo final es de " + saldo);
		scan.close();
	}
}
