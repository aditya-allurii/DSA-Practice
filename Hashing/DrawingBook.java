import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int front = p/2;
        int back = n/2 - p/2;
        int ans = Math.min(front,back);
        System.out.println(ans);
    }
}