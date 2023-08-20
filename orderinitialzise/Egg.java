package orderinitialzise;

public class Egg {
    
    public Egg(){
        number = 5; 
        System.out.println(number);
    }

    public static void main(String [] args){

        Egg eggNumber = new Egg();
        System.out.println(eggNumber.number);
    }

    private int number = 3; 

    //primera inicializacion
    {
        number = 4;
        System.out.println(number);
    }
}
