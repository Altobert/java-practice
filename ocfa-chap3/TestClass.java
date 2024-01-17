public class TestClass{

    private static int contador;
    public TestClass(){
        contador++;
        System.out.println("Constructor TestClass: "+contador);
    }

    public static void main(String[] args)throws Exception{

        //Salida no lansa excepcion por que es un metodo length maneja un dato primitivo no null
        //si no que cero. 
        System.out.println("Largo argumentos de entrada: "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"]: "+args[i]);
        }

        TestClass t1, t2, t3, t4; 
        t1 = t2 = new TestClass();
        t3 = new TestClass();

    }
}