package com.DoublyLinkedList;

public class NodeTester {
	int size =0;
	Node head = null;
	Node tail = null;
 public Node insertAtStart(Node node){
	 System.out.println("Adding Node " + node.data + " at the start");
	 if(size == 0){
		 head = tail = node;
	 }else{
		 node.next = head;
		 head.prev = node;
		 head = node;
	 }
	 size++;
	 System.out.println(node.data + " inserted successfully");
	 return node;
 }
 public Node insertAtEnd(Node node){
     System.out.println("Adding Node " + node.data + " at the End");
     if(size==0){
         head = tail = node;
     }else{ 
         tail.next = node;
         node.prev = tail;
         tail =node;
     }
     size++;
     System.out.println(node.data + " inserted successfully");
     return node;
 }
 public void deleteFromStart(){
     if(size==0){
         System.out.println("\nList is Empty");
     }else{
         System.out.println("\ndeleting node " + head.data + " from start");
         head = head.next;
         size--;
     }
 }
 public void print(){
     Node temp = head;
     System.out.print("Doubly Linked List: ");
     while(temp.next!=null){
         System.out.print(" " + temp.data);
         temp = temp.next;
     }
     System.out.println();
 }
	public static void main(String[] args) {
		NodeTester n = new NodeTester();
		Node node1 = new Node(4);
		Node node2 = new Node(5);
		Node node3 = new Node(6);
		n.insertAtStart(node1);
		n.insertAtEnd(node2);
		n.insertAtEnd(node3);
        n.deleteFromStart();
        n.print();
	}

}
