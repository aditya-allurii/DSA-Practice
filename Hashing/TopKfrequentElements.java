class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // //sorting approach
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        // //sort by descending we want top frequency first
        // list.sort((a,b) -> b.getValue() - a.getValue());

        // int[] res = new int[k];
        // for(int i = 0;i<k;i++){
        //     res[i] = list.get(i).getKey();
        // }
        // return res;


        //Min Heap Approach Priority Queue

        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue() );//sort by min frequency by default java hash high frequency for small elements

        //traverse the map
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry);

            if(pq.size() > k){
                pq.poll();//removes the smaller frequecy entry
            }
        }
        int[] res = new int[k];
        for(int i = 0;i<k;i++){
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}