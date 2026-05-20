import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        for(int day = i;day<=j;day++){
            int temp = day;
            int rev = 0;
            while(temp>0){
                int rem = temp%10;
                rev = rev *10 + rem;
                temp = temp/10;
            }
            int diff = Math.abs(day - rev);
            if(diff % k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}