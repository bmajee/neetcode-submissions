class Solution {
    public int lengthOfLongestSubstring(String s) {
        //acdhedfcvmhgguyfffwecsdfgtrcv
        //a,c,d,h,e,
        Set<Character> seq = new HashSet<Character>();
        int left = 0;
        int right =0;
        int maxLength = 0;
        for(;right<s.length();right++){
            while(seq.contains(s.charAt(right))){
                seq.remove(s.charAt(left));
                left++;
            }
            seq.add(s.charAt(right));
            // System.out.println(seq);
            maxLength = Math.max(right-left+1, maxLength);
            System.out.println(left+":::"+right+"::"+seq.size());
        }

        System.out.println(seq);
        return maxLength;
        
    }
}
