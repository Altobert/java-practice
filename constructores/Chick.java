
package constructores;

//Ejemplo para demostrar el uso de constructores

public class Chick{

	//Metodo especial que crea objetos, es la funcion del constructor en java.
	//Metodo crea un objeto del tipo Chick.
	//Es n metodo que no retorna nada, pero que crea objetos.

	//El proposito de un constructor es tambien inicializar campos o atributos
	public Chick(){

		System.out.println("dentro del constructor de la clase chic");

	}

	// public void Chick() { } // NOT A CONSTRUCTOR

	//Para poder realizar la prueba de construyo un main, de lo constrario no se podria ejecutar la clase
	public static void main(String [] args){

		//Se invoca al constructor al parecer :)
		new Chick();

	}
	
}