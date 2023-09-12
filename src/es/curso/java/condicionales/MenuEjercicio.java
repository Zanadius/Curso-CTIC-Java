package es.curso.java.condicionales;

import java.util.Scanner;

public class MenuEjercicio {
	public static void main(String[]args) {
		
		String menu = "1. Opción: Estaciones\n2. Opción\n3. Opción\n4. Opción\n5. Salir";
		System.out.println(menu);
		System.out.println("Selecciona una opción:");
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		// Esta opción es necesaria para cerrar el buffer del scanner.
		scan.nextLine();
		
		switch (opcion) {
			case 1: 
				System.out.println("Introduce una estación:");
                Scanner scan1 = new Scanner(System.in);
                // Consumir el salto de línea pendiente en el búfer del Scanner.
                
                String meses = "";
                String opcion1 = scan1.nextLine();

                opcion1 = opcion1.toLowerCase();
				
				//Es necesario cerrar los Switchs {} y usar los break.
				switch (opcion1) {
					case "invierno": meses = "Enero, Febrero, Marzo";break;
					
					case "primavera":
						meses = "Abril, Mayo, Junio";break;
					case "verano":
						meses = "Julio, Agosto, Septiembre";break;
					case "otoño": 
						meses = "Octubre, Noviembre, Diciembre";break;
					}
				// Puede usarse un if dentro de un Switch
					if (!meses.equals("")){
						System.out.println("Estos son los meses de la estación: " + meses); break;
					}else {
						System.err.println("Mes no valido"); break;
				}
				
			case 2: System.out.println("Has elegido la opción" + opcion); break;
			case 3: System.out.println("Has elegido la opción" + opcion); break;
			case 4: System.out.println("Has elegido la opción" + opcion); break;
			case 5: System.out.println("Adios"); break;
			case 6: System.out.println("Opción incorrecta"); break;
								
		}
	}
}
