
package datatypeandobject;

public class DataType{

	public static void main(String ...args){

		//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
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

	}

}