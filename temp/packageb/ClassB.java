//carpeta se encuentra en packageb
package packageb;

//se importa ClassA
import packagea.ClassA;


public class ClassB{

   //lo que hace el main es cambiar el estado del programa de 1 hacia cero. 
   //quien tiene el metodo main debe ser la clase que coincida con el nombre del archivo.
   public static void main (String [] args){
     ClassA a = new ClassA();
     System.out.println("Got it - esto es lo que se quiere lograr | ");
   } 

}