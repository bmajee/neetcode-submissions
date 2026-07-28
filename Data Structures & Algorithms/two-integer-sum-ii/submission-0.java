class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 5,8,9,11,13,15 - 19
        int[] res = new int[2];
        int leftP = 0;
        int rightP = numbers.length-1;
        while(rightP>=leftP ){
            System.out.print(rightP+":"+leftP+":::");
            if (numbers[leftP] + numbers[rightP] > target){
                rightP--;
            } else if (numbers[leftP] + numbers[rightP] < target){
                leftP++;
            } else if (numbers[leftP] + numbers[rightP] == target){
                res[0] = leftP+1;
                res[1] = rightP+1; 
                return res;
            }
        }
        return res;
    }
}
