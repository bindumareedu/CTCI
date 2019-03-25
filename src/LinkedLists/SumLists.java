package LinkedLists;

import LinkedLists.singleLinkedList.Node;

public class SumLists {
	 Node head;
	 
	 class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	/* PRINT A LINKED LIST */
	public void printList(SumLists list, Node head) 
	    { 
	        Node n = head; 
	        
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
	public  void addNode(SumLists list, int d) {
		Node newNode=new Node(d);
		if (list.head==null) {
		newNode=list.head;
		newNode.next=null;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	private static String addStrings(String str1, String str2) {
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		System.out.println("This is num "+str1);
		int sum=num1+num2;
		String total= ""+sum;
		
		
		return total;
	}
	private static String toString(SumLists list) {
		String str="";
		Node n=list.head;
		if(n!=null) {
		while(n != null) {
			System.out.println("Value of n.data"+n.data);
			str+=n.data;
			n=n.next;
			
		}
		return str;
		}
		else {
			return null;
		}
	}

	

		
	public static void main(String[] args) {
		SumLists list1=new SumLists();
		list1.head = list1.new Node(7);
		list1.addNode(list1,1);
		list1.addNode(list1,6);
		SumLists list2=new SumLists();
		list2.head = list2.new Node(5);
		list2.addNode(list2,9);
		list2.addNode(list2,2);
		System.out.println("This is list 1");
		list1.printList(list1, list1.head);
		System.out.println("This is list 2");
		list2.printList(list2,list2.head);

		String str1= toString(list1);
		System.out.println("this is string1 \t"+str1);
		String str2= toString(list2);
		System.out.println("this is string2 \t"+str2);
		String sum= addStrings(str1,str2);
		System.out.println("this is the sum \t"+sum);
		SumLists sumList=new SumLists();
		sumList.head = sumList.new Node(Character.getNumericValue(sum.charAt(sum.length()-1)));
		for(int i=sum.length()-2; i>=0;i--)
		{
			sumList.addNode(sumList, Character.getNumericValue(sum.charAt(i)));
			System.out.println(sum.charAt(i));
		}
		System.out.println("List containing the sum of two lists");
		sumList.printList(sumList, sumList.head);
		
		
		
		
	}
	
}
