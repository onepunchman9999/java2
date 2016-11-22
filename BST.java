public class BST {
	
	class Node {
		int item;
		Node left, right;
		
		public Node(int item) {
			this.item = item;
			left = right = null;
		}
	}
	
	
	Node root;
	//gets the top node returned from the helper
	void insert(int val){
		this.root = insertHelper(root, val);
	}
	
	//not the class level root
	void insertHelper(Node root, int val) {
		if (root == null) {
			root = new Node(val);
		} else if (root.item < val) {
			root.right = insertHelper(root.right, val);
		} else {
			root.left = insertHelper(root.left, val);
		}
		return root;
	}
	
	Node search(Node root, int val) {
		if (root == null) return null;
		if (root.item == val)
			return root;
		else if (root.item < val) {
			return search(root.right, val);
		} else {
			return search(root.left, val);
		}		
	}
	
}