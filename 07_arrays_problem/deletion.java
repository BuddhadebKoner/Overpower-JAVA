import java.util.Scanner;

public class deletion {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] numbers = { 10, 22, 3, 4, 5, 10, 7, 8, 9, 10 };
      System.out.println("The original array is: ");
      System.out.print("{ ");
      for (int i = 0; i < numbers.length; i++) {
         System.out.print(" " + numbers[i]);
         System.out.print(",");
      }
      System.out.println(" }");
      System.out.println("Enter the element position of the array that will be deleted : ");
      int index = sc.nextInt();
      sc.close();

      int[] newarray = printArray(numbers, index - 1);
      System.out.println("The new array after deletion is: ");
      System.out.print("{ ");
      for (int i = 0; i < newarray.length; i++) {
         System.out.print(" " + newarray[i]);
         System.out.print(",");
      }
      System.out.println(" }");
   }

   public static int[] printArray(int[] numbers, int index) {
      int[] newNumbers = new int[numbers.length - 1];

      for (int i = 0, k = 0; i < numbers.length; i++) {
         if (i == index) {
            continue;
         }
         newNumbers[k++] = numbers[i];
      }

      return newNumbers;
   }
}
