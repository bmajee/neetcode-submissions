class Solution {
    public int findMin(int[] nums) {
        //4 5 6 7 
        //5 6 7 4
        //6 7 4 5
        int left = 0;
        int right = nums.length-1;
        int mid =(left+right)/2;
        while(left < right){
            System.out.println("A"+left+"::"+right+"::"+mid);
            
             if(nums[mid] > nums[right]){
                left=mid+1;
            } else if(nums[mid] < nums[right]){
                right=mid;
            }
           
            System.out.println("B"+left+"::"+right+"::"+mid);
            mid = (left+right)/2;
        }
       System.out.println("C"+left+"::"+right+"::"+mid);
        return nums[mid];
        
    }
}
