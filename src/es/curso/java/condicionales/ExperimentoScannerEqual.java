package es.curso.java.condicionales;
import java.util.Scanner;
public class ExperimentoScannerEqual {

	public class TareaCondicionales {
		
		public static void main(String[] arg) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Por favor, ingresa un mes: ");
			
			String mes = scanner.nextLine();
			
			
			String salida ="";
			
			scanner.close();
			
			if (mes.equals("enero") || mes.equals("febrero")) {
				salida = "invierno";
			
			} else if (mes.equals("marzo") || mes.equals("abril") || mes.equals("mayo")) {
				salida = "primavera";
				
			} else if (mes.equals("junio") || mes.equals("julio")) {
				salida = "verano";
				
			} else if (mes.equals("agosto")) {
				salida = "vacaciones verano";
				
			} else if (mes.equals("septiembre") || mes.equals("octubre") || mes.equals("noviembre")) {
				salida = "otoño";
				
			} else if (mes.equals("diciembre")) {
				salida = "vacaciones navidad";
				
			} else {
				salida = "no aplica";
			}
			
			System.out.println(salida);
		}
	}
}