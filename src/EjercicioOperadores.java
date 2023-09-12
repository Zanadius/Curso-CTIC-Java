
public class EjercicioOperadores {
	
	public static void main(String[]args) {
		
	
//Hacer dos variables string nombre y apellidos y otra variable de tipo entero año de nacimiento y si nació en año par boolean
	
	String nombreapellidos = "Carlos Bolaños";
	int anonacimiento = 1996;
	int edad = 2023-anonacimiento;
	boolean anopar = anonacimiento%2==0;
	
	
	System.out.println("El usuario se llama"+" "+nombreapellidos+". "+"Nació en el año"+" "+anonacimiento+" "+"y tiene"+" "+ edad +" "+"años"+" "+"¿Nació en un año par?"+" "+(anonacimiento%2==0));
	}		
}
