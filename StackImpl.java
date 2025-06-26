import java.util.Stack;
public class StackImpl{
    public static void main(String[] args) {
        Stack<Integer>myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        //retervies element without removing from stack
        System.out.println(myStack.peek());
         //retervies element and removes from stack
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }
}
