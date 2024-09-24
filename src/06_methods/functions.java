public class functions {
   public static void main(String[] args) {
      int a = 10;
      int b = 20;
      int result = add(a, b); // function call
      System.out.println("The sum is: " + result);
   }

   // function definition
   public static int add(int num1, int num2) { // function with two integer arguments
      return num1 + num2; // return integer value
   }
}
