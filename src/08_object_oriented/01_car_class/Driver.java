public class Driver {
   public static void main(String[] args) {
      myCar car = new myCar();
      car.currentFule = 40;
      car.drive();
      System.out.println("Current fule: " + car.getFule());
   }
}