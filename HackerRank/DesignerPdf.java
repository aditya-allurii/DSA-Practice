import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] h = new int[26];
        for(int i = 0;i<26;i++){
            h[i] = sc.nextInt();
        }
        String word = sc.next();
        int max = 0;
        for(int i =0;i<word.length();i++){
            if(h[word.charAt(i)-97]>max){
                max = h[word.charAt(i)-97];
            }
        }
        System.out.println(max * word.length());
    }
}