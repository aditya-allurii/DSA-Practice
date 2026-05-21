import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for(int i =0 ;i<n;i++){
            bill[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int tot = 0;
        for(int i = 0;i<n;i++){
            tot = tot + bill[i];
        }
        int shared = tot - bill[k];
        int actual = shared / 2;
        if(actual == b){
            System.out.println("Bon Appetit");
        }else if(actual!=b) {
            System.out.println(b - actual);
        }
    }
}
