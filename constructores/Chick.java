
package constructores;

//Ejemplo para demostrar el uso de constructores

public class Chick{

	//Metodo especial que devuelve objetos e inicializa variables.
	public Chick(){

		System.out.println("dentro del constructor de la clase chic");

	}

	//Para poder realizar la prueba de construyo un main, de lo constrario no se podria ejecutar la clase
	public static void main(String [] args){

		//Se invoca al constructor al parecer :)
		new Chick();

	}
	
}