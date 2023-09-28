package day4;
public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(4);
		stack.push(6);
		System.out.println("Stack length: " + stack.length());
		System.out.println(stack.isEmpty());
		System.out.println("Top element: " + stack.peek());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Stack Length: " + stack.length());
	}
}