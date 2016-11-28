boolean covers(TreeNode root, TreeNode n) {
	if (root == null) return true;
	
	if (root == n) return true;
	
	return covers(root.left, n) || covers(root.right, n);
}

TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
	if (root == null) return null;
		
	boolean pLeft = covers(root.left, p);
	boolean qLeft = covers(root.left, q);
	
	if (pLeft != qLeft) return root;
	
	return pLeft == true ? commonAncestorHelper(root.left, p, q) : commonAncestorHelper(root.right, p, q);
}