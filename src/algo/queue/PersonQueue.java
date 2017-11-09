package algo.queue;

import java.util.Queue;

public class PersonQueue {
	
	private int size;
	private int total;
	private int front;
	private int rear;
	private Person[] q;
	
	public PersonQueue() {
		size = 32;
		q = new Person[32];
	}

	public PersonQueue(int size) {
		this.size = size;
		q = new Person[size];
	}

	public boolean enqueue(Person item){
		if(isFull()){
			return false;
		}else{
			total++;
			q[rear]=item;
			rear=(rear+1)%size;
			return true;
		}
	}
	
	
	public Person dequeue(){
		Person item=q[front];
		total--;
		front=(front+1)%size;
		return item;
	}
	public boolean isFull(){
		if(size==total){
			return true;
		}else{
			return false;
		}
	}
	
	public void showAll(){
		int f=front;
		if(total!=0){
			for (int i = 0; i <total; i++) {
				System.out.println("PersonQueue.showAll() "+q[f]);
				f=(f+1)%size;
			}
		}
	}


}
