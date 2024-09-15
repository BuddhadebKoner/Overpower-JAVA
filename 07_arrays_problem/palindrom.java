import java.util.Scanner;

public class palindrom {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements in array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements: ");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      sc.close();
      System.out.print("Initial array: ");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();

      boolean result = isPalindrom(arr);
      if (result) {
         System.out.println("The array is a palindrom.");
      } else {
         System.out.println("The array is not a palindrom.");
      }
   }
   
   public static boolean isPalindrom(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n / 2; i++) {
         if (arr[i] != arr[n - i - 1]) {
            return false;
         }
      }
      return true;
   }
}
