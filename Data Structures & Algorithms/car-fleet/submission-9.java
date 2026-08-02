class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        //target = 10, position = [4,1,0,7], speed = [2,2,1,1]
        //7,4,1,0 - 
        //3.0, 3.0, 4.0, 2.0, 1.0, 10.0
        int n = position.length;
        int[][] ps = new int[n][2];
        double[] t = new double[n];
        int fc =1;
        for (int i=0; i<n;i++){
            ps[i][0] = position[i] ;
            ps[i][1] = speed[i] ;
            // System.out.println(ps[i][0]+ "::" + ps[i][1]);
        }
        Arrays.sort(ps, (a,b) -> b[0]-a[0]);
        for (int i=0; i<n;i++){
            // System.out.println(ps[i][0]+ "::" + ps[i][1]);
            t[i] = (double)(target - ps[i][0])/ps[i][1];
            // System.out.println(t[i]);
        }
        double max = t[0];
        //3.0, 3.0, 4.0, 2.0, 1.0, 10.0
        for (int i=1; i<n;i++){
            if(t[i] > max){
                max = t[i];
                fc++;
            }
        }

        return fc;
    }
}
