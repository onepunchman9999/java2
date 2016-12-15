//Given binary tree, find minimum depth
//the minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node
//      1
//    2   3
//       5    7
//the minimum depth is 2 



public int minDepth(Node root) {
	if (root == null)	return 0;
	
	int left = minDepth(root.left);
	int right = minDepth(root.right);
	
	//current root is root and check returns from child recursive
	//if both childnodes are null, it does not matter whether it is right/left +1.
	//however if one child is null, make sure to return the other from recursive call plus 1 (current root)
	
	if (root.left == null) {
		return right + 1;
	} else if (root.right == null) {
		return left + 1;
	}
	
	//both children are not null so make sure add 1 by taking a minimum
	return Math.min(left, right) +1;
	
	
}