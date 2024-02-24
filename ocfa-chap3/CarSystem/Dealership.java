import java.util.ArrayList;
import java.util.List;

public class Dealership{
    List<Car> cars = new ArrayList<>();
    
    void addCar(){
        Car car = new Car();
        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2015;
        cars.add(car);
    }

    void removeCar(){
        cars.remove(0);
    }

    void printCar(){
        for(Car car: cars){
            System.out.println("Make: "+car.make);
            System.out.println("Model: "+car.model);
            System.out.println("Year: "+car.year);
        }
    }

    

}