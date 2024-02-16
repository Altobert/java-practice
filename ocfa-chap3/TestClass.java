public class TestClass{

    private static int contador;
    
    public TestClass(){
        contador++;
        System.out.println("Constructor TestClass: "+contador);
    }

    public static void main(String[] args)throws Exception{

        //Salida no lanza excepcion por que es un metodo length maneja un dato primitivo no null
        //si no que cero. 
        System.out.println("Largo argumentos de entrada: "+args.length);

        for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"]: "+args[i]);
        }

        TestClass t1, t2, t3, t4; 
        //ambos apuntan a la misma referencia
        t1 = t2 = new TestClass();
        System.out.println("t1 "+t1.toString());
        System.out.println("t2 "+t2.toString());
        // se crea otra referencia.
        t3 = new TestClass();
        System.out.println("t3 "+t3.toString());

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}