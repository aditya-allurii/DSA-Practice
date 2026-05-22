public class CheckEqualNumbersAtDistanceOfK {
    public boolean CheckDup(int[] nums,int k){
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n&&j<=i+k;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1, 1, 3, 1, 2, 3};
        if (containsNearbyDuplicateBruteForce(nums, k)) {
            System.out.println("There are two equal numbers within distance " + k);
        } else {
            System.out.println("No two equal numbers found within distance " + k);
        }
    }
}