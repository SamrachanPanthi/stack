public class CustomStack {
    private int[] stackArray; 
    private int top;         
    private int capacity;    
    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1; 
    }
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + val);
            return;
        }
        stackArray[++top] = val;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1; 
        }
        return stackArray[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1; 
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); 

        System.out.println("Peek: " + stack.peek()); 
        System.out.println("Pop: " + stack.pop());   
        System.out.println("Peek after pop: " + stack.peek()); 

        System.out.println("Is empty " + stack.isEmpty()); 
        System.out.println("Is full " + stack.isFull());   

        stack.push(40);
        stack.push(50);
        stack.push(60); 
        System.out.println("Is full " + stack.isFull());   
        stack.push(70); 
        stack.display(); 
    }
}
