class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top =0;
        int bottom = matrix.length-1;
        int pivot = top+bottom/2;
        int rtf = 0;
        //1,3 - 0
        while(top != bottom){
            
            // System.out.println("target::"+target+"top::"+top+"bottom::"+bottom+"pivot::"+pivot);
            if(pivot == 0 &&  target < matrix[pivot][0]){
                return false;
            }
            if(target == matrix[pivot][0]) 
                return true;

            if(target > matrix[pivot][0] && target < matrix[pivot+1][0]){
                rtf = pivot;
                break;
            } else if(target > matrix[pivot][0]){
                top = pivot+1;
            }else if(target < matrix[pivot][0]){
                bottom = pivot-1;
            }
            pivot = (top+bottom)/2;
            rtf = pivot;
            
            
            // System.out.println(top+":"+bottom+":"+pivot);
            //  System.out.println("target::"+target+"top::"+top+"bottom::"+bottom+"pivot::"+pivot);
        }
         System.out.println(rtf);
         int rl = matrix[0].length -1;
        //  System.out.println(rl);
         top = 0;
         bottom = rl;
         pivot = (top+bottom)/2;
        //  System.out.println(top);
        //   System.out.println(bottom);
        //    System.out.println(pivot);

            //14,20,39,56, 89,300 ,305 - 300--- [10,11,16,20  --13
         while (top <= bottom){
            
            if(target == matrix[rtf][pivot]){
                return true;
            } else if(target > matrix[rtf][pivot]){
                top = pivot+1;
            } else if(target < matrix[rtf][pivot]){
                bottom = pivot -1;
            }
            pivot = (top+bottom)/2;
         }

        return false;
       
    }
}
