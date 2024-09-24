public class Last_common_multiple {
   public static void main(String[] args) {
      int num1 = 10;
      int num2 = 15;
      int result = findLCM(num1, num2);
      System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
   }

   public static int findLCM(int num1, int num2) {
      int max = Math.max(num1, num2);

      while (max % num1 != 0 || max % num2 != 0) {
         max++;
      }

      return max;
   }
}
