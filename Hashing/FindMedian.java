import java.util.Scanner;
import java.util.Arrays;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        System.out.println(arr[mid]);
    }
}
