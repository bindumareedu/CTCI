package StacksandQueues;

import StacksandQueues.stackLinkedList.Node;

public class queueLinkedList {
	Node start;
	Node end;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	void enqueue(int d) {
		Node n=new Node(d);
		if(start==null) {
			start=n;
			start.next=end;
		}
		else {
			Node temp=start;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=n;
			end=n;
			end.next=null;
		}
	}
	int dequeue() {
		int poppedElement=0;
		if(end==null) {
			throw new IllegalArgumentException("No elements in Queue");
		}
		else {
			poppedElement=end.data;
			end=null;
			
		}
		return poppedElement;
	}
	
	int peek() {
		return end.data;
	}
	
	Boolean isEmpty() {
		if (end==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		queueLinkedList queue= new queueLinkedList();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);

		int pop=queue.dequeue();
		System.out.println("Popped  element 1 \t"+pop);
		queue.enqueue(5);
		int pop2=queue.dequeue();
		System.out.println("Popped  element2 \t"+pop2);


	}
}

