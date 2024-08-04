import java.util.Stack;

public class MinStack155 {
    
Stack<Integer> stack;
Stack<Integer>minStack;
    public MinStack155() {
         stack=new Stack<>();
         minStack=new Stack<>();
    }
    
    public void push(int val) {
       stack.push(val);
       if(minStack.isEmpty() || val<=minStack.peek()){
       minStack.push(val);
       }
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek()))
              minStack.pop();

        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
    public static void main(String[] args) {
        MinStack155 minStack = new MinStack155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Current minimum: " + minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println("Top element: " + minStack.top());        // Returns 0
        System.out.println("Current minimum: " + minStack.getMin()); // Returns -2
    }
}


