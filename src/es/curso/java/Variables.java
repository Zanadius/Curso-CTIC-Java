package es.curso.java;

public class Variables {
	//Variable local : Solo puede usarse dentro del método.
	//Variable Instancia: Se inician solas
	
	static String curso = "Curso Java";
	static int numero=18;
	public static void main(String[]args) {
		
		int num; //Declaracion
		num=7;//Inicializar
		int numero5;
		numero5 = 9; 
		
		System.out.println("numero:" + numero +
		 numero5 + num);
		//Comentario de línea
		 
		 int n1, n2, n3; 
		 //Se pueden escribirse así pero no es recomendable.
		
		/*
		  Comentario de Bloque
		 */
		
		//Declaracion de variable
		//El tipo de variable precede el nombre de la variable
		//El aviso en amarillo solo es una recomendación
		
		/*
		  Tipo
		int = Tipo primitivo, por eso la nomenclatura minus, información básica.
		
		Tipos primitivos para representar numeros enteros, 
		cada uno tiene un rango y un espacio en la memoria para ser procesado
		
		 */
		byte numero2 = 0;
		short numero1 =1;
		int numero = 9;
		long numero3 = 10;
		
		/*
		 *Numeros Decimales
		 */
		
	    double decimal1 = 9.6;
	    float decimal3 = 8.0f;
	    
	    Boolean esMayorEdad = true;
	    boolean esPas = false;
	    
		 /*
		 String = Clase (Objeto), por eso la nomenclatura Upper Camel Case
		 */
		
		String nombre = "Salamander";
		
		//nombre = "1";
		
		System.out.println(nombre.toUpperCase()); 
		
	}
}

class dos{
}
