package doublelinklist;

import algo.linklist.Person;

public class Main {

	public static void main(String[] args) {

		Person p= new Person("vishal", "123");
		Person p1= new Person("shubhi", "456");
		Person p2= new Person("ankita", "789");
		PersonDoubleLinkList pl= new PersonDoubleLinkList(p);
		pl.addItem(p1);
		pl.addItem(p2);
		pl.printAll();
		
		System.out.println("Main.main() going for deletion%%%%%%%%%%%%%%");
		pl.deleteItem(p);
		
		System.out.println("Main.main() printing list AGAIN ################");
		pl.printAll();
	
	}

}
