
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class margeTwoSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.err.println("Enter the set1 size : ");
        int arraySize1 = sc.nextInt();
        System.err.println("Enter the set2 size : ");
        int arraySize2 = sc.nextInt();

        System.out.println("Enter set1 elements : ");
        for (int i = 0; i < arraySize1; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            set1.add(num);
        }

        System.out.println("Enter set2 elements : ");
        for (int i = 0; i < arraySize2; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            set2.add(num);
        }

        set1.addAll(set2);
        System.out.println("Set After Marging : " + set1);
    }
}

// Enter the set1 size : 
// 3
// Enter the set2 size : 
// 2
// Enter set1 elements : 
// Enter number 1: 12
// Enter number 2: 56
// Enter number 3: 77
// Enter set2 elements : 
// Enter number 1: 23
// Enter number 2: 98
// Set After Marging : [98, 23, 56, 12, 77]
