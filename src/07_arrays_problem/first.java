
import java.util.Scanner;

public class first {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter array length");
            int arraySize = sc.nextInt();

            // declear a array
            int[] arr = new int[arraySize];

            // take user input the array
            System.out.println("Enter array elements :");
            for (int i = 0; i < arraySize; i++) {
                arr[i] = sc.nextInt();
            }

            // print array
            for (int i = 0; i < arraySize; i++) {
                System.out.printf(" (" + (i + 1) + ")Element : " + arr[i] + " ");
                //  (1)Element : 23  (2)Element : 46  (3)Element : 75  (4)Element : 86
            }
        } catch (Exception e) {
            System.err.println("Somtging wrong");
        }

        sc.close();
    }
}
