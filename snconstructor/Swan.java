
package snconstructor;

public class Swan{

	//se inicializa en cero, al momemto de declarar la jvm le asigna el valor. 
	int numberEggs;

	//tambien se pueden leer y updatear variables directamente desde donde se declaran
	//el signo + concatena
	String first = "Theodore "; //se agrega otro String al final
	String last = "Moose";
	String full = first + last;

	public static void main(String ... args){

		// variable del tipo Swan, para almacenar la referencia del objeto
		// new, se esta inicializando y llamando al constructor Swan();
		Swan mother = new Swan();

		mother.numberEggs =1; // se realiza cambio del estado o seteo de un valor a la variable numberEggs

		System.out.println(mother.numberEggs);

		System.out.println(mother.full);

	}

}