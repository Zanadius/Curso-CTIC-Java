package es.curso.java.arise;

public class arraysBidimencionales {
	public static void main(String[] arg) { // String[[arg {} es un Array.

		String[][] animales = new String[3][5];

		System.out.println(animales[0][0]); // Muestra Null porque el String está vacio.
		animales[0][0] = "Gato";

		System.out.println(animales.length); // Muestra el numero de filas.
		System.out.println(animales[0].length); // Muestra el numero de columnas de una fila.

		String lista0 = "Pollo,Cerdo,Vaca,Perro,Gato";
		String lista1 = "Leon,Pantera,Lince,Guepardo,Puma";
		String lista2 = "Cotorro,Carpintero,Petirojo,Canario,Aguila";

		animales[0] = lista0.split(",");
		animales[1] = lista1.split(",");
		animales[2] = lista2.split(",");

		for (int num = 0; num < animales.length; num++) {
			System.out.println("Fila:" + num);
			for (int num1 = 0; num1 < animales[num].length; num1++) {
				animales[num][num1] = "*"; // Se pasa por cada fila y columna, con un Scan se le puede ir llenando los
											// datos
				System.out.print(animales[num][num1] + ",");
			}
			System.out.println(); // Al deharlo vacio funciona como un Enter para pasar a la siguiente linea.
		}

		for (int num = 0; num < animales.length; num++) {
			System.out.println("Fila: " + num);
			for (String animal : animales[num]) {
				System.out.print(animal + ",");
			}
			System.out.println();

		}
		System.out.println("======================================");
		for (String[] fila : animales) {
//			System.out.println(fila); //Esto daría error porque hace es referencia a la fila.
			for (String dato : fila) {
				System.out.print(dato);
			}
			System.out.println();
		}

		int[][] listaNumeros = { { 1, 2, 3 }, { 4, 5, 6 } }; // De esta forma se guardan los datos en un Array
																// Bidimencional.

	}

}
