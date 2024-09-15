// time complexity of this code is O(n^2) because of the nested for loop.
// sorting algo is bubble sort
public class shorting_arrys {
   public static void main(String[] args) {
      int[] numbers = { 10, 22, 3, 4, 5, 10, 7, 8, 9, 10 };
      int temp = 0;
      for (int i = 0; i < numbers.length; i++) {
         for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[i] > numbers[j]) {
               temp = numbers[i];
               numbers[i] = numbers[j];
               numbers[j] = temp;
            }
         }
      }
      System.out.println("The sorted array is: ");
      for (int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[i]);
      }
   }
}
