class MinStack {
    private LinkedList<Integer> stack;
    private long minValue = Long.MAX_VALUE;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new LinkedList<Integer>();
        minStack = new Stack<Integer>();
    }
    public void push(int val) {
        stack.add(val);
        if (val <= minValue) {
            stack.push(val);
            minValue = val;
        }
    }
    public void pop() {
        int val = stack.removeLast();
        if (val == minValue) {
            stack.pop();
            if (!stack.isEmpty()) {
                minValue = stack.peek();
            } else {
                minValue = Long.MAX_VALUE;
            }
            
        }
    }
    public int top() {
        return stack.getLast();
    }
    public int getMin() {
        return (int) minValue;
    }
}
