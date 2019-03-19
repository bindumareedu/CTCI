package LinkedLists;

public class simpleLinkedList {
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
	public  void addNode(int d) {
		Node newNode=new Node(d);
		newNode.next=head;
		head=newNode;
		
	}

		
	public static void main(String[] args) {
		simpleLinkedList llist=new simpleLinkedList();
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
		System.out.println("\nList after deleting 3");
		llist.deleteNode(head,3);
		llist.printList();
		System.out.println("\nList after adding 6");
		llist.addNode( 6);
		llist.printList();
	
		
		
		
	}
		
	}


