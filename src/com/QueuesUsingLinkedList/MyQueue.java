package com.QueuesUsingLinkedList;
import com.datastructure.Node;

public class MyQueue{
	private Node head = null;
	private	Node tail = null;
	void insertnode(Node node) {
		if(head == null) {
			head = tail = node;
			System.out.println("Linked list created successfully with value " + node.data );
		}else {
			tail.next = node;
			tail = node;
			System.out.println(" Node inserted successfully with value "+ node.data );
		}
	}
	void traverse(Node node){
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
	public static void main(String[] args) {
		MyQueue nodeTester = new MyQueue();
		for(int i = 0;i < 5;i++){
			Node node = new Node(i);
			nodeTester.insertnode(node);
		}
		nodeTester.traverse(nodeTester.head);
		System.out.println(" removed "+ nodeTester.remove().data);
		nodeTester.traverse(nodeTester.head);
	}
}

