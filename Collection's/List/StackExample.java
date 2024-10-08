import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack);

        // Peeking the top element without removing it
        System.out.println("Top element: " + stack.peek());

        // Popping the top element
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // Searching for an element in the stack (1-based position from the top)
        System.out.println("Position of 'A': " + stack.search("A"));

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());
    }
}
