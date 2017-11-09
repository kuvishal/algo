package algo.stack;

public class Main {

	public static void main(String[] args) {
		/*IntStack stack = new IntStack();
		for(int i=0;i<50;i++){
			stack.push(i);
		}
		System.out.println("Main.main() is Full "+stack.isFull());
		System.out.println("Main.main() pop "+stack.pop());
		System.out.println("Main.main() pop "+stack.pop());
		System.out.println("Main.main() pop "+stack.pop());
		System.out.println("Main.main() pop "+stack.pop());*/
		
		PersonStack perStack= new PersonStack();
		Person p= new Person("Abc", "1");
		Person p1= new Person("XYZ", "2");
		perStack.push(p);
		perStack.push(p1);
		System.out.println("Main.main() 1st pop "+perStack.pop());
		System.out.println("Main.main() 2nd pop "+perStack.pop());
		System.out.println("Main.main() 3rd pop "+perStack.pop());
	}
}
