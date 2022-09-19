class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    
    public MyQueue() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack1.offerFirst(x);
    }
    
    public int pop() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.offerFirst(stack1.pollFirst());
            }
        }
        
        return stack2.pollFirst();
    }
    
    public int peek() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.offerFirst(stack1.pollFirst());
            }
        }
        
        return stack2.peekFirst();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
