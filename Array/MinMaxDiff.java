package Array;
import java.util.*;

public class MinMaxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Array Size Must be greater then zero");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        } 

        int diff = max - min;

        System.out.println("Diffrence of biggest and smallest is: " + diff);

    }
}
