package day4;

public class Stack {
	private int[] data;
	private int top;

	public Stack() {
		data = new int[10];
		top = -1;
	}

	public void push(int value) {
		if (top < 10 - 1) {
			data[++top] = value;
		} else {
			System.out.println("Stack is full. Cannot push " + value);
		}
	}

	public int pop() {
		if (top > -1) {
			return data[top--];
		} else {
			System.out.println("Stack is empty. Cannot pop.");
			return -1;
		}
	}

	public int peek() {
		if (top > -1) {
			return data[top];
		} else {
			System.out.println("Stack is empty. Cannot peek.");
			return -1;
		}
	}

	public int length() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}