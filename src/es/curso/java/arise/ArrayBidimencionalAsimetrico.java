package es.curso.java.arise;

public class ArrayBidimencionalAsimetrico {
	static public void main(String[] arg) {

		int[][] numeros = new int[3][]; // Indicamos el numero de fila, dejamos el espacio de las columnas nulo.
		
		// int [][] otroNumero = new int [][3]; // Esto no puede hacerse porque sin filas no hay columnas.

		numeros[0] = new int[2]; // Cada fila de un Array bidimencional puede ser tratado como un Array
									// Unidimencional, en este caso damos 2 culumnas a la fila 0.
		
		numeros[0][1] = 3; // Asignamos un valor a la columna 1 de la fila 0.
		
		for (int i = 0; i<numeros.length;i++) {
			for (int j =  0 ; j<numeros[i].length;j++) { // La condición se limita con el numero de columnas.
			}
		}
	}
}
