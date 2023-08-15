

package constructores;

public class Chicken{

	//atributo de clase es by default
	int numberEggs=0;

	//atributo de clase es by default
	String name;

	public Chicken(){
		name="Ducke";
	}


	public static void main(String ... args){

		System.out.println("Se inicializa objeto chicken para acceder a las variables");
		Chicken chicken = new Chicken();
		
		//valor inicializado al momento de declarar el atributo de clase
		System.out.println(" Numero huevos "+chicken.numberEggs);

		//valor inicializado dentro del constructor
		System.out.println(" Numero huevos "+chicken.name);
	}
}
