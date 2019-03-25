package LinkedLists;

import LinkedLists.doublyLinkedList.Node;

public class removeDups {
	static Node head;
	public void addNodeEnd(int d) {
		Node n=new Node(d);
		Node last=head;
		if(head==null) {
			head=n;
			head.prev=null;
			head.next=null;
		}
		
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
	public void printList() {
		Node n=head;
		while(n !=null) {
			System.out.print(n.data+"\t");
			n=n.next;
		}
		System.out.println();
		
	}
	
	public void removeDuplicates() {
		Node pointer =head;
		System.out.println("this is the head in remove dups"+head.data);
		Node index;
		
		while(pointer.next !=null) {
			index=pointer;
			while(index.next !=null) {
				if(pointer.data == index.next.data) {
					index.next=index.next.next;
				}
				else {
					index=index.next;		
				}
			}
			pointer=pointer.next;
			
		}
		
	}
	
	public static void main(String[] args) {
		removeDups dll= new removeDups();
		dll.addNodeEnd(3);
		dll.addNodeEnd(7);
		dll.addNodeEnd(4);
		dll.addNodeEnd(3);
		dll.addNodeEnd(2);
		dll.addNodeEnd(1);
		dll.addNodeEnd(7);
		dll.addNodeEnd(2);
		dll.addNodeEnd(8);
		dll.addNodeEnd(1);
		dll.addNodeEnd(9);
		dll.addNodeEnd(10);
		dll.addNodeEnd(13);
		System.out.println("Original List");
		dll.printList();
		dll.removeDuplicates();
		System.out.println("List after removing duplicates");
		dll.printList();
		
		
	}
	

}
