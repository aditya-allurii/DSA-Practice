import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        int n = in.nextInt();
        int [] arr ; //declare array
        arr = new int[n]; // give n empty spaces in the array
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] > 0){
                pos++;
            }else if(arr[i] == 0){
                zero++;
            }else if(arr[i] < 0){
                neg++;
            }
        }
        System.out.printf("%.6f\n",(double)pos/n);
        System.out.printf("%.6f\n",(double)neg/n);
        System.out.printf("%.6f\n",(double)zero/n);

    }

}
