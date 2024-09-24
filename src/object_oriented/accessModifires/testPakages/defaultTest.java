package object_oriented.accessModifires.testPakages;

import object_oriented.accessModifires.buddhaCar.buddhaCar;

public class    defaultTest {
    public static void main(String[] args){
        buddhaCar car = new buddhaCar("Yellow", 5, 700, "Maclaren");
        System.out.println(car);
        // cant access costOFcar as it is default
        // System.out.println("Cost of car: " + car.costOFcar);
    }
}
