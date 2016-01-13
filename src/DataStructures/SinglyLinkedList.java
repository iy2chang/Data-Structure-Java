package DataStructures;

public class SinglyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int count = 0;

	// add a node to the end of the list
	public void add(T element){
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("Adding: " + element);

		/**
		 * check if the list is empty
		 */

		if(head == null){
			// since there's only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		}
		else{
			// set current tail next link to new node
			tail.setNext(nd);
			tail = nd;
		}
		count++;	// increase the number of node in linked list
	}
	
	public void addAfter(T element, T after){
		Node<T> tmp = head;
		Node<T> refNode = null;
		System.out.println("Traversing to all nodes...");
		/**
		 * Traverse till given element
		 */
		while(true){
			if(tmp == null){
				break;
			}
			if(tmp.compareTo(after) == 0){
				// found the target node, add after this node
				refNode = tmp;
				break;
			}
			tmp = tmp.getNext();
		}
		if(refNode != null){
			// add element after the target node
			Node<T> nd = new Node<T>();
			nd.setValue(element);
			nd.setNext(tmp.getNext());
			if(tmp == tail){
				tail = nd;
			}
			tmp.setNext(nd);
			count++;
		}
		else{
			System.out.println("Unable to find the given element.");
		}
	}
	
	// delete head 
	public void deleteFront(){
		if(head == null){
			System.out.println("Empty List");
		}
		else{
			Node<T> tmp = head;
			head = tmp.getNext();
			if(head == null){
				tail = null;
			}
			System.out.println("Deleted: " + tmp.getValue());
			count--;
		}
	}
	
	public void deleteAfter(T after){
		Node<T> tmp = head;
		Node<T> refNode = null;
		System.out.println("Traversing to all nodes...");
		/**
		 * Traverse till given element
		 */
		
		while(true){
			if(tmp == null){
				break;
			}
			if(tmp.compareTo(after) == 0){
				// found the target node, delete after this node
				refNode = tmp;
				break;
			}
			tmp = tmp.getNext();
		}
		if(refNode != null){
			tmp = refNode.getNext();
			refNode.setNext(tmp.getNext());
			if(refNode.getNext() == null){
				tail = refNode;
			}
			System.out.println("Deleted: " + tmp.getValue());
			count--;
		}
		else{
			System.out.println("Unable to find the given element...");
		}
	}
	// traverse through the linked list
	public void traverse(){
		Node<T> tmp = head;
		while(true){
			if(tmp == null){
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNext();
		}
	}

	public int getSize(){
		return count;
	}
	
	public void front(){
		if(head == null){
			System.out.println("Sorry, the Linked list is empty.");
			
		}
		else{
			System.out.println("The front value is: " + head.value + "."); 
		}
	}
	class Node<T> implements Comparable<T>{

		private T value;
		private Node<T> next;

		public T getValue(){
			return value;
		}

		public void setValue(T value){
			this.value = value;
		}

		public Node<T> getNext(){
			return next;
		}

		public void setNext(Node<T> next){
			this.next = next;
		}
		@Override
		public int compareTo(T arg0) {
			if(arg0 == this.value){
				return 0;
			}
			else{
				return 1;
			}

		}

	}
}
