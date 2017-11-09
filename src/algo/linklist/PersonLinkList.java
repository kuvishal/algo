package algo.linklist;

public class PersonLinkList {

	
	private Node head;
	
	public PersonLinkList(Person item){
		head= new Node();
		head.value=item;
		head.link=null;
	}
	
	public boolean addItem(Person p){
		Node n= new Node();
		Node new_node=head;
		while(new_node.link!=null){
			new_node=new_node.link;
		}
		n.value=p;
		n.link=null;
		new_node.link=n;
		return true;
	}
	class Node{
		private Person value;
		private Node link;
		
	}
	
	public void printAll(){
		Node n= head;
		while(n!=null){
			System.out.println("PersonLinkList.printAll() n value "+n.value);
			n=n.link;
		}
	}
	
	public boolean deleteItem(Person p) {
		if (head.value.equals(p)) {
			head = head.link;
			return true;
		} else {
			Node x = head;
			Node y = head.link;
			while (true) {
				if (y == null || y.value.equals(p)) {
					break;
				} else {
					x = y;
					y = y.link;
				}
			}

			if (y != null) {
				x.link = y.link;
				return true;
			} else {
				return false;
			}
		}
	}
}
