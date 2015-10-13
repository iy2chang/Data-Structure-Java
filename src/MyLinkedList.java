import java.util.Scanner;

public class MyLinkedList {
	
	private class Node{
		int data;
		Node next;
		
		public Node(){
			data = 0;
			next = null;
		}
		public void setNext(Node n){
			next = n;
		}
		public Node getNext(){
			return next;
		}
		public void setData(int d){
			data = d;
		}
		public int getData(){
			return data;
		}
	}
	
	Node head;
	int size;
	
	public MyLinkedList(){
		head = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int getSize(){
		return size;
	}
	

}
