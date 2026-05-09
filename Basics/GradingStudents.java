import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        int n = in.nextInt();
        int [] grades ; //declare array
        grades = new int[n]; // give n empty spaces in the array
        for(int i = 0;i<n;i++){
            grades[i] = in.nextInt();
        }
        for(int i = 0;i<n;i++){
            int roundoff = grades[i] + (5-grades[i]%5);
            if(grades[i]>=38 && grades[i]%5!=0 && (roundoff - grades[i])<3) {
                grades[i] = roundoff;
            }
            System.out.println(grades[i]);
        }
    }
}
