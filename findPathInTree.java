//print all paths where the sum equals the given integer. All nodes from the root to a leaf node must compose a path.

public void findPath(Node root, int expectedSum. LinkedList<Node> path, int currentSum) {
	currentSum += root.value;
	//add
	path.add(root);
	boolean ifLeaf = root.left == null && root.right == null;
	
	if (currentSum == expectedSum && isLeaf) {
		System.out.println(path);
	}
	
	if (root.left) {
		findPath(root.left, expectedSum, path, currentSum);
	}
	
	if (root.right) {
		findPath(root.right, expectedSum, path, currentSum);
	}
	
	//back track
	path.remove(path.size()-1);
	
}