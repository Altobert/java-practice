//carpeta se encuentra en packageb
package packageb;

//se importa ClassA
import packagea.ClassA;
import java.util.ArrayList; 
import java.util.List; 


public class ClassB{

   //lo que hace el main es cambiar el estado del programa de 1 hacia cero. 
   //quien tiene el metodo main debe ser la clase que coincida con el nombre del archivo.
   public static void main (String [] args){
     ClassA a = new ClassA();
     ClassB b = new ClassB();
          
     System.out.println("Got it - esto es lo que se quiere lograr | ");

     //Se inicializa objeto arraylist
     ArrayList<String> myList = new ArrayList<String>(); 
     //se agrega un elemento
     myList.add("primer elemento");
     //finalmente se entrega el objeto arraylist al metodo "method"
     b.method(myList);
   } 


   /**
    *comentarios tipo java doc 
    */
   public void method(ArrayList list){

      if(list.isEmpty()){
          System.out.println("e");
      }
      System.out.println("n");

   }

}