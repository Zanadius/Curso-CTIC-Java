package es.curso.java.strings;

public class MetodosStrings {
	 public static void main(String[]arg) {
		 
		 //Ambas Strings apuntan hacia el valor "Jose Luis".
		 String nombre1 = "Jose Luis";
		 String nombre2 = nombre1;
		 //No modifica la variable porque no replantea su valor.
		 nombre1.toUpperCase();
		 //En este caso crea un nuevo valor, pero al no tener donde almacenar, queda en el aire.
		 
		 nombre1 = nombre1.toUpperCase();
		//Con esta operación el valor "Jose Luis" deja de ser referenciado por nombre1, y se crea el nuevo valor "JOSE LUIS", 
		 //nombre2 va a mantener el valor "Jose Luis" porque este no se borra de la memoria.
		 System.out.println(nombre1);
		 System.out.println(nombre2);
		 
		 //GARBAGE COLLECTOR = Funciona como un barredor que se activa cada x tiempo y elimina elementos que no estén en uso para liberar espacio.
		 
		 
		 //.charAt nos va a dar el indice que indiquemos en un String.
		 System.out.println(nombre1.charAt(0)); // J
		 
		 
		 //.concat concatena varias Strings
		 System.out.println(nombre1.concat(nombre2)); //JOSE LUISJose Luis
		 
		//Tenemos 6 Strings -i4 conserva "a", -i crea un nuevo objeto "A", i3 conserva los valores i+i2 conserva pero crea 3 objetos.
		 String i = "a";
		 String i2 = "b";
		 String i3 = i+i2;
		 String i4 = i;
		 i = i.toUpperCase();
		 System.out.println(i+i3);
		 
		 
		 //.contains, analiza el string en busqueda de un caracter o cadena, arroja un valor booleano.
		 System.out.println(nombre1.contains("S")); //true
		 
		 
		 //.endsWith, analiza los ultimos caracteres del texto y ve si coinciden, arroja un valor booleano.
		 System.out.println(nombre1.endsWith("uis")); //True
		//.startsWith, analiza los primeros caracteres del texto y ve si coinciden, arroja un valor booleano.
		 System.out.println(nombre1.startsWith("Cos")); //False
		 
		 
		 //.indexOf, busca desde la izquierda  un caracter y arroja el indice de la primera vez que se encuentre ese caracter.
		 System.out.println(nombre1.indexOf("S")); //2
		//.indexOf, busca desde la derecha  un caracter y arroja el indice de la primera vez que se encuentre ese caracter.
		 System.out.println(nombre1.lastIndexOf("S")); //0
		 
		 
		 String var3 = " ";
		 //isBlank, analiza si tiene espacios.
		 System.out.println(var3.isBlank()); //true
		 String var2 = "";
		 //isEmpty, analiza si está vacío.
		 System.out.println(var2.isEmpty()); //true
		 System.out.println(var3.isEmpty()); //false
		 
		 
		 //length, nos dá el numero de indices de un String.
		 System.out.println(nombre1.length()); //9
		 
		 
		 //replace, reemplaza un caracter por otro.
		 System.out.println(nombre1.replace("E","I")); //JOSI LUIS
		 
		 
		 //substring, crea una subcadena a partir del indice X hacia el fin o hacia un indice Y.
		 String var = " Texto de prueba "; 
		 String subvar = var.substring(5,11);
		 System.out.println(subvar); //o de p
		 
		 //trim, quita los espacios ubicados a los bordes, no en medio del String.
		 System.out.println(var.trim()); //Texto de prueba
		 
		 
		 //COMPORTAMIENTO STRINGS VARIABLES=OBJETOS
		 
		 String x1 = "Hola";
		 String x2 = "Hola";
		 String x3 = new String("Hola"); //Se crea otro objeto pero se desperdicia espacio de memoria.

		 System.out.println(x1==x2); //True, Comparten espacio en la memoria.
		 System.out.println(x1.equals(x2)); //True, tienen el mismo valor (contenido).
		 
		 System.out.println(x1==x3); //False, son dos objetos que ocupan espacios diferentes en la memoria, se desperdicia memoria.
		 System.out.println(x1.equals(x3)); //True, tienen el mismo valor (contenido).
		 
		 
		 
	 }
}
