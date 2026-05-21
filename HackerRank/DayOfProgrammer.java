import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        // Special case
        if (year == 1918) {
            System.out.println("26.09.1918");
            return;
        }

        boolean leap = false;

        // Julian calendar
        if (year < 1918) {
            leap = (year % 4 == 0);
        }

        // Gregorian calendar
        else {
            leap = (year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0);
        }

        if (leap) {
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }
}