class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //73,74,75,71,69,72,76,73
        //30,38,30,36,35,40,28
        Stack<Integer> st = new Stack<Integer>();
        int[] op = new int[temperatures.length];
        // List<Integer> op = new ArrayList<Integer>();

        for(int i=0; i<temperatures.length;i++){
            System.out.println(i);
           
            // if(st.isEmpty() || temperatures[i] < temperatures[st.peek()]){
            //     st.push(i);
            // } else{                
                while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){ 
                          
                    op[st.peek()] =  i- st.peek();      
                    st.pop();
                }                    
                st.push(i);
            }
            //  System.out.println(st);
             
        // }
        for(int i=0; i<op.length;i++){
            System.out.println(i);
        }
        
        return op;
    }
}
