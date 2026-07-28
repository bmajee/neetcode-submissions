class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> refMap = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(refMap.containsKey(target - nums[i]) ){
               return new int[] {refMap.get(target - nums[i]),i};
            } else{
                refMap.put(nums[i], i);
            }
        }
        return new int[] {0,0};
    }
}
