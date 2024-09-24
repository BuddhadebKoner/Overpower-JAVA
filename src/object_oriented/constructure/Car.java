package object_oriented.constructure;

public class Car {

    int initialFule;
    int speed;
    String name;
    String color;
    float Prise;

    Car(String color, String name) { // argumented default constructor
        initialFule = 100;
        speed = 0;
        this.color = color;
        this.name = name;
        Prise = 1000000;
    }

    Car() { // default constructor
        initialFule = 100;
        speed = 0;
        color = "Black";
        Prise = 1000000;
    }

    public static void main(String[] args) {
        Car Farary = new Car("Red", "Farary"); // Constructor is called here
        System.out.println("Name: " + Farary.name);
        System.out.println("Color: " + Farary.color);
        System.out.println("Initial Fuel: " + Farary.initialFule);
        System.out.println("Speed: " + Farary.speed);
        System.out.println("Prise: " + Farary.Prise);

        Car BMW = new Car(); // Constructor is called here
        System.out.println("Color: " + BMW.color);
        System.out.println("Initial Fuel: " + BMW.initialFule);
        System.out.println("Speed: " + BMW.speed);
        System.out.println("Prise: " + BMW.Prise);
    }
}
