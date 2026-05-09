import java.util.*;

public class MyClass {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        long tot = 0;

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < 5; i++) {

            tot = tot + arr[i];

            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println((tot - max) + " " + (tot - min));
    }
}