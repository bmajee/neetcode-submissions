class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<String>();
        int res = 0;
        for(String token:tokens){
            System.out.println(token);
            if( !( token.equals("+")
                    || token.equals("-")
                    ||  token.equals("*")
                    || token.equals("/"))
            ){
                st.push(token);
                System.out.println(st);
            } else {
                int op1 = Integer.parseInt(st.pop());
                int op2 = Integer.parseInt(st.pop());
               if(token.equals("+")) res  =op1+op2;
               if(token.equals("-")) res  =op2-op1;
               if(token.equals("*")) res  =op1*op2;
               if(token.equals("/")) res  =op2/op1;
               st.push(res+"");
            }
        }
        System.out.println(st);
        return Integer.parseInt(st.peek());
    }
}
