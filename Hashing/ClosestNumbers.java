import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0;i<n-1;i++){
            int diff = arr[i+1] - arr[i];
            mindiff = Math.min(mindiff,diff);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<n-1;i++){
            int diff = arr[i+1] - arr[i];
            if(diff == mindiff){
                res.add(arr[i]);
                res.add(arr[i+1]);
            }
        }
        for(int num:res){
            System.out.print(num+" ");
        }

    }
}
