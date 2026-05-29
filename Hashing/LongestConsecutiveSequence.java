class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        //add nums to set
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        //so now we have nums in the set
        //check if num-1 is present or not
        //if not then num is the currentnum
        //count = 1

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentnum = num;
                int count = 1;

                //now if we num+1 that is next current num and count also increases as it is in consecutive order
                while(set.contains(currentnum+1)){
                    currentnum++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}