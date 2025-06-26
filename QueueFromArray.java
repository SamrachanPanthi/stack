public class QueueFromArray{
    int [] queue;
    int capacity;
    int front;
    int rear;
    int size;
    public QueueFromArray(int capacity){
        queue = new int[capacity];
        this.capacity=capacity;
        front=0;
        rear =-1;
        size=0;

    }
    public boolean isEmpty(){
        // return front>rear;
        return size==0;

    }
    public boolean isFull(){
        // return rear == capacity-1;
        return size==capacity;
}
public void enqueue (int value){
    if (isFull()){
        System.out.println("Queue overflow");
    }else{
        // rear++;
        rear=(rear+1)%capacity;
        queue[rear]=value;
        size++;
        System.out.println("enqueued"+ value);
    }
}
public  int dequeue (){
    if (isEmpty()){
        System.out.println("Queue underflow");
        return -99999;
    }else{
       int value=queue[front];
        // front++;
        front=(front+1)%capacity;
        size--;
        return value;
    }
}
public int  peek(){
    if(isEmpty()){
    System.out.println("Queue underflow");  
    return -99999;  
    }else{
        return queue[front];
    }
}



}