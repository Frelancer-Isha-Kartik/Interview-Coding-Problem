package com.Stacks;
import com.datastructure.Node;

public class StackImplementationUsingLinkedList{
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
		Node node = head;
	    Node deleted = tail;
		while(node.next.next != null){
			node= node.next;
		}
		node.next = null;
		tail = node;
		return deleted;
	}
	public static void main(String[] args) {
		StackImplementationUsingLinkedList nodeTester = new StackImplementationUsingLinkedList();
		for(int i = 0;i < 5;i++){
			Node node = new Node(i);
			nodeTester.insertnode(node);
		}
		nodeTester.traverse(nodeTester.head);
		System.out.println(" removed "+ nodeTester.remove().data);
		nodeTester.traverse(nodeTester.head);
	}
}

