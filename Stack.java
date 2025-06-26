public class Stack {
    private int[] stackArray; 
    private int top;          
    private int capacity;     

    
    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; 
    }
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stackArray[++top] = element;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop from empty stack.");
            return -1;
        }
        return stackArray[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5); 

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Stack size: " + stack.size()); 

        stack.display();
    }
}
