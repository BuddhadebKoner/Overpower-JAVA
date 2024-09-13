import java.util.Scanner;

public class userinput {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Please Enter your name : ");
      String name = input.nextLine();
      System.out.println("Good Morning " + name);
      System.out.print("Enter Your Age : ");
      Integer age = input.nextInt();
      System.out.println("Your Age is : " + age);
   }
}
