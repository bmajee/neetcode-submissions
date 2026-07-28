class Solution {
    public int maxArea(int[] heights) {
        int leftp = 0;
        int rightp = heights.length -1;

        int maxArea = Math.min(heights[leftp],heights[rightp]) * (rightp - leftp);
        // System.out.println(maxArea);

        while (leftp < rightp){
             System.out.println(leftp+"::::"+rightp+"::::"+maxArea+":::"+Math.min(heights[leftp],heights[rightp]) * (rightp - leftp));
            if(heights[leftp] < heights[rightp]) leftp++;
            else rightp--;
            // else { leftp++;rightp--;}
           
            maxArea = Math.max(Math.min(heights[leftp],heights[rightp]) * (rightp - leftp), maxArea);
           
        }

        return maxArea;
    }
}
