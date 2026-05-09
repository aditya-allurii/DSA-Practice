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
        Long c = 0L ;

        for(int i = 0;i<n;i++){
            c = c + arr[i];
        }




        System.out.println(c);
    }
}
