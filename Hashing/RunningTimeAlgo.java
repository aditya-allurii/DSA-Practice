import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int shifts = 0;
        for(int index =1;index<n;index++){
            int last = arr[index];
            int i = index-1;
            while(i>=0 && arr[i] > last){
                arr[i+1] = arr[i];
                shifts++;
                i--;
            }
            arr[i+1] = last;
        }
        System.out.print(shifts);
    }
}