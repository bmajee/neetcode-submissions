class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] counter = new int[26];
        // Map<char,int[]> freqMap = new Map<char,List<int[]>();
        for(int i=0;i<s.length();i++){
           counter[s.charAt(i) - 'a']++;
           counter[t.charAt(i) - 'a']--;
        }

        for(int i=0;i<26;i++){
            if(counter[i] != 0){
                return false;
            }
        }

        return true;

    }
}
