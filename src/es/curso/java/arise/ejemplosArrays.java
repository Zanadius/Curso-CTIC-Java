package es.curso.java.arise;

public class ejemplosArrays {
	public static void main(String[] arg) {
		String nombre = "Raúl";
		// ARRAY cuando conocemos los valores
		String[] nombres = { "n1", "n2", "n3", "n4" };
		System.out.println(nombres.length); // No lleva parentesis porque se refiere a una propiedad.
		System.out.println(nombres[1]); // -> n2

		for (int num = 0; num < nombres.length; num++) {
			System.out.println(nombres[num]);
		}
		// Modificar el valor de una posición.
		nombres[2] = "n0";

		// Llenar los varoles en un array.
		int[] numeros = new int[3]; // Definimos la cantidad de valores que va a almacenar.
		String[] otrosNombres = new String[3];

		// Si tenemos un valor primitivo dentro del Array, pero no le hemos definido un
		// valor se autoinicia en 0.
		for (int num = 0; num < numeros.length; num++) {
			System.out.println(numeros[num]);
		} // Si el valor es un Objeto (Str) pero no se ha definido valor y se invoca, es
			// null.
		for (int num = 0; num < otrosNombres.length; num++) {
			System.out.println(otrosNombres[num]);
		}
		// Así modificamos un valor dentro de un Array
		numeros[1] = 2;
		otrosNombres[1] = "Carlos";

	}
}
