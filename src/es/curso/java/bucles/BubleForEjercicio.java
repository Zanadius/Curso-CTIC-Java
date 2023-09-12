package es.curso.java.bucles;

import java.util.Scanner;

public class BubleForEjercicio {
	public static void main(String[]args) {
		
        System.out.println("Introduce un numero: ");
        Scanner ingresoColl = new Scanner(System.in);
        int Collatz = ingresoColl.nextInt();

//      for ( ; Collatz!=1; ) { 	
//        	if(Collatz%2==0) {
//        		Collatz/=2;
//        	}else {
//        		Collatz=Collatz*3+1;
//        	}    		System.out.println(Collatz);
//        }        		
        
     // Operador ternario funciona i = if ? acción : else / acción
    	Collatz = Collatz%2==0 ? Collatz/=2 : Collatz*3+1;
    }
}