package es.curso.java.introduccion;

public class Operadores {
	public static void main(String[]args) {
	//Aritméticos + - * /
		int num = 0;
		num++;

		System.out.println(num++);
		System.out.println(num);
		//Toma la variable original y le suma un 1
		//++num modifica la variable y luego la usa
		
		num = num+5;
		num+=5;
		System.out.println(num+=5);
		//Ambas operaciones significan lo mismo
		
		System.out.println(num%2==0);
	//Operador mod y Booleano % true-false
		// num%2==0 > Da el resto de una división y posterior compara ese resultado 
		// con si es igual que un 0, pregunta boooleana
		
		
	//Condicionales  >= <= == < >
		//Devuelven un booleano siempre
		boolean esMayor = 7>(num%2);
			
	//Lógicos &&(and) ||(or) filtro muro | (or) pero evalua lo siguiente aunque se cumpla la primer condición. 
		int num2 = 8;
		System.out.println(num2>=7 && num2>2 || num2<3);
		//Pasa la variable por filtro que definen si es true o false,
		//Como los dos primeros filtros definieron en True no es necesario pasar al ultimo.
		
	
		
	}
}