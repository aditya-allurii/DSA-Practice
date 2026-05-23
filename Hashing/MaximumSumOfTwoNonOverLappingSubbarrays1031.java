class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(solve(nums,firstLen,secondLen),solve(nums,secondLen,firstLen));
    }
    //helper function

    public int solve(int[] nums,int l,int m){
        int n = nums.length;
        //leftmax
        int[] left = new int[n];
        int currsum = 0;
        for(int i = 0;i<l;i++){
            currsum+=nums[i];
        }
        int leftmax = currsum;
        left[l-1] = leftmax;
        for(int i = l;i<n;i++){
            currsum = currsum - nums[i-l] + nums[i];
            leftmax = Math.max(leftmax,currsum);
            left[i] = leftmax;
        }
        //fill with zeros befor l-1
        for(int i =0;i<l-1;i++){
            left[i] = 0;
        }
        //rightmax
        int[] right = new int[n];
        currsum = 0;
        for(int i = n-m;i<n;i++){
            currsum += nums[i];
        }
        int rightmax = currsum;
        right[n-m] = rightmax;
        for(int i = n-m-1;i>=0;i--){
            currsum = currsum - nums[i+m] + nums[i];
            rightmax = Math.max(rightmax,currsum);
            right[i] = rightmax;
        }
        int ans = 0;
        for(int i =l-1;i<n-m;i++){
            ans = Math.max(ans,left[i]+right[i+1]);
        }
        return ans;
    }
}