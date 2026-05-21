import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }

        k = k % n;

        // right rotation
        rotate(arr, 0, n - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);

        // answer queries
        for (int i = 0; i < q; i++) {
            System.out.println(arr[queries[i]]);
        }
    }

    public static void rotate(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}