package StacksandQueues;

public class stackLinkedList {
	Node top=null;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	void push(int d) {
		Node n=new Node(d);
		if(top==null) {
			top=n;
			n.next=null;
		}
		else {
			n.next=top;
			top=n;
		}
	}
	int pop() {
		int poppedElement=0;
		if(top==null) {
			throw new IllegalArgumentException("empty Stack");
		}
		else {
			poppedElement=top.data;
			top=null;
			
		}
		return poppedElement;
	}
	
	int peek() {
		return top.data;
	}
	
	Boolean isEmpty() {
		if (top==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		stackLinkedList stack= new stackLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		int peek=stack.peek();
		System.out.println("Popped  element"+peek);
	}
}
