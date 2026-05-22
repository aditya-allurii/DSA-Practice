import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static int bruteforce(int[] nums,int k){
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int comp = k - nums[i];
            if(map.containsKey(comp)){
                count++;
            }
            map.put(nums[i],i);
        }
//        for(int i = 0;i<nums.length;i++){
//            for(int j = i+1;i<nums.length;j++){
//                if(nums[i] + nums[j] == k){
//                    count++;
//                }
//            }
//        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,2,5};
        int k = 4;
        System.out.println("Count of pairs: " + bruteforce(nums, k));
    }
}

//optimised
