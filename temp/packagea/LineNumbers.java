
//Por supuesto que clase se ejecutara con sus opciones, por que 
//cuenta con sus import, de lo contrario tiraria errores

package packagea;
import java.util.ArrayList; 
import java.util.List; 

public class LineNumbers{

	public void method(ArrayList list){

		if(list.isEmpty()){

			System.out.println("e");

		}
		System.out.println("n");

	}

	//java, el intreprete lo entiende como un arreglo de strings
	public static void main(String ... args){

		//LineNumbers ln = new LineNumbers();

		System.out.println("LineNumbers");

	}
	
}