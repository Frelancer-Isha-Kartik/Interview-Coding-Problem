package com.StackImplementationUsingArray;

public class StackUsingArray {
	int size;  
	int arr[];  
	private int top;
	public StackUsingArray(int arraySize){
		size = arraySize;
		arr = new int[size];
		top = -1;
	}
	 public void push(int value){
	        if(top==size-1){
	            System.out.println("Stack is full, can't push a value");
	        }
	        else{
	            top=top+1;
	            arr[top]=value;
	        }
	    }
	 public void pop(){
	        if(!isEmpty())
	            top=top-1;
	        else{
	            System.out.println("Can't pop...stack is empty");
	        }
	    }
	 public boolean isEmpty(){
	        return top==-1;
	    }
	 public void display(){

	        for(int i=0;i<=top;i++){
	            System.out.print(arr[i]+ " ");
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		StackUsingArray operate = new StackUsingArray(5);
		operate.push(1);
		operate.push(2);
		operate.push(3);
		operate.push(4);
		operate.push(5);
		operate.display();
		operate.pop();
		operate.pop();
		operate.display();
	}

}
