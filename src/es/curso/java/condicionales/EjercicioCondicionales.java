package es.curso.java.condicionales;

public class EjercicioCondicionales {
	
	public static void main(String[]args) {
	
	String mes = "diciembre";
	
	if (mes=="enero" || mes=="febrero" || mes=="marzo") {
		System.out.println("Invierno");
		
	}else if (mes == "abril"||mes=="mayo"||mes=="junio"){
		System.out.println("Primavera");
			
	}else if (mes == "julio"||mes=="agosto"||mes=="septiembre"){
		System.out.println("verano");
		
	}else if (mes=="agosto"){
		System.out.println("vacaciones de verano");
		
	}else if (mes == "octubre"||mes=="noviembre"){
		System.out.println("invierto");
		
	}else if (mes=="diciembre"){
		System.out.println("vacaciones de invierno");
		
	}else
		System.out.println("error");
		}
	
	}