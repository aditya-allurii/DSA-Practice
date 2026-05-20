// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr);

//         System.out.println(n);

//         for(int i = 1; i < n; i++) {

//             if(arr[i] != arr[i - 1]) {

//                 System.out.println(n - i);
//             }
//         }
//     }
// }


import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        while(true){

            int min = Integer.MAX_VALUE;
            int count = 0;

            for(int i = 0; i < n; i++){

                if(arr[i] > 0){

                    count++;

                    min = Math.min(min, arr[i]);
                }
            }

            if(count == 0){
                break;
            }

            System.out.println(count);

            for(int i = 0; i < n; i++){

                if(arr[i] > 0){

                    arr[i] = arr[i] - min;
                }
            }
        }
    }
}