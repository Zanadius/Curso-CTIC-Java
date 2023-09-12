package es.curso.java.bucles;

public class BuclesRandomContinueBreak {
	
		public static void main(String[]args) {
	
	// Math es una clase que nos da funciones matematicas, 
	//no se encuentra en el paquete java land, por eso toca iniciarla.
	
	// Esta funcion nos arroja un numero aleatorio entre el 0 y el 1
	System.out.println((int)(Math.random()));
	
	// Dado de 6 caras con resultado aleatorio, 
	// Si sale un 0 sería 0*6+1=1
	// Si sale un 1 seria multiplicado 
	System.out.println((int)(Math.random()*6)+1);
	
	for (int i = 0 ; i<5 ; i++) {
		System.out.println(i);
		System.out.println("Pasa 0");
		if (i%2==0) {
			continue;
			// Si cumple la condición Reitera el Bucle saltandose lo que esté fuera del condiconal if, 
			// en este caso "Paso 1".
		}
		if (i%3==0) {
			break;
			// Rompe el bucle
			// Cualquier codigo escrito despues de break o continue no se va a ejecutar
		}
		System.out.println("Paso 1");
	}
	System.out.println("Fin");
}
}
