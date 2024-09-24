package object_oriented.accessModifires.buddhaCar;

public class accessTest {
    public static void main(String[] args) {
        buddhaCar car = new buddhaCar();
        car.color = "Red";
        car.currentFule = 40;
        car.maxSpeed = 200;
        // private attribute can't be accessed from outside the package
        // System.out.println("Car brand: " + car.brand);
        System.out.println(car);
        buddhaCar car2 = new buddhaCar("Blue", 50, 250, "BMW");
        System.out.println(car2);
       // we can access  car.costOFcar
        System.out.println("Cost of car: " + car2.costOFcar);
    }
}
