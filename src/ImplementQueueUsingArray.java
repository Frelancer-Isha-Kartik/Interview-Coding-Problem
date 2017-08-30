
public class ImplementQueueUsingArray { 
	private static final int capacity = 3;  
	int arr[] = new int[capacity];  
	int size = 0;  
	int front = -1;  
	int rear = 0;  

	public void push(int pushedElement) {  
		if (front < capacity-1) {  
			front++;  
			arr[front] = pushedElement;  
			display();  
		}   
	}  

	public void pop() {  
		if (front >= rear) {  
			rear++;  
			System.out.println("Pop operation done !");  
			display();  
		}   
	}  

	public void display() {  
		if (front >= rear) {  
			System.out.println("Elements in Queue : ");  
			for (int i = rear; i <= front; i++) {  
				System.out.print(arr[i] + " ");  
			}  
		}  
	}  

	public static void main(String[] args) {  
		ImplementQueueUsingArray queue = new ImplementQueueUsingArray();   
		queue.push(23);  
		queue.push(2);  
		queue.push(73);  
		queue.pop();  
		queue.pop();  
		queue.pop();  
		queue.pop();  
	}  

}  

