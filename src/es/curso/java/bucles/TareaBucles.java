package es.curso.java.bucles;

import java.util.Scanner;

public class TareaBucles {
	public static void main (String[]args) {

		Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Multiplos");
            System.out.println("2. Tenistas");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Cuadrado");
            System.out.println("5. Triangulo");
            System.out.println("6. Hashtag");
            System.out.println("7. Salir");
            System.out.println("-----------------");
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();
            
            switch (opcion) {
            
                case 1: //Multiplos
                	
                	System.out.println("Introduzca 10 numeros");
        			int CantidadNumeros = 10;
        			int Multiplos3 = 0;
        			int Multiplos5 = 0;
        			int NoMultiplo = 0;
        			int MultiploAmbos = 0;
        			
        			for (int num = 1; num <= CantidadNumeros ; num++ ) {
        				System.out.println("Introduce un numero:");
        				int SolicitudDigito = scan.nextInt();
        					if (SolicitudDigito%3==0 && SolicitudDigito%5==0){
        						MultiploAmbos++;
        						Multiplos5++;
        						Multiplos3++;
        					}	else if (SolicitudDigito%3==0) {
        							Multiplos3++;
        					}	else if (SolicitudDigito%5==0) {
        							Multiplos5++;
        					}	else {
        							NoMultiplo++;
        						}
        			}
        			System.out.println("De la lista de numeros que ingresaste " + Multiplos3 + " son multiplos de 3, \n"
        					+ Multiplos5 + " son multiplos de 5;  hay " + NoMultiplo + " que no son multiplos de 3 o 5 y\n"
        					+ MultiploAmbos + " que son multiplos de ambos." );
        			
                case 2: //Tenistas
                	
                	System.out.println("Introduzca el numero de participantes en la competencia:");
            		int Participantes = scan.nextInt();
            		int ParticipantesTop10 = 0;
            		
            		for (int num = 1; num <= Participantes ; num++ ) {
            			System.out.println("Introduce la posición del tenista #" + num);
            			int Posicion = scan.nextInt();
            				if (Posicion <= 10) {
            					ParticipantesTop10++;
            				}
            		}
            		System.out.println("Hay " + ParticipantesTop10 + " en el top 10.");
            		
                case 3: //Tabla de multiplicar
                	
                	System.out.println("Introduzca el numero para generar la tabla de multiplicación: ");
        			int AMultiplicar = scan.nextInt();
        			
        			for (int num = 1; num <=10  ; num++ ) {
        				System.out.println(AMultiplicar + "x" + num + "=" + AMultiplicar*num);
        			}
        			for (int i=1;i<=10;i++) {
        				for (int j=0; j<=10; j++){
        				System.out.println(i + "x" + j );
        				}	
        			}
                case 4: //Cuadrado
                	
                    System.out.println("¡Hasta luego!");
                    break;
                    
                case 5: //Triangulo
                	
                    System.out.println("¡Hasta luego!");
                    break;
                    
                case 6: //Hashtag
                	
                    System.out.println("¡Hasta luego!");
                    break;
                case 7: //Hashtag
                	
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 7);
        
        scan.close();
    }
}