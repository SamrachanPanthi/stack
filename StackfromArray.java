public class StackfromArray {
    int [] stack;
    int capacity;
    int top;
    public StackfromArray(int size){

        stack = new int [size];
        capacity= size;
        //makingg the stack empty
        top =-1;
    }
    public boolean  isEmpty(){
        return top==-1;

    }
    public boolean isFull(){
        //because top starts  from 0 and capacity from 1
        return top==capacity-1;

    }
    public void push (int value){
        if (isFull()){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=value;
        System.out.println(value+ "pushed to stack");

    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return-999999;
        }else{
            int value = stack[top];
            top--;
            return value;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return -9999999;

        }else{
            int value= stack[top];
            return value;
        }
    }   
}
