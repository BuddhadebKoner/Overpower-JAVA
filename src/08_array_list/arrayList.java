
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the list size :");
        int arraySize = sc.nextInt();

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter " + i + " number in array list ");
            list.add(sc.nextInt());
        }

        System.out.print("element in the list are :");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}
