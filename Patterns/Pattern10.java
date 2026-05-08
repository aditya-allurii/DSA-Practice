import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            int odd = 2*i-1;
            for(int j = 1;j<=n;j++){
                System.out.print(odd);
                odd = odd+2;
                if(odd > (n*2-1)){
                    odd = 1;
                }
            }
            System.out.println();
        }
    }
}
