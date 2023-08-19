package orderinitialzise;

public class Egg {
    
    public Egg(){
        number = 5; 
    }

    public static void main(String [] args){

        Egg eggNumber = new Egg();
        System.out.println(eggNumber.number);
    }

    private int number = 3;

    {number = 4;}
}
