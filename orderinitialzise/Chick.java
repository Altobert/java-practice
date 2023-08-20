
package orderinitialzise;

//la inicializacion de blockes ocurre en el orden que se encuentra
//en el archivo

public class Chick{

	//Primer orden de inicializacion
	public String name="Fluffy";

	{System.out.println("setting field (seteando campos)");}

	//metodo especial que construye objetos.
	public Chick(){

		name ="Tinny";

		//segundo orden de inicializacion
		{System.out.println("setting constructor (seteando campo en constructor)");}

	}

	//metodo puede estar en la clase con nombre de archivo.java
	public static void main(String [] arg){

		Chick chick = new Chick();

		//tercer orden de inicializacion
		{System.out.println(chick.name);}

	}
}
