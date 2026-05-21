import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;
        int currentPrice = p;

        while (s >= currentPrice) {

            s  -= currentPrice;           // Buy the game
            count++;                     // Increment game count
            currentPrice = Math.max(currentPrice - d, m);
        }

        System.out.println(count);
    }
}