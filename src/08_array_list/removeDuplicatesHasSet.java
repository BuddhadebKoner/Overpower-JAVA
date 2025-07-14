
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicatesHasSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.err.println("Enter the set size : ");
        int arraySize = sc.nextInt();
        System.out.println("Enter Duplicate numbers in the set ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            set.add(num);
        }

        System.out.print("element in the set are , no duplicates are there : ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
    }
}
