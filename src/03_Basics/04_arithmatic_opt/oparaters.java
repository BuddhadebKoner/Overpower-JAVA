import java.util.Scanner;

public class oparaters {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("The work is sum of 3 number , so what will be the file name ?");
      System.out.print("Enter First number : ");
      int firstNum = input.nextInt();
      System.out.print("Enter Secound number : ");
      int secondNum = input.nextInt();
      System.out.print("Enter Third number : ");
      int thirdNum = input.nextInt();
      int threeSum = firstNum + secondNum + thirdNum;
      input.close();

      System.out.println("The sum of three number is : " + threeSum);
   }
}
