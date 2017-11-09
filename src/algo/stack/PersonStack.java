package algo.stack;

public class PersonStack {
	private Person[] stack;
	private int top;
	private int size;

	public PersonStack() {
		top = -1;
		size = 32;
		stack = new Person[32];
	}

	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person[size];
	}

	public boolean push(Person item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public Person pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			return null;
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
