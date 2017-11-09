package algo.stack;

public class IntStack {

	private int[] stack;
	private int top;
	private int size;

	public IntStack() {
		top = -1;
		size = 32;
		stack = new int[32];
	}

	public IntStack(int size) {
		top = -1;
		this.size = size;
		stack = new int[size];
	}

	public boolean push(int item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public int pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			return -1;
		}
	}

	public boolean isEmpty() {
		return stack.length == 0;
	}

	public boolean isFull() {
		return top == stack.length - 1;
	}
	public int size() {
		return stack.length;
	}
}
