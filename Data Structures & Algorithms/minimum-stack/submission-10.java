class MinStack {

    Stack<Integer> mainstack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();

    public MinStack() {
        
    }
    
    //98763 45
    public void push(int val) {
        mainstack.push(val);
        if(minstack.isEmpty() || minstack.peek() >= val)
            minstack.push(val);
        // System.out.println("mainpush :"+mainstack);
        // System.out.println("minpush :"+minstack);
    }
    
    public void pop() {
        
        if(!minstack.isEmpty() && minstack.peek() >= mainstack.peek())
            minstack.pop();
        if(!mainstack.isEmpty())
            mainstack.pop();
        // System.out.println("mainpop :"+mainstack);
        // System.out.println("minpop :"+minstack);
    }
    
    public int top() {
        //  System.out.println("main" + mainstack);
        return mainstack.peek();
    }
    
    public int getMin() {
        // System.out.println("min" + minstack);
        return minstack.peek();
    }
}
