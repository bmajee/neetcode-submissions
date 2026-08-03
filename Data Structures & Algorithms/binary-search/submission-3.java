class Solution {
    public int search(int[] nums, int target) {
        int pivot = nums.length/2;
        int left = 0;
        int right = nums.length-1;
        while( left <= right){
            System.out.println("pivot :"+pivot+":left:"+left+":right:"+right);
             if(nums[pivot] == target){                
                return pivot;
            }else if(target < nums[pivot]){
                right = pivot -1;
                pivot = (left+right)/2;
            }else if(target > nums[pivot]){
                left = pivot + 1;
                pivot = (left+right)/2;
            }
        }
        return -1;
       
    }
}
