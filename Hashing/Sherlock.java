import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testcase = 0;testcase<t;testcase++){
            int n= sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int total = 0;
            for(int i = 0;i<n;i++){
                total+=arr[i];
            }
            int leftsum = 0;
            boolean found = false;
            for(int i = 0;i<n;i++){
                int rightsum = total - leftsum-arr[i];
                if(leftsum == rightsum){
                    found = true;
                    break;
                }
                leftsum+=arr[i];
            }
            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
