import java.util.Random;

public class ImportExample{
    public static void main(String[] args) {
        Random r = new Random();        
        int i=10;        
        do{
            //do while imprime
            System.out.println(r.nextInt(100));            
            i--;
        }while(i>=0);
    }
}