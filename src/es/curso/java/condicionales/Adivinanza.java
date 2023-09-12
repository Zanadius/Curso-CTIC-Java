package es.curso.java.condicionales;

import java.util.Scanner;

public class Adivinanza {
	public static void main(String[] args) {

		// Ejercicio 1:
		System.out.println("Responde, aque objeto se refiere la siguiente adivinanza:"
				+ "-Volando voy, volando vengo; en un solo dedo me mantengo.-");
		Scanner scan = new Scanner(System.in);
		String respuesta = scan.nextLine();

		if (respuesta.contains("anillo")) {
			System.out.println("Correcto!");
		} else
			System.out.println("Incorrecto!");
		// La funcion contains analiza lo que hay dentro del dato ingresado y lo aprueba
		// anillos%

		// Ejercicio 2:

		System.out.println("Ingrese su nombre por favor:");
		Scanner identification = new Scanner(System.in);
		String name = identification.nextLine();
		// nextLine se una en Scanner para ingresar Strings

		System.out.println("Ingresa tu edad:");
		Scanner AgeIdentification = new Scanner(System.in);
		int age = AgeIdentification.nextInt();
		// nextInt se usa en Scanner para ingresar numeros

		String category = ("");

		if (age <= 5) {
			category = (", es usted un bebé");

		} else if (age <= 10) {
			category = (", es usted un niño");
		} else if (age <= 17) {
			category = (", es usted un adolecente");
		} else if (age <= 40) {
			category = (", es usted un adulto joven");
		} else if (age <= 60) {
			category = (", es usted un adulto");
		} else if (age <= 80) {
			category = (", es usted un adulto mayor");

		} else if (age > 80)
			category = (", es usted una leyenda");

		System.out.println(name + category);

	}
}
// Hacer una adivinanza
//Pedir a un usuario que introduzca nombre y edad, 0-5 años bebé, 6-15 niño, 16-20 adolecente, 
//20-40 adulto joven 40-60 adulto 60-80 adulto mayor, 80-100 veterano
//