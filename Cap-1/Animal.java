
//keyword public: la clase puede ser usada por otras clases
//class me permite definir una clase de nombre animal

public class Animal{

	// tipo y nombre de la variable
	String name;

	//un metodo es una operacion que puede ser llamada desde otra clase
	// declaracion de un metodo, y no requiere paso de parametro
	public String getName(){
		return name;
	}

	//un metodo es una operacion que puede ser llamada desde otra clase
	//public significa que puede ser llamada desde otras clases : por medio de los imports
	//void significa que no va a retornar nada.
	// declaracion de un metodo (firma de un metodo), y que requiere paso de parametro
	public void setName(String newName){
		this.name = newName;
	}

	//Esta es la firma de un metodo o declaracion completa.
	//public int numberVisitor(int month)
	
}