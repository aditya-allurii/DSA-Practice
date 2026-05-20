import java.util.Scanner;
public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] keyboard = new int[n];
        for(int i = 0;i<n;i++){
            keyboard[i] = sc.nextInt();
        }
        int[] drives = new int[m];
        for(int i = 0;i<m;i++){
            drives[i] = sc.nextInt();
        }
        int max = -1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int sum = keyboard[i] + drives[j];
                if(sum <= b){
                    max = Math.max(max,sum);
                }
            }
        }
        System.out.println(max);
    }
}