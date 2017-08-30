package com.QueuesUsingLinkedList;
import com.datastructure.Node;

public class MyQueue{
	private static Node head = null;
	private static	Node tail = null;
	public void insertnode(Node node) {
		if(head == null) {
			head = tail = node;
			System.out.println("Linked list created successfully with value " + node.data );
		}else {
			tail.next = node;
			tail = node;
			System.out.println(" Node inserted successfully with value "+ node.data );
		}
	}
	public void traverse(Node node){
		while(node != null){
			System.out.print(node.data +" ");
			node = node.next;
		}
	}
	public Node remove(){		
		Node node;
		node= head;
		head = head.next;	
		return node;
	}
	public Node findMiddleNode(Node head)
	{
		Node slowPointer, fastPointer; 
		slowPointer = fastPointer = head; 

		while(fastPointer !=null) { 
			fastPointer = fastPointer.next; 
			if(fastPointer != null && fastPointer.next != null) { 
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next; 
			} 
		} 
		return slowPointer; 
	}
	void reverseLinkedList(Node p){
		if(p.next == null){
			head = p;
			return;
		}
		else{reverseLinkedList(p.next);
		Node q = p.next;
		q.next = p;
		p.next = null;
		}
		while(p != null){
			System.out.println("Reverdsed linkedlist is " + p.data + " ");
			p = p.next;
		}
	}
	public static void main(String[] args) {
		MyQueue nodeTester = new MyQueue();
		//Node head=new Node(5);
		for(int i = 0;i < 5;i++){
			Node node = new Node(i);
			nodeTester.insertnode(node);
		}
		nodeTester.traverse(nodeTester.head);
		System.out.println(" removed "+ nodeTester.remove().data);
		System.out.println(" removed "+ nodeTester.remove().data);
		nodeTester.traverse(nodeTester.head);
		Node middle= nodeTester.findMiddleNode(head);
		System.out.println("Middle node will be: "+ middle.data);
		nodeTester.reverseLinkedList(head);
	}
}

