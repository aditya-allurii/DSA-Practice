import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        int n = in.nextInt();
        int [] candles ; //declare array
        candles = new int[n]; // give n empty spaces in the array

        for(int i = 0;i<n;i++){
            candles[i] = in.nextInt();
        }
        //finding maximum
        int max = candles[0];
        for(int i = 0;i<n;i++){
            if(candles[i] > max){
                max = candles[i];
            }
        }
        //finding the count of largest candle
        int count = 0;
        for(int i = 0;i<n;i++){
            if(max == candles[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
