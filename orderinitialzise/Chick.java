
package orderinitialzise;

public class Chick{

	//Primer orden de inicializacion
	public String name="Fluffy";

	{System.out.println("setting field");}

	//metodo especial que construye objetos.
	public Chick(){

		name ="Tinny";

		//segundo orden de inicializacion
		{System.out.println("setting constructor");}

	}

	public static void main(String [] arg){

		Chick chick = new Chick();

		//tercer orden de inicializacion
		{System.out.println(chick.name);}

	}
}
