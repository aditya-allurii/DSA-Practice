class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        //add first word letter to check if they present in next words or not
        for(char c : words[0].toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //add reamiang
        for(int i =1;i<words.length;i++){
            Map<Character,Integer> freq = new HashMap<>();
            for(char c : words[i].toCharArray()){
                freq.put(c,freq.getOrDefault(c,0)+1);
            }
            //check if chars in mapkey present in freqkey
            for(Character key : new ArrayList<>(map.keySet())){
                if(!freq.containsKey(key)){
                    map.remove(key);
                }else {
                    map.put(key,Math.min(freq.get(key),map.get(key)));
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for(char c : map.keySet()){
            int count = map.get(c);
            for(int j = 0;j<count;j++){
                ans.add(String.valueOf(c));
            }
        }
        return ans;
    }
}