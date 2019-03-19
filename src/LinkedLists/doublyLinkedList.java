package LinkedLists;

public class doublyLinkedList {
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

	

public static void main(String[] args) {
	doublyLinkedList dll= new doublyLinkedList();
	dll.head=new Node(1);
	dll.head.prev=null;
	Node second= new Node(2);
	dll.head.next= second;
	second.prev=head;
	second.next=null;
	System.out.println("****** Original List *****");
	dll.printList();
	dll.addNodeBegin(3);
	System.out.println("****** Add Node to the Head*****");
	dll.printList();
	dll.addNodeEnd(4);
	System.out.println("****** Add Node at the End*****");
	dll.printList();
	dll.addNodeAfter(dll.head.next.next, 6);
	System.out.println("****** Add Node after "+dll.head.next.next.data+" the End*****");
	dll.printList();
	


}

}
