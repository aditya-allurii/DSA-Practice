import java.util.*;

public class MyClass {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for(int i = 0; i < q; i++) {

            int[] arr = new int[3];

            for(int j = 0; j < 3; j++) {
                arr[j] = in.nextInt();
            }

            int catA = Math.abs(arr[2] - arr[0]);
            int catB = Math.abs(arr[2] - arr[1]);

            if(catA < catB) {
                System.out.println("Cat A");
            }
            else if(catA > catB) {
                System.out.println("Cat B");
            }
            else {
                System.out.println("Mouse C");
            }
        }
    }
}