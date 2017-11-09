package algo.stack;

public class Person {
	
	private String name;
	private String rollNum;
	public Person(String name, String rollNum) {
		super();
		this.name = name;
		this.rollNum = rollNum;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", rollNum=" + rollNum + "]";
	}
	

}
