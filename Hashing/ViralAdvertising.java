import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shared = 5;
        int cummulative = 0;
        for(int i = 0;i<n;i++){
            int liked = shared / 2;
            cummulative = cummulative + liked;
            shared = liked * 3;
        }
        System.out.println(cummulative);
    }
}