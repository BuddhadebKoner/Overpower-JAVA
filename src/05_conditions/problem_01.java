// determine the number is positive or negative or zero

import java.util.Scanner;

public class problem_01 {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Enter a number: ");
         int number = input.nextInt();

         if (number > 0) {
            System.out.println("The number is positive.");
         } else if (number < 0) {
            System.out.println("The number is negative.");
         } else {
            System.out.println("The number is zero.");
         }
      }
   }
}
