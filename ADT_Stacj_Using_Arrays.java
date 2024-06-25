import java.util.Scanner;

// Define an interface for the Stack ADT
interface MyStack {
    void push(int item) throws StackOverflowException;
    int pop() throws StackUnderflowException;
    void display();
}

// Implement the MyStack interface using an array
class StackArray implements MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push method to add an item to the stack
    @Override
    public void push(int item) throws StackOverflowException {
        if (top >= maxSize - 1) {
            throw new StackOverflowException("Stack Overflow");
        }
        stackArray[++top] = item;
    }

    // Pop method to remove an item from the stack
    @Override
    public int pop() throws StackUnderflowException {
        if (top < 0) {
            throw new StackUnderflowException("Stack is empty");
        }
        return stackArray[top--];
    }

    // Display method to show the elements in the stack
    @Override
    public void display() {
        if (top >= 0) {
            System.out.print("Elements are: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i]);
                if (i < top) {
                    System.out.print(" --> ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }
}

// Custom exception for Stack Overflow
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

// Custom exception for Stack Underflow
class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

// Main class to test the stack implementation
public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Implementation of Stack using Array");
        int choice;
        int element;
        MyStack stack = new StackArray(5); // Create a stack of size 5

        // Menu-driven loop to perform stack operations
        while (true) {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element:");
                    element = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    try {
                        stack.push(element);
                    } catch (StackOverflowException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } catch (StackUnderflowException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
