package doublelinklist;

import algo.linklist.Person;

public class PersonDoubleLinkList {
	private Node head;
	
	public PersonDoubleLinkList(Person item){
		head= new Node();
		head.value=item;
		head.next=null;
		head.prev=null;
	}
	
	public boolean addItem(Person p){
		Node n= new Node();
		Node new_node=head;
		while(new_node.next!=null){
			new_node=new_node.next;
		}
		n.value=p;
		n.next=null;
		new_node.next=n;
		n.prev=new_node;
		return true;
	}
	class Node{
		private Person value;
		private Node next;
		private Node prev;
		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
		
		
	}
	
	public void printAll(){
		Node n= head;
		if(n==null){
			System.out.println("PersonDoubleLinkList.printAll() LIST EMPTY");
		}
		while(n!=null){
			System.out.println("PersonDoubleLinkList.printAll() n value "+n);
			System.out.println("PersonDoubleLinkList.printAll() n prev "+n.prev);
			System.out.println("PersonDoubleLinkList.printAll() n  next "+n.next);
			n=n.next;
		}
	}
	
	public boolean deleteItem(Person p) {
		if (head.value.equals(p)) {
			head = head.next;
			if(head!=null){
			head.prev=null;
			}
			return true;
		} else {
			Node x = head;
			Node y = head.next;
			while (true) {
				if (y == null || y.value.equals(p)) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}

			if (y != null) {
				x.next = y.next;
				y.next.prev=x;
				return true;
			} else {
				return false;
			}
		}
	}


}
