package es.curso.java.arise;
import java.util.Scanner;
public class listaColores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Cuantos colores quieres guardar?");
		int numerocolores = scan.nextInt();
		String[] colores = new String[numerocolores];

		for (int num = 0; num < numerocolores; num++) {
			System.out.println("Introduce el nombre del Color " + (num + 1));
			scan = new Scanner(System.in);
			colores[num] = scan.nextLine().trim();
		}
		System.out.println("La lista de colores contiene " + numerocolores + " valores, estos son:");
		for (int num = 0; num < numerocolores; num++) {
			System.out.println(colores[num]);
		}
		// Bucle for-each, asigna los valores almacenados del array en una variable.
		// Acceso rapido fore_
		System.out.println("Lista usando Bucle For - each.");
		for (String color : colores) {
			System.out.println(color);
		}

		System.out.println("Estos colores contienen la letra O y empiezan por A:");
		for (String color : colores) {
			if (color.contains("o") && color.toLowerCase().startsWith("a") && color.toLowerCase().charAt(0) == 'a') {
				System.out.println(color);
			} //.charAt(0)== 'a' en este caso hablamos de un caracter (valor primitivo) especifico, por eso usamos == y ''.
		}
	}
}
