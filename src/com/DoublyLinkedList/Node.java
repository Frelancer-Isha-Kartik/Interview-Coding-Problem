package com.DoublyLinkedList;

public class Node {
	public int data;
	public Node next;
	public Node prev;
	public Node(int value){
		this.data = value;
		next = null;
		prev = null;
	}
}
