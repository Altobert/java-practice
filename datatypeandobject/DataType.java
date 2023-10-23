
package datatypeandobject;

public class DataType{

	public static void main(String ...args){

		
		//long maxError = 3123456789;	// DOES NOT COMPILE
		/*
		datatypeandobject/DataType.java:9: error: integer number too large // lo reconoce como integer, ese es el problema.
		long maxError = 3123456789;	// DOES NOT COMPILE
		                ^
		1 error
		*/
		long max = 3123456789L;  // Ahora java sabe que es un long
		System.out.println(max);

		///

		System.out.println(56); 	// 56
		System.out.println(0b11); 	// 3
		System.out.println(017); 	// 15
		System.out.println(0x1F); 	// 31

		// referencias a objetos 

		java.util.Date today; //today es una referencia de tipo Date y solo puede apuntar a un objeto Date
		String greeting; // //greeting es una referencia de tipo String y solo puede apuntar a un objeto String


		today = new java.util.Date();
		System.out.println(today); 	// 31	
		

		greeting = "How are you?";	
		System.out.println(greeting); 	// 31	

		// solo se puede acceder a los objetos anteriores via su referencia. today y greeting respectivamente.


		int value = null; // un tipo primitivo no puede apuntar a un objeto.
						  // los datos primitivos no tienen metodos declarados en ellos.

		String s = null; // hace referencia que actualmente no apunta a ningun objeto de su tipo
		// tipos de referencia pueden ser utilizados para llamar metodos cuando ellos no apuntan a null


		String reference = "hello";
	    int len = reference.length();
		int bad = len.length(); // DOES NOT COMPILE No compila por que la variable primitiva len no tiene metodos.

		// todos los tipos de datos primitivos son en minuscula, por el contrario de las clases que con todas con 
		// mayuscula

		// variable es un pequeño trozo de memoria que almacena un valor. 



	}

}