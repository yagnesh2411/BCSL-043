public class SimpleStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public SimpleStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push method with exception handling
    public void push(int value) throws Exception {
        if (top == capacity - 1) {
            throw new Exception("Stack Overflow: Cannot push, stack is full.");
        }
        stack[++top] = value;
    }

    // Pop method with exception handling
    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack Underflow: Cannot pop, stack is empty.");
        }
        return stack[top--];
    }

    // Main method for demonstration
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5);
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40); // Uncomment to test overflow
            // stack.push(40); // Uncomment to test overflow

            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            // System.out.println("Popped: " + stack.pop()); // Uncomment to test underflow
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}