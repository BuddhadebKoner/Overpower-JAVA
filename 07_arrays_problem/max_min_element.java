public class max_min_element {
   public static void main(String[] args) {
      int[] numbers = { 10, 22, 3, 4, 5, 10, 7, 8, 9, 10 };
      int max = numbers[0];
      int min = numbers[0];

      for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] > max) {
            max = numbers[i];
         }
         if (numbers[i] < min) {
            min = numbers[i];
         }
      }

      System.out.println("The maximum element in the array is: " + max);
      System.out.println("The minimum element in the array is: " + min);
   }
}
