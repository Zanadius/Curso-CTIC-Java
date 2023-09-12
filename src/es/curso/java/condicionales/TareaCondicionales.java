package es.curso.java.condicionales;

public class TareaCondicionales {
	
	public static void main(String[]arg) {

		
		String mes = "diciembre";
		
		String salida ="";
		
		if (mes=="enero"||mes=="febrero") {
		salida = "invierno";
		
		}else if (mes=="marzo"||mes=="abril"||mes=="mayo") {
			salida = "primavera";
			
		}else if (mes=="junio"||mes=="julio") {
			salida = "verano";
			
		}else if (mes=="agosto") {
			salida = "vacaciones verano";
			
		}else if (mes=="septiembre"||mes=="octubre"||mes=="noviembre") {
			salida = "otoño";
			
		}else if (mes=="diciembre") {
			salida = "vacaciones navidad";
			
		}else
			salida = "error";
		
	System.out.println(salida);
	}
}