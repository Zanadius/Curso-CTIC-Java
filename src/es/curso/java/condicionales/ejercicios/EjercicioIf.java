package es.curso.java.condicionales.ejercicios;

import java.util.Scanner;

/* 
1.	Declarar/Inicializar una variable String con el valor del nombre de un mes.
2.	Dependiendo del nombre del mes indicar la estación del año.
3.	Si el nombre del mes es incorrecto, indicarlo.
*/

public class EjercicioIf {
	public static void main(String[]args){
		
		System.out.println("Introduce un mes");
		Scanner scan = new Scanner(System.in);
		// Variable tipo scaner. 
		// Debemos importar la classe Scanner porque no se encuentra en el paquete Java.lang 
		
		String mes = scan.nextLine();
		// El scan.nextLine(); pausa el programa hasta que se le introduzca un dato y se le dé enter.
		
		String estacion = "";
		// Las cadenas Str se comparan con equal.
		// El == compara ubicación dedos objetos dentro de una memoria.
		// Podemos cambiar los == por equals si seleccionamos [==] y luego ctrl+f
		
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Marzo")) { 
			estacion = "Invierno";
			
		}else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) {
			estacion = "Primavera";
			
		}else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre")) {
			estacion = "Verano";
			if (mes.equalsIgnoreCase("Agosto")) {
				estacion += ", son vacaciones de Verano";}
				// Unimos una variable con una cadena de texto.
				// Es lo mismo que salida = salida + ", son vacaciones de Verano".
				// Para negar != que es lo mismo que !equeals traduce -> no es igual a...
			
		}else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre")) {
			estacion = "Otoño";
		}	if (mes.equalsIgnoreCase("Diciembre")) {
			estacion += ", son vacaciones de Navidad";}
		
		if (estacion.equalsIgnoreCase("")){
			System.out.println("Mes incorrecto");
		}else
			System.out.println("Estás en " + estacion);
}
}