class Solution {
    public int firstUniqChar(String s) {
        //create a HashMap
        Map<Character,Integer> map = new HashMap<>();
        //add to map
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //now check frequncy of each char = 1 or not
        for(int i = 0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;//answer found
            }
        }
        return -1;
    }
}