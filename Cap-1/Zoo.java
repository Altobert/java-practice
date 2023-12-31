
// Para que se ejecute correctamente, el nombre de la clase
// que tiene el metodo main, debe coincidir con el nombre del archivo, de lo contrario no se ejecutara.
public class Zoo{

	/*
		El metodo main es el intermediario entre el inicio de un proceso java administrado por la JVM
		y el codigo del programador que se comienza a ejecutar.
		Son argumentos que vienen por linea de comandos args[0], args[1], args[2]
	*/
	/*		
		Un metodo main no statico seria como un metodo invisible desde el punto de vista de la 
		JVM.
	*/
	/*
		Un metodo static debe ser llamado solamente con el nombre de la clase. Zoo.main();
	*/
	/*
		Un metodo public indica el nivel de exposicion del metodo. Es decir, estara exppuesto 
		para todo el programa.
	*/
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}