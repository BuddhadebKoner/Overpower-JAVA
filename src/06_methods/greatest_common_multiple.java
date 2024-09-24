public class greatest_common_multiple {
   public static void main(String[] args) {
      int num1 = 12, num2 = 18;
      int result = calculateGCD(num1, num2);
      System.out.println("Greatest common divisor of " + num1 + " and " + num2 + " is : " + result);
   }

   public static int calculateGCD(int num1, int num2) {
      if (num2 == 0) {
         return num1;
      }
      return calculateGCD(num2, num1 % num2);
   }   
}
