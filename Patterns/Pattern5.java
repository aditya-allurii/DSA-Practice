import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i =0;i<n;i++){
            for( int space = 1;space<=n-i-1;space++){
                System.out.print(".");
            }
            for( int j = i+1;j<=2*i+1;j++){
                System.out.print(j);
            }
            for( int j = 2*i;j>=i+1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

public class Pattern5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper half
        for(int i =0;i<=n/2;i++){
            for(int s = 0;s<n/2-i;s++){
                System.out.print(" ");
            }for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n/2-1;i>=0;i--){
            for(int s = 0;s<n/2-i;s++){
                System.out.print(" ");
            }for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}