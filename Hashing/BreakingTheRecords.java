import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        int n = in.nextInt();
        int [] scores ; //declare array
        scores = new int[n]; // give n empty spaces in the array

        for(int i = 0;i<n;i++){
            scores[i] = in.nextInt();
        }
        int min = scores[0];
        int max = scores[0];
        int min_count = 0;
        int max_count = 0;
        for(int i = 0;i<n;i++){
            if(scores[i]<min){
                min = scores[i];
                min_count++;
            }else if(scores[i]>max){
                max = scores[i];
                max_count++;
            }
        }
        System.out.println(max_count+" " + min_count);
    }
}
