package LinkedLists;

import LinkedLists.singleLinkedList.Node;

public class reverseLinkedlist {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d) {
			data=d;
		}
	}
	/* PRINT A LINKED LIST */
	public void printList(reverseLinkedlist list, Node head) 
	    { 
	        Node n = list.head; 
	        
	        while (n != null) 
	        { 
	            System.out.print(n.data+"->"); 
	            n = n.next; 
	        } 
	    } 
	/* Delete A Node from LINKED LIST */
	public  void deleteNode(Node head,  int d) {
		Node n=head;
		while(n !=null) {
			if(n.next.data==d) {
				n.next=n.next.next;
				break;
			}
			n=n.next;
		}
		
	}
	/* Add A Node to a LINKED LIST */
	public  void addNode(reverseLinkedlist list, int d) {
		Node newNode=new Node(d);
		if (list.head==null) {
		list.head=newNode;
		newNode.next=null;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public Node reverseList(reverseLinkedlist list) {
		Node prev=null;
		Node curr=list.head;
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;		
			
		}
		return prev;
	}
	
	public static void main(String[] args) {
		reverseLinkedlist list= new reverseLinkedlist();
		list.addNode(list, 1);
		list.addNode(list, 2);
		list.addNode(list, 3);
		list.addNode(list, 4);
		System.out.println("Original list");
		list.printList(list, list.head);
		list.head=list.reverseList(list);
		System.out.println("Reversed list");

		list.printList(list, list.head);


		
		
		
		
		
	}
	
	
}
