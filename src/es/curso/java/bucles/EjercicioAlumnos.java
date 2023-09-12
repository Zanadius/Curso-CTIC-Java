package es.curso.java.bucles;

import java.util.Scanner;

public class EjercicioAlumnos {
	public static void main(String[]args) {
	
		// Añadimos el numero de Alumnos en el scanner
		System.out.println("Introduce numero de alumnos en la clase: ");
		Scanner scan = new Scanner(System.in);
		int numAlumnos = scan.nextInt();
		double sumatoriaNotas =0;
		double notaMaxima = 10;
				
//		/* - Pedimos el dato de numAlumnos y esta la usaremos como una condicional interactiva. 
//		 / - Declaramos la condicional del bucle teniendo en cuenta que si empezamos en 0 lo cuenta como una unidad.		
//		 / - La condicion que definimos en el bucle es que la variable debe ser menor o igual al primer dato que introdujimos.
//		 / - La acción posterior a recibir una verificación de la condición es sumarle +1 a la variable del bucle.
//		 / - Posteriori abrimos un Scanner para introducir un dato que se guardará dentro de si y 
//		 / se sumará con el dato ingresado en la siguiente repetición.
//		*/ - Se repetirá el bucle hasta que num = 3.
		for (int num = 1; num <= numAlumnos ; num++) {
			System.out.println("Introduce la nota del alumno" + num);
			scan = new Scanner(System.in);
			sumatoriaNotas = scan.nextDouble();
				/* Nota más baja:
				 * Usamos una variable como punto maximo de referencia y al compararlo con la nota ingresada 
				 * Ingresada<Maxima, revaloramos la variable de valor maximo. Maxima = Ingresada.
				 * En caso que Ingresada<Maxima, al no cumplirse la condición no hace la modificación y 
				 * sigue el bucle sin problema.
				 */
				if (sumatoriaNotas<notaMaxima) {
					notaMaxima = sumatoriaNotas;
				}
			// MEDIA:
			//sumatoriaNotas = sumatoriaNotas + scan.nextDouble();
			//sumatoriaNotas += scan.nextDouble();
				}
			
		// Al final sacamos la media con una operación.
		//System.out.print("La media de todos los alumnos es: " + sumatoriaNotas/numAlumnos);
		System.out.print("La nota más baja es: " + notaMaxima);
		
		
		
}
}