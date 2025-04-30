import java.util.Scanner;

class Stack {
    int top = -1;
    int size;
    int[] stack;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class Queue {
    int front = -1, rear = -1;
    int size;
    int[] queue;

    Queue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
            System.out.println(value + " enqueued.");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println(queue[front++] + " dequeued.");
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);
        Queue queue = new Queue(5);

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Stack Operations");
            System.out.println("2. Queue Operations");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // Stack menu
                while (true) {
                    System.out.println("\n--- Stack Menu ---");
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Display Stack");
                    System.out.println("4. Back to Main Menu");
                    System.out.print("Enter choice: ");
                    int ch = sc.nextInt();

                    switch (ch) {
                        case 1:
                            System.out.print("Enter value to push: ");
                            stack.push(sc.nextInt());
                            break;
                        case 2:
                            stack.pop();
                            break;
                        case 3:
                            stack.display();
                            break;
                        case 4:
                            System.out.println("Returning to Main Menu...");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }

                    if (ch == 4) break;
                }

            } else if (choice == 2) {
                // Queue menu
                while (true) {
                    System.out.println("\n--- Queue Menu ---");
                    System.out.println("1. Enqueue");
                    System.out.println("2. Dequeue");
                    System.out.println("3. Display Queue");
                    System.out.println("4. Back to Main Menu");
                    System.out.print("Enter choice: ");
                    int ch = sc.nextInt();

                    switch (ch) {
                        case 1:
                            System.out.print("Enter value to enqueue: ");
                            queue.enqueue(sc.nextInt());
                            break;
                        case 2:
                            queue.dequeue();
                            break;
                        case 3:
                            queue.display();
                            break;
                        case 4:
                            System.out.println("Returning to Main Menu...");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }

                    if (ch == 4) break;
                }

            } else if (choice == 3) {
                System.out.println("Exiting program. Bye!");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
