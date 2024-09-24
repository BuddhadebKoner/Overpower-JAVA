import java.util.Scanner;
import java.util.Arrays;

public class reverse_array {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      sc.close();

      int[] result = reverse(arr);
      System.out.print("Reversed array: ");
      System.out.println(Arrays.toString(result));
   }


   public static int[] reverse(int[] arr) {
      System.out.print("Initial array: ");
      System.out.println(Arrays.toString(arr));

      // reverse array
      int[] newarr = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         newarr[i] = arr[arr.length - i - 1];
      }

      return newarr;
   }
}
