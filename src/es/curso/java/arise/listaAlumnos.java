package es.curso.java.arise;

public class listaAlumnos {
	public static void main(String[] arg) {

		String[] alumnos = { "Alumno1:9", "Alumno2:8", "Alumno3:3", "Alumno4:4", "Alumno5:5", "Alumno6:10",
				"Alumno7:4" };

		int numeroAlumnos = alumnos.length;

		System.out.println("El numero de alumnos en la clase es: " + numeroAlumnos);

		String[] nombres = new String[numeroAlumnos];
		String[] notasStr = new String[numeroAlumnos];
		int[] notas = new int[numeroAlumnos];
		int numeroAprobados = 0;

		for (int num = 0; num < alumnos.length; num++) {
			nombres[num] = alumnos[num].substring(0, alumnos[num].indexOf(":"));
			notasStr[num] = alumnos[num].substring(alumnos[num].indexOf(":") + 1);
			notas[num] = Integer.parseInt(notasStr[num]); // Para convertir un Str a un int usamos la expresión int num.
			if (notas[num] >= 8) {
				numeroAprobados++;
			}
		}

		String[] alumnosAprobados = new String[numeroAprobados];
		int[] notasAprobados = new int[numeroAprobados];
		int indice = 0;

		for (int num = 0; num < alumnos.length; num++) {
			nombres[num] = alumnos[num].substring(0, alumnos[num].indexOf(":"));
			notasStr[num] = alumnos[num].substring(alumnos[num].indexOf(":") + 1);
			notas[num] = Integer.parseInt(notasStr[num]);
			if (notas[num] >= 8) {
				alumnosAprobados[indice] = nombres[num];
				notasAprobados[indice] = notas[num];
				indice++;
			}
		}
		System.out.println("La cantidad de alumnos aprobados es: " + numeroAprobados);
		System.out.println("Los alumnos aprobados son: ");
		for (int num = 0; num < numeroAprobados; num++) {
			System.out.println(alumnosAprobados[num] + " con la nota: " + notasAprobados[num]);
		}
	}
}
// Split de la clase String
