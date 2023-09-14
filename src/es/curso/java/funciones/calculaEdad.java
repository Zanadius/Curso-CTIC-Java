package es.curso.java.funciones;

import java.util.Scanner;

public class calculaEdad {
	static int calculadorEdad(String []anioNacimiento) {
		
		Scanner scan = new Scanner(System.in);
		int edad = 2023-scan.nextInt();
		String fechaNacimiento = Integer.parseStr(edad);
		return fechaNacimiento;
	}
}
