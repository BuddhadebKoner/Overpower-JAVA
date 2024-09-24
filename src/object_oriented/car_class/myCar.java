package object_oriented.car_class;

public class myCar {
   // Attributes
   // int numOfwheels;
   // String color;
   // float maxSpeed;
   float currentFule;

   // Constructor
   public void drive() {
      System.out.println("Car is starting.....");
      currentFule--;
   }

   public void addFule(float currentFule) {
      this.currentFule += currentFule; // this.currentFule is the attribute of the class
   }

   public float getFule() {
      return currentFule;
   }
}
