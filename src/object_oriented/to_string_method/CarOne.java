package object_oriented.to_string_method;

public class CarOne {
   int noOfWheels;
   int noOfDoors;
   int maxSpeed;
   String name;
   String modelNumber;
   String company;

   // constructor
   public CarOne(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
      this.noOfWheels = noOfWheels;
      this.noOfDoors = noOfDoors;
      this.maxSpeed = maxSpeed;
      this.name = name;
      this.modelNumber = modelNumber;
      this.company = company;
   }

   // overriding the toString() method
   // @Override
   // public String toString() {
   // return "Car [noOfWheels = " + noOfWheels + ", noOfDoors = " + noOfDoors + ",
   // maxSpeed = " + maxSpeed + ", name = "
   // + name
   // + ", modelNumber = " + modelNumber + ", company = " + company + "]";
   // }

   // you can do this using string StringBuilder
   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Car [noOfWheels = ").append(noOfWheels).append(", noOfDoors = ").append(noOfDoors)
            .append(", maxSpeed = ").append(maxSpeed).append(", name = ").append(name).append(", modelNumber = ")
            .append(modelNumber).append(", company = ").append(company).append("]");
      return sb.toString();
   }

   public static void main(String[] args) {
      CarOne car = new CarOne(4, 4, 200, "Audi", "A6", "Audi");
      // to string by default is class@hashcode in the absence of overriding
      // System.out.println(car.toString());
      // overriding the toString() method
      System.out.println(car);
   }
}
