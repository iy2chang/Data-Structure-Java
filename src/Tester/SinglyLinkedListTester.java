package Tester;

import DataStructures.SinglyLinkedList;

public class SinglyLinkedListTester {
	public static void main(String[] args){
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		sll.add(1);
		sll.add(2);
		sll.add(3);
		sll.add(4);
		System.out.println("size is : " +sll.getSize());
		sll.deleteAfter(2);
		sll.traverse();
		sll.front();
	}
}
