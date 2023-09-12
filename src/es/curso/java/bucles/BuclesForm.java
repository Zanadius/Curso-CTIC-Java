package es.curso.java.bucles;

public class BuclesForm {
	public static void main(String[]args) {
		
		// Este sería un bucle infinito
		//for (	;	;	 ) {
		System.out.println("Hello World");
		
		// Se puede definir una variable dentro del for unicamente para ese bucle.
		for ( int num = 0 ; num <= 5 ; num ++ ) {
			System.out.println("Hello World");}
			
		// Se puede definir la variable fuera del buble antes de usarla por si se necesita usar luego.
		int num1 = 0;
		for ( ; num1 <= 5 ; num1 ++ ) {
			System.out.println("Hello World");}
			
		// Se puede añadir un && para una segunda condición.
		for ( int pares = 0; pares <=50; pares++) {
			 if (pares%2<=0)
			System.out.println(pares);
			}
		
		for ( int pares = 0; pares <=50; pares+=2) {
			System.out.println(pares);
			}
		
		// Podemos añadir una variable con (,)
		for (int par=0,impar=49; par<=50 ; par+=2, impar-=2) {
			System.out.println(par + " " + impar);}
		}
}
