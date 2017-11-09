package algo.linklist;

public class Main {
	
	public static void main(String[] args) {
		Person p= new Person("vishal", "123");
		Person p1= new Person("shubhi", "456");
		Person p2= new Person("ankita", "789");
		PersonLinkList pl= new PersonLinkList(p);
		pl.addItem(p1);
		pl.addItem(p2);
		pl.printAll();
	}
	

}
