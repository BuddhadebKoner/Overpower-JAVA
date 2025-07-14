
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class fiindMaxNumber {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the list size :");
        int arraySize = sc.nextInt();

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter " + i + " number in array list ");
            list.add(sc.nextInt());
        }

        int maxNumber = Collections.max(list);
        System.out.print("Maximum number is the array list : " + maxNumber);

        sc.close();
    }
}
