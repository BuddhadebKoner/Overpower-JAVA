import java.util.Scanner;

public class multiplication_table {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Enter a number: ");
         int num = input.nextInt();
         printTable(num); // function call
      }
   }

   // function definition
   public static void printTable(int num) { // function with one integer argument
      for (int i = 1; i <= 10; i++) {
         System.out.println(num + " x " + i + " = " + num * i);
      }
   }
}
