import java.util.Scanner;

public class SumAverage {
   public static void main(String[] args) {
      int[] numbers = new int[7];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 7 elements in the array: ");
      for (int i = 0; i < 7; i++) {
         System.out.println("Enter the element: ");
         numbers[i] = sc.nextInt();
      }
      sc.close();

      System.out.println("The elements in the array are: ");
      for (int i = 0; i < 7; i++) {
         System.out.println(numbers[i]);
      }

      int sum = 0;
      double average;
      
      for(int i = 0; i < numbers.length ; i++) {
         sum += numbers[i];
      }
      average = (double)sum / numbers.length;
      System.out.println("Sum = " + sum);
      System.out.println("Average = " + average);
   }
}
