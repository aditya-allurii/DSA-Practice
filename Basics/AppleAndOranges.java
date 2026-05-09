import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int [] apples ; //declare array
        apples = new int[m];
        int n = in.nextInt();
        int [] oranges ; //declare array
        oranges = new int[n];

        for(int i = 0;i<m;i++){
            apples[i] = in.nextInt();
        }
        for(int i = 0;i<n;i++){
            oranges[i] = in.nextInt();
        }
        int applecount = 0;
        int[] res = new int[m];
        for(int i = 0;i<m;i++){
            res[i] = a + apples[i];
            if(res[i] >= s && res[i]<=t){
                applecount++;
            }
        }
        int orangecount = 0;
        int[] res2 = new int[n];
        for(int i = 0;i<n;i++){
            res2[i] = b + oranges[i];
            if(res2[i]>=s && res2[i]<=t){
                orangecount++;
            }
        }
        System.out.println(applecount);
        System.out.println(orangecount);
    }
}
