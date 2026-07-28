class Solution {
    public boolean isPalindrome(String s) {
        // boolean isP = false;
        s = s.replaceAll("[^A-Za-z0-9]", "").toUpperCase();

        int pos = 0;
        while (pos != s.length()/2){
            System.out.println(s.charAt(pos)+":::"+s.charAt(s.length()-pos-1));
            if(s.charAt(pos) != s.charAt(s.length()-pos-1)){
                return false;
            }
            pos++;
        }
        return true;
    }
}
