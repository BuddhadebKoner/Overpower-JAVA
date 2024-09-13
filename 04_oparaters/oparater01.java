import java.util.Scanner;

public class oparater01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a, b, sum, sub, mul, div, mod;
      System.out.print("Enter two numbers: ");
      a = input.nextInt();
      b = input.nextInt();
      sum = a + b;
      sub = a - b;
      mul = a * b;
      div = a / b;
      mod = a % b;
      System.out.print("Sum: " + sum + "\nSub: " + sub + "\nMul: " + mul + "\nDiv: " + div + "\nMod: " + mod);
   }
}
