package es.curso.java.introduccion;

/*
 * Declarar 3 Variables locales:
 *  + 2 Strings Nombre y Apellido
 *  + 1 int anioNacimiento
 * Inicializar las variables.
 * Mostrar los datos con la edad del usuario e indicando con true o false 
 * si el año es par o impar.
 */

public class EjercicioOperadoresUno {
	
	public static void main(String[]args) {
	
	//Variables locales Declaradas e Iniciadas
	String nombre = "Carlos";
	String apellido = "Bolaños";
	int anioNacimiento = 1996;
	int edad = 2023-anioNacimiento;
	boolean esPar = (anioNacimiento%2)==0;
		
		System.out.println("El usuario "+nombre+" "+apellido+
				" tiene "+edad+" años, \nnació en año par "+esPar);
		
		System.out.println("El usuario "+nombre+" "+apellido+ " tiene "
				+(2023-anioNacimiento)+" años, \nnació en año par "+((anioNacimiento%2)==0));
	}
}
