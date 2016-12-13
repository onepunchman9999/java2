//called by convert(root, null);

public void convert(Node root, Node previous) {
	if (root == null) {
		return null;
	}
	
	Node current = root;
	if (root.left) {
		convert(current.left);
	}
	
	//current node
	current.left = previous;
	if (previous) {
		previous.right = current;
	}
	
	//update previous
	previous = current;
	
	if (node.right) {
		convert(current.right, previous);
	}
	
}