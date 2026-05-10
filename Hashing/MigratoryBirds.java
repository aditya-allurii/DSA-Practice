import java.util.*;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int bird = sc.nextInt();
            if(map.containsKey(bird)){
                map.put(bird,map.get(bird)+1);
            }else {
                map.put(bird,1);
            }
        }
        int max = 0;
        int ans = 0;
        for(int key :map.keySet()){
            int count = map.get(key);
            if(count > max){
                max = count;
                ans =key;
            }
        }
        System.out.println(ans);
    }

};
