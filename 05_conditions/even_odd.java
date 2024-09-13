// Program to check if a number is even or odd.
import java.util.Scanner;

public class even_odd {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();

      if (number % 2 == 0) {
         System.out.println("The number is even.");
      } else {
         System.out.println("The number is odd.");
      }
   }
}
