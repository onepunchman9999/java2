//find whether t1 contains t2

boolean containsTree(TreeNode t1, TreeNode t2) {
	if (t2 == null) return true; // empty tree is always a subtree
	return subTree(t1, t2);
}

boolean subTree(TreeNode t1, TreeNode t2) {
	if (t1 == null) return false; //none matched
	
	if (t1.data == t2.data) {
		if (match(t1, t2)) return true;
	}
	
	return subTree(t1.left, t2) || subTree(t1.right, t2);
}

boolean match(TreeNode t1, TreeNode t2) {
	if (t1 == null && t2 == null) return true;
	
	if (t1 == null || t2 == null) return false;
	
	if (t1.data != t2.data) return false;
	
	return match(t1.left, t2.left) && match(t1.right, t2.right);
}

