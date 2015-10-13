
public class BinaryTree {
	Node root;
	
	public void addNode(int key, String name){
		// create a new Node and initialize it
		
		Node newNode = new Node(key, name);
		
		// if there is no root this becomes root
		
		if(root == null){
			root = newNode;
		}
		else{
			// set root as the node we will start 
			// with as we traverse the tree
			
			Node focusNode = root;
			
			// future parent for our new node
			
			Node parent;
			
			while(true){
				// root is the top parent so we start there
				parent = focusNode;
				
				// check if the new node should go on 
				// the left side of the parent node
				
				if(key < focusNode.key){
					// switch focus to the left child
					focusNode = focusNode.leftChild;
					
					// if the left child has no children
					
					if(focusNode == null){
						// then place the new node on the left of it
						parent.leftChild = newNode;
						return; // all done
					}
				}
				else{ // if we get here put the node on the right
					focusNode = focusNode.rightChild;
					
					// if the right child has no children
					if(focusNode == null){
						// then place the new node on the right of it
						
						parent.rightChild = newNode;
						return; // all done
					}
				}
			}
		}
	}
	
	public Node findNode(int key){
		// Start at the top of the tree
		Node focusNode = root;
		
		// While we haven't found the node, keep looking
		
		while(focusNode.key != key){
			// if we should search to the left
			if(key < focusNode.key){
				// shift the focus node to the left child
				focusNode = focusNode.leftChild;
			}
			else{
				// shilft the focuse node to the right child
				focusNode = focusNode.rightChild;
			}
			
			if(focusNode == null){
				return null;
			}
		}
		return focusNode;
	}
	private class Node{
		int key;
		String name;
		
		Node leftChild;
		Node rightChild;
		
		Node(int key, String name){
			this.key = key;
			this.name = name;
		}
		
		public String toString(){
			return name + " has the key " + key;
		}
	}
}
