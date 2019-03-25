package LinkedLists;

import LinkedLists.reverseLinkedlist.Node;

public class LinkedListPalindrome {
	Node head;
	Node middle;
	Node midPrev;
	int halfLen=0;
	
	class Node{
		int data;
		Node next;
		Node(int d) {
			data=d;
		}
	}
	/* PRINT A LINKED LIST */
	public void printList(LinkedListPalindrome list, Node start) 
	    { 
	        Node n = start; 
	        
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
	public  void addNode(LinkedListPalindrome list, int d) {
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
	
	/* find middle */
	public void middle(LinkedListPalindrome list) {
		Node n= list.head;
		int len=1;
		int mid;
		while(n.next !=null) {
			n=n.next;
			len++;
		}
		if(len%2==0) {
			mid=(len/2)+1;
			n=list.head;
			int count=1;
			while(count!=mid) {
				if(count+1==mid) {
					list.midPrev=n;
				}
				n=n.next;
				count++;
				
			}
		}
		else {
			mid=(len+1)/2;
			n=list.head;
			int count=1;
			while(count!=mid+1) {
				if(count+1==mid) {
					list.midPrev=n;
				}
				n=n.next;
				count++;
				
			}
		}
		
		list.middle=n;	
		list.halfLen=mid;
	}
	
	/*check Palindrome*/
	
	public Boolean checkPalindrome(LinkedListPalindrome list, Node start, Node mid) {
		int count=1;
		Boolean flag=true;
		while(count !=list.halfLen) {
			if(start.data==mid.data) {
				start=start.next;
				mid=mid.next;
				count++;
			}
			else
			{
			
				flag=false;
				break;
			}
		}
		return flag;
		
	}
	
	
	public Node reverseList(LinkedListPalindrome list, Node n) {
		Node prev=null;
		Node curr=n;
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;		
			
		}
		return prev;
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedListPalindrome list= new LinkedListPalindrome();
		list.addNode(list, 1);
		list.addNode(list, 2);
		list.addNode(list, 3);
     	list.addNode(list, 2);
		list.addNode(list, 1);

		System.out.println("Original list");
		list.printList(list, list.head);
		list.middle( list);
		//System.out.println("Reversed list");
		list.middle=list.reverseList(list, list.middle);
		//list.printList(list, list.middle);
		Boolean result=list.checkPalindrome(list, list.head, list.middle);
		System.out.println("\nIs the linked list palindrome?\t"+result);
		//list.printList(list, list.head);
		
	}
	
	
	
}
