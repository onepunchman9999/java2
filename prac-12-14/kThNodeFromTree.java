public Node kthNode(Node root, int k) {
	Node target = null;

	if (root.left) {
		target = kthNode(root.left, k);
		//returns null from the all the way bottom left
	}

	if (target == null) {
		//going up, decrement by 1 also check on the right while going up
		if (k==1) {
			target = root;		
		}
		k--;
	}

	if (target == null && n.right) {
		target = kthNode(root.right, k);
	}

	return target;
}
