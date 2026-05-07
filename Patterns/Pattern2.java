import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for( int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for( int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
public class Pattern2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
}
