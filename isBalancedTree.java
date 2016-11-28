public int getHeight(TreeNode root) {
	if (root == null) return 0;
	return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
}

public boolean isBalaned(TreeNode root) {
	if (root == null) return true; //base - each level of node must be not larger than one
	
	int left = getHeight(root.left);
	int right = getHeight(root.right);
	
	if (Math.abs(left - right) > 1) return false;
	
	return isBalanced(root.left) && isBalanced(root.right);
}