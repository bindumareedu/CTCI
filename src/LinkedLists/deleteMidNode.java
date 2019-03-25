package LinkedLists;

import LinkedLists.singleLinkedList.Node;

/* deleting node when given access to that node */


public class deleteMidNode {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	/* PRINT A LINKED LIST */
	public void printList() 
	    { 
	        Node n = head; 
	        while (n != null) 
	        { 
	            System.out.print(n.data+" "); 
	            n = n.next; 
	        } 
	    }
	
	
	
	/* Delete A Node from LINKED LIST */
	public  void deleteNode(Node n) {
		if(head != null) {
		Node temp=head;
		while(temp.next.data != n.data) {
			temp=temp.next;
			
		}
		temp.next=n.next;
		n.next=n.next.next;
		n=n.next;
		}
		else {
			System.out.println("ERROR: Empty linked List");
		}
	}
	/* Add A Node to a LINKED LIST */
	public  void addNode(int d) {
		Node newNode=new Node(d);
		if (head==null) {
		newNode=head;
		newNode.next=null;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}

		
	public static void main(String[] args) {
		deleteMidNode llist=new deleteMidNode();
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		llist.head.next=second;
		second.next=third;
		third.next=four;
		four.next=five;
		five.next=null;
		System.out.println("Original List");
		llist.printList();
		System.out.println("\nList after deleting node with data \""+head.next.next.data+"\"");
		llist.deleteNode(head.next.next);
		llist.printList();
		
	}
		

}
