class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalRes = new ArrayList<List<String>>();
        Map<String,List<String>> res = new HashMap<String,List<String>>();

        for(String s:strs){
            char[] charArr = s.toCharArray();
            int[] freqKey = new int[26];
            String freqStr = "";
            for(int i=0; i<s.length();i++){
                freqKey[charArr[i]-'a']++;
            }
            freqStr = Arrays.toString(freqKey);
            if(!res.containsKey(freqStr)){
                res.put(freqStr,new ArrayList());
            }
            res.get(freqStr).add(s);
        }
        res.forEach((k,v) -> finalRes.add(v));
         
        return finalRes;
    }
}
