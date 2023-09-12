package es.curso.java.condicionales;

import java.util.Scanner;

public class Switch {
	public static void main (String []args) {

		String color = "Azul";
		
		// El Switch es un condicional de una sola variable.
		// Se usa sobretodo por lo compacto y limpio.
		switch (color) {
		
		case "Azul" : System.out.println("El color es Azul"); break;
		case "Amarillo" : System.out.println("El color es Azul"); break;
		default : System.out.println("El color es Azul"); break;
		}
		
		System.out.println("Introduce un mes: ");
		Scanner MesSolicitado = new Scanner(System.in);
		String Mes = MesSolicitado.nextLine();
		String Estacion = "";
		// toLowerCase(); Combierte las Strings en minusculas.
		Mes = Mes.toLowerCase();
		
		// El Switch se usa como condicional de una unica variable, sin opción || o &&.
		switch (Mes) {
		
		// Si no cumplea con el primer caso va saltando al siguiente hasta que se cumpla la condicion.
		// Se coloca un break para detener el procesamiento.
		case ("enero") : 
		case ("febrero") : 
		case ("marzo") : 
			Estacion = "Invierno"; 
			System.out.println("Invierno");
			break;
		case ("abril") : 
		case ("mayo") : 
			Estacion = "Invierno"; 
			System.out.println("Primavera");
			break;
		case ("junio") : 
		case ("julio") : 
			Estacion = "Invierno"; 
			System.out.println("Verano");
			break;
		case ("agosto") : 
			Estacion = "Invierno"; 
			System.out.println("Vacaciones de Verano");
			break;
		case ("septiembre") : 
		case ("octubre") : 
		case ("noviembre") : 
			Estacion = "Invierno"; 
			System.out.println("Otoño");
			break;
		case ("dicembre") : 
			Estacion = "Invierno"; 
			System.out.println("Vacaciones de Navidad");
			break;
			
		}
	}
}