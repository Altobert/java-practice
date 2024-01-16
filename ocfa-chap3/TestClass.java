public class TestClass{

    public static void main(String[] args)throws Exception{

        //Salida no lansa excepcion por que es un metodo length maneja un dato primitivo no null
        //si no que cero. 
        System.out.println("Largo argumentos de entrada: "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"]: "+args[i]);
        }

    }
}