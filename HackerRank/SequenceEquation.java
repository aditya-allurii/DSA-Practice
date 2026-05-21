import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = sc.nextInt();
        }
        for(int x = 1;x<=n;x++){
            int pos1 = 0;
            int pos2 = 0;
            for(int i = 0;i<n;i++){
                if(p[i] == x){
                    pos1 = i+1;
                }
            }
            for(int i = 0;i<n;i++){
                if(p[i] == pos1){
                    pos2 = i+1;
                }
            }
            System.out.println(pos2);
        }
    }
}