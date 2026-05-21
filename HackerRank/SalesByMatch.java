import java.util.*;
import java.util.HashMap;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int sock = sc.nextInt();
            if(map.containsKey(sock)){
                map.put(sock,map.get(sock)+1);
            }else {
                map.put(sock, 1);
            }
        }
        int pair = 0;
        for(int key:map.keySet()){
            int count = map.get(key);
            pair = pair + count/2;
        }
        System.out.println(pair);
    }
}