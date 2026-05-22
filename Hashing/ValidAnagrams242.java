class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //first approach
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
        //2nd approach
        // Map<Character,Integer> map = new HashMap<>();
        // for(char c : s.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        // for(char c : t.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)-1);
        // }
        // for(int count : map.values()){
        //     if(count!=0){
        //         return false;
        //     }
        // }
        //return true;
        //3nd approach
        // int[] freq = new int[26];
        // for(int i = 0;i<s.length();i++){
        //     freq[s.charAt(i) - 'a']++;
        //     freq[t.charAt(i) - 'a']--;
        // }
        // for(int count : freq){
        //     if(count!=0){
        //         return false;
        //     }
        // }
        // return true;
    }
}