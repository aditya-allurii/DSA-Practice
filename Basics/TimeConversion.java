import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);//to take the input
        String s = in.nextLine();
        //need to know PM or Am
        String period = s.substring(8);
        //now hour
        String hh = s.substring(0,2);
        //converting to integer
        int hour = Integer.parseInt(hh);

        //PM condition
        if(period.equals("PM") && hour!=12){
            hour = hour+12;
        }
        //Am
        if(period.equals("AM") && hour == 12){
            hour = 0;
        }
        String rest = s.substring(2,8);
        System.out.printf("%02d%s",hour,rest);
    }
}
