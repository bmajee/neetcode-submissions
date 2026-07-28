class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for(int num:nums){
            numSet.add(num);
            // System.out.println(numSet);            
        }
        System.out.println(numSet); 
        int largest =0;
        for(int num:numSet){
            int length =1;
            if(!numSet.contains(num-1))   {
                int nextNum = num+1;            
               while(numSet.contains(nextNum)){
                    System.out.print(nextNum + " ");
                    nextNum++;
                    length++;
               }
                
               largest = Math.max(length,largest);
               System.out.print(":"+ largest+ " "); 
            }
               
              
        }

        return largest;
    }
}
