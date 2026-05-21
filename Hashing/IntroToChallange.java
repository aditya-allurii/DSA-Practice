import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        int cost = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(cost + prices[i] <= k){
                cost +=prices[i];
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}