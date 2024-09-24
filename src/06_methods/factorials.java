import java.util.Scanner;

public class factorials {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Enter number , I will give you factorial of that number: ");
         int num = input.nextInt();
         int result = calculateFactorial(num);
         System.out.println("Factorial of " + num + " is : " + result);
      }
   }

   public static int calculateFactorial(int num) {
      // recursive function
      if (num == 0) {
         return 1;
      }
      int result = num * calculateFactorial(num - 1);

      return result;
   }
}
