
package snconstructor;

public class Swan{

	//se inicializa en cero, al momemto de declarar la jvm le asigna el valor. 
	int numberEggs;

	public static void main(String ... args){

		//variable del tipo Swan, para almacenar la referencia del objeto
		// new, se esta inicializando y llamando al constructor Swan();
		Swan mother = new Swan();

		mother.numberEggs =1; // se realiza cambio del estado o seteo de un valor a la variable numberEggs

		System.out.println(mother.numberEggs);

	}

}