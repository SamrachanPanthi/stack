import java.util.Scanner;

public class CallCenterQueue {
    private static final int MAX_CALLS = 10;

    // Array to store caller names or IDs
    private String[] queue = new String[MAX_CALLS];

   
    private int front = 0;   
    private int rear = -1;   
    private int count = 0;   
    public void addCall(String callerName) {
        if (count == MAX_CALLS) {
            System.out.println("Queue is full! Cannot add more calls.");
        } else {
            rear = (rear + 1) % MAX_CALLS;
            queue[rear] = callerName;
            count++;
            System.out.println("Call from " + callerName + " added to the queue.");
        }
    }
    public void serveCall() {
        if (count == 0) {
            System.out.println("No calls to serve. Queue is empty.");
        } else {
            System.out.println("Serving call from: " + queue[front]);
            front = (front + 1) % MAX_CALLS;
            count--;
        }
    }
    public void showQueue() {
        if (count == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current calls in the queue:");
            for (int i = 0; i < count; i++) {
                int index = (front + i) % MAX_CALLS;
                System.out.println((i + 1) + ". " + queue[index]);
            }
        }
    }

    // Function to show number of pending calls
    public void showPendingCalls() {
        System.out.println("Total pending calls: " + count);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CallCenterQueue callCenter = new CallCenterQueue();
        int choice;

        // Menu-driven loop
        do {
            System.out.println("\n Call Center Queue System ");
            System.out.println("1. Add incoming call");
            System.out.println("2. Serve next call");
            System.out.println("3. Show call queue");
            System.out.println("4. Show number of pending calls");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();
            input.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter caller name or ID: ");
                    String name = input.nextLine();
                    callCenter.addCall(name);
                    break;
                case 2:
                    callCenter.serveCall();
                    break;
                case 3:
                    callCenter.showQueue();
                    break;
                case 4:
                    callCenter.showPendingCalls();
                    break;
                case 5:
                    System.out.println("Thank you! Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose from 1 to 5.");
            }
        } while (choice != 5);

        input.close();
    }
}
