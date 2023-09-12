package es.curso.java.bucles;

public class BucleDados {
public static void main(String[] args) {
    	
    	int limitador = 0;
    	int tiradas = 0;
    	    	
    	for (		; limitador <=2;		) {
        	int dado = ((int)(Math.random()*6)+1);
			System.out.println(dado);
			tiradas++;
    		if (dado !=6) {
    			limitador = 0;
        		System.out.println("Otro dado!!!");
        		continue;}
        	if (dado ==6) {
        		limitador+=1;
        		System.out.println("Otro dado!!!");
    			continue;}
    		}
		System.out.println("Ha salido el 6 tres veces seguidas y se lanzaron los dados " + tiradas + " veces.");
    }
  } 
