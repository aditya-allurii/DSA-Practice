import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] order = new int[n];
        int[] time = new int[n];
        for(int i = 0;i<n;i++){
            order[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        int[] delivery = new int[n];
        int[] customers = new int[n];
        for(int i = 0;i<n;i++){
            delivery[i] = order[i] + time[i];
            customers[i] = i+1;
        }
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(delivery[j] > delivery[j+1]) {
                    // Swap in delivery
                    int temp = delivery[j];
                    delivery[j] = delivery[j+1];
                    delivery[j+1] = temp;

                    // Swap in customers (SAME SWAP)
                    int temp2 = customers[j];
                    customers[j] = customers[j+1];
                    customers[j+1] = temp2;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(customers[i] + " ");
        }
    }
}
