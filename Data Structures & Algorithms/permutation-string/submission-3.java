class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int slidel = s1.length();
        int[] freqc = new int[26];
        int left =0;
        int right =s1.length()-1;
        for(int i=0;i<s1.length();i++){
            freqc[s1.charAt(i) - 'a']++;
        }
        // System.out.println("freqc");
        for(int i=0;i<26;i++){
            System.out.print(freqc[i]);
        }
        System.out.println("");
        while (left <= s2.length() - s1.length()){
            // System.out.println(left+":::"+right);
            // System.out.println(s2.substring(left,left+s1.length()));
            String seq = s2.substring(left,left+s1.length());
            int[] freqc1 = new int[26];
            for(int i=0;i<seq.length();i++){
                freqc1[seq.charAt(i) - 'a']++;
            }
            // for(int i=0;i<26;i++){
            //     System.out.print(freqc1[i]);
            // }
            if(Arrays.toString(freqc).equals(Arrays.toString(freqc1))){
                return true;
            }
            // System.out.println("");
            left++;
            right++;
        }


        return false;
        
    }
}
