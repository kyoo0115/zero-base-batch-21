import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    // Push
    stack.push(1);
    stack.push(2);
    stack.push(3);

    // Peek
    int topElement = stack.peek();
    System.out.println("Top Element: " + topElement);

    // Pop
    int poppedElement = stack.pop();
    System.out.println("Popped Element: " + poppedElement);

    // Search
    int searchElement = 2;
    int position = stack.search(searchElement);
    System.out.println("Position of " + searchElement + ": " + position);
    System.out.println(stack);
  }
}