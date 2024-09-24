import java.util.Scanner;

public class temprature_converter {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter temprature in Fahrenheit: ");
      double fahrenheit = input.nextDouble();
      input.close();
      double celsius = (fahrenheit - 32) * 5 / 9;
      System.out.println("Temprature in Celsius: " + celsius);
   }
}
