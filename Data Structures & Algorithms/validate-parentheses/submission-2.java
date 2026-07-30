class Solution {
    public boolean isValid(String s) {
        char[] sarr = s.toCharArray();
        Stack<Character> st = new Stack<Character>();

        for(int i=0; i < sarr.length;i++){
            System.out.println("sarr[i]. "+sarr[i]);
            if(sarr[i] == '(' || sarr[i] == '{' || sarr[i] == '['){
                st.push(sarr[i]);
                System.out.println("push. "+st);
            } else{
                if(st.isEmpty()) return false;
                char popped = st.pop();
                System.out.println("popped " +popped);
                if( !(popped == '(' && sarr[i]==')') 
                    && !(popped == '{' && sarr[i]=='}')
                        && !(popped == '[' && sarr[i]==']')){
                    System.out.println("pop " +st);
                    return false;

                }
            }
        }
        return st.isEmpty();
    }
}
