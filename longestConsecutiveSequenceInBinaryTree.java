//given binary tree, find its longest consecutive path
//the longest consecutive path needs to be from parent to child

pubilc class BST {
	int max = 0; // keeps track of the max of the max
	
	public int longestConsecutive(Node root) {
		if (root == null) return 0;
		
		int left = longestConsecutive(root.left);
		int right = longestConsecutive(root.right);
		
		int leftSize = 0;
		if (root.left == null) {
			//we add current root
			leftSize = 1;
		} else if (root.left.val-1 == root.val) {
			leftSize =  left + 1;
		} else {
			//it's not consecutive so reset to 1
			leftSize = 1;
		}
		
		int rightSize = 0;
		if (root.right == null) {
			rightSize = 1;
		} else if(root.right.val == root.val +1) {
			rightSize = right + 1;
		} else {
			rightSize = 1;
		}
		
		//make sure we check with global max to find the longest consecutive
		max = Math.max(leftSize, max);
		max = Math.max(rightSize, max);
		return max;	
	}
}