import java.util.Scanner;

public class SupermarketQueue {
    private static final int MAX_SIZE = 10;
    private String[] queue = new String[MAX_SIZE];
    private int front = 0;
    private int rear = -1;
    private int count = 0;
    public void addCustomer(String name) {
        if (count == MAX_SIZE) {
            System.out.println("Queue is full! Cannot add more customers.");
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = name;
        count++;
        System.out.println(name + " has joined the queue.");
    }
    public void serveCustomer() {
        if (count == 0) {
            System.out.println("Queue is empty. No customer to serve.");
            return;
        }
        System.out.println(queue[front] + " has been served.");
        front = (front + 1) % MAX_SIZE;
        count--;
    }
    public void displayQueue() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Current queue:");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % MAX_SIZE;
            System.out.println((i + 1) + ". " + queue[index]);
        }
    }
    public void displayCount() {
        System.out.println("Number of customers in queue: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupermarketQueue queueSystem = new SupermarketQueue();
        int choice;

        do {
            System.out.println("\n Supermarket Queue Menu ");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. Display current queue");
            System.out.println("4. Display number of customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queueSystem.addCustomer(name);
                    break;
                case 2:
                    queueSystem.serveCustomer();
                    break;
                case 3:
                    queueSystem.displayQueue();
                    break;
                case 4:
                    queueSystem.displayCount();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

