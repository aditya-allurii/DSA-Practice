import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int last = arr[n - 1];
        int i = n - 2;

        while (i >= 0 && arr[i] > last) {
            arr[i + 1] = arr[i];
            printArray(arr);  // Print after each shift
            i--;
        }

        arr[i + 1] = last;
        printArray(arr);  // Print after insertion
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}