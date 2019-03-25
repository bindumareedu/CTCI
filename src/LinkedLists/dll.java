package LinkedLists;

import LinkedLists.doublyLinkedList.Node;

public class dll {
	static Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data=d;
		}
	}
	
	public void printList() {
		Node n=head;
		while(n !=null) {
			System.out.print(n.data+"\t");
			n=n.next;
		}
		System.out.println();
		
	}
	public void addNodeBegin(int d) {
		Node n= new Node(d);
		n.next=head;
		n.prev=null;
		if (head.prev ==null)
			head.prev=n;
		head=n;
		
	}
	public void addNodeEnd(int d) {
		Node n=new Node(d);
		Node last=head;
		if(head.next==null) {
			head.next=n;
			n.prev=head;
			n.next=null;
		}
		else {
			while(last.next != null) {
				last=last.next;
			}
			if(last.next==null) {
				last.next=n;
				n.prev=last;
				n.next=null;
			}
		}
		
	}
	
	public void addNodeAfter(Node prevNode, int d) {
		Node newNode=new Node(d);
		
		if(prevNode.next!=null) {
			newNode.next=prevNode.next;
			prevNode.next=newNode;
			newNode.prev=prevNode;
		}
		else {
			prevNode.next=newNode;
			newNode.prev=prevNode;
			newNode.next=null;
		}
		
		
		
	}


}
