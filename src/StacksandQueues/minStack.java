package StacksandQueues;

import StacksandQueues.stackLinkedList.Node;

public class minStack {

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
			if(top.data<n.data) {
				int temp=pop();
				push(n.data);
				push(temp);
				
			}
			else {
			n.next=top;
			top=n;
			}
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
		minStack stack= new minStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		int pop=stack.pop();
		System.out.println("Popped  element"+pop);
	}
}

