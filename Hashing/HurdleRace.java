import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        if(max > k){
            System.out.println(max-k);
        }else {
            System.out.println(0);
        }

    }
}