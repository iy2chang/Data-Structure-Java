package DataStructures;
// myStack class shows how to implement a stack data structure using array
public class MyStack {
	private int size;	// size of the stack
	private int[] stack;	// array stack implementation
	private int top;	// this give you the top of stack
	
	// constructor for stack
	public MyStack(int s){
		this.size = s;
		stack = new int[s];
		top = -1;
	}
	// push
	public void push(int data){
		stack[++top] = data;
	}
	// pop
	public int pop(){
		return stack[top--];
	}
	// peek
	public int peek(){
		return stack[top];
	}
	// isEmpty
	public boolean isEmpty(){
		return top == -1;
	}
	// isFull
	public boolean isFull(){
		return (top == size-1);
	}
	
	public static void main(String[] args){
		MyStack ms = new MyStack(5);
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.push(5);
		
		// printing out what's in the stack
		while(!ms.isEmpty()){
			int val = ms.pop();
			System.out.println(val);
		}
	}
}
