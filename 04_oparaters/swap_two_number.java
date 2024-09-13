import java.util.Scanner;

public class swap_two_number {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Two number : ");
      int firstNum = input.nextInt();
      int secondNum = input.nextInt();
      System.out.println("Before Swaping Two numbers are : FirstNum = " + firstNum + " SecondNum = " + secondNum);
      int thirdNum = firstNum;
      firstNum = secondNum;
      secondNum = thirdNum;
      System.out.println("After Swaping Two numbers are : FirstNum = " + firstNum + " SecondNum = " + secondNum);
   }
}
