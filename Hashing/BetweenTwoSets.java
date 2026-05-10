import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            b[i] = sc.nextInt();
        }
        int count = 0;
        //find x
        for(int x = 1;x<=100;x++){
            boolean yes = true;
            for(int i = 0;i<n;i++){
                if(x % a[i] != 0){
                    yes =false;
                }
            }
            for(int i = 0;i<m;i++){
                if(b[i] % x!=0){
                    yes = false;
                }
            }
            if(yes){
                count++;
            }
        }
        System.out.println(count);
    }
}