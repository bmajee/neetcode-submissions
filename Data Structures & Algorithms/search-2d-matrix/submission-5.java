class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
       int[] flat = Arrays.stream(matrix)
.flatMapToInt(Arrays::stream)
.toArray();
return Arrays.binarySearch(flat, target) >= 0;
       
    }
}
