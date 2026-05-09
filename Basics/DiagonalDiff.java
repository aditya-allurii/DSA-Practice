import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyClass {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int left_sum = 0;
        int right_sum = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(i == j){
                    left_sum+=arr[i][j];
                }

            }
        }
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(i+j == arr.length-1){
                    right_sum+=arr[i][j];
                }

            }
        }
        int diff = Math.abs(left_sum - right_sum);
        System.out.println(diff);
    }
}