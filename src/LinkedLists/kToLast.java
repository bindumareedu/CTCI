package LinkedLists;

public class kToLast {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public void printList(int k) {
		Node n=head;
		int counter=0;
		if(head != null)
		{
			while(n.next != null && k !=counter)
			{
				counter++;
				n=n.next;
					
			}
			while (n.next !=null) {
				System.out.println(n.data);
				n=n.next;
			}
		}
		
	}
	/* Add A Node to a LINKED LIST */
	public  void addNode(int d) {
		Node newNode=new Node(d);
		if (head==null) {
		head=newNode;
		head.next=null;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}

	
	public static void main(String[] args) {
		kToLast list = new kToLast();
		list.addNode(0);
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		int k=3;
		list.printList(k);
		
		
	}

}
