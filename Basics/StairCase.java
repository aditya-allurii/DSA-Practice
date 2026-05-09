import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        int n = in.nextInt();
        for(int i = 1;i<=n;i++){
            for(int s =1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
