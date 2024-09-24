import java.util.Scanner;

public class numberOccurrence {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] numbers = { 10, 22, 3, 4, 5, 10, 7, 8, 9, 10 };
      System.out.println("Enter the number to find the occurrence: ");
      int num = sc.nextInt();
      sc.close();

      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] == num) {
            count++;
         }
      }
      System.out.println("The number " + num + " occurs " + count + " times in the array.");

   }
}
