public void convert(Node root, Node pre) {
	if (root == null)	return;
	
	Node current = root;
	if (current.left) {
		convert(current.left, pre);
	}
	
	current.left = pre;

	if (pre!=null) {
		pre.right = current;	
	}
	pre = current;
	
	if (current.right) {
		convert(current.right, pre);	
	}
}
