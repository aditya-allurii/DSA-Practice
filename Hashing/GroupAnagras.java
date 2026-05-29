class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();
        //so ippudu manam key and value find cheyyali map kosam

        //first key find chedam
        for(String s : strs){
            int[] freq = new int[26];//26alphabets

            for(int i = 0;i<s.length();i++){
                char c = s.charAt(i);
                freq[c - 'a']++;//converts alphabets to number
            }
            //convert to key antey array type: make freqency array
            StringBuilder key = new StringBuilder();
            for(int i = 0;i<26;i++){
                if(freq[i] > 0){
                    key.append((char)('a' + i));
                    key.append("#");
                    key.append(freq[i]);//totallt like we get a#2b#1
                }
            }
            String freqkey = key.toString();
            //so manaki kavalsina key build chesam ippudu ah key map lo undho ledhoo choodali. lepothey ah key petti kotha arraylist create chestam!!untey ah key ki corresponding string value add chestam mana values
            if(!map.containsKey(freqkey)){
                map.put(freqkey,new ArrayList<>());
            }
            map.get(freqkey).add(s);
        }
        //last loo values return chestam endhukantey manam strings anni values lo store chesam as a list gaa
        return new ArrayList<>(map.values());
    }
}