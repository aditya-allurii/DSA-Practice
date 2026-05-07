import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        int n = 4;
        for( int i = 0;i<n;i++){
            for( int j =0;j<=i;j++) {
                System.out.print((char)('A' + i+j)+" ");
            }
            System.out.println();
        }
    }
}



public class Pattern3_1 {
    public static void main(String[] args){
        int n = 4;
        for( int i = 0;i<=n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print((char)('A'+n-i+j)+ " ");
            }
            System.out.println();
        }
    }
}
