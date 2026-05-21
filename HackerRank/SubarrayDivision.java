import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        int n = in.nextInt();

        int [] s ; //declare array
        s = new int[n]; // give n empty spaces in the array

        for(int i = 0;i<n;i++){
            s[i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        for(int i = 0;i<=n-m;i++){
            int currentsum = 0;
            for(int j = i;j<i+m;j++){
                currentsum+=s[j];
            }
            if(currentsum == d){
                count++;
            }
        }
        System.out.println(count);
    }
}
