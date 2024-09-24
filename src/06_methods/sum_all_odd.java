import java.util.Scanner;

public class sum_all_odd {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         System.out.print("Enter number , i will give you sum of all odd numbers till that number: ");
         int num = input.nextInt();
         int result = sumOdd(num);
         System.out.println("Sum of all odd numbers till " + num + " is : " + result);
      }
   }

   public static int sumOdd(int num) {
      int result = 0;
      for (int i = 1; i <= num; i++) {
         if (i % 2 != 0) {
            result += i;
         }
      }

      return result;
   }
}