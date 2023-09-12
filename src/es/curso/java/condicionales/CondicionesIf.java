package es.curso.java.condicionales;

public class CondicionesIf {
	public static void main(String[]args) {
	
	//Condicionales
	int numero = 100;
	boolean esF = false;
	//numero=0 daría error porque no arroja un t/f sino que busca cambiar el valor en la variable
	//Colocar solo numero tampoco funciona porque no arroja un valor t/f
	
	if (numero>100 && numero%2==0 ) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
	
	System.out.println("4");
	System.out.println("5");
	System.out.println("6");
	
	
	if (numero>100 && (esF || numero<200)) {
		System.out.println("a");
		System.out.println("b");
	}else if (numero==100) {
		System.out.println("c");
		System.out.println("d");
	}else {
		System.out.println("e");
		System.out.println("f");
		
		}
	}
}

//declarar variable string llamada mes
//si es enero febrero marzo invierno abril mayo junio primavera 
//julio agosto septiembre verano agosto octubre diciembre otoño
//print estamos en inv-pri-oto-ver
