public void find(int expectedSum, int currentSum, List<Node> path, Node root) {
	if (root == null) return;
	
	boolean isLeaf = root.left == null && root.right == null;
	int sum = currentSum + root.val;

	path.add(root);	
	if (expectedSum == sum && isLeaf) {
		System.out.println(path);
	}

	find(expectedSum, sum, path, root.left);
	find(expecteSum, sum, path, root.right);
	path.remove(path.size() -1);
}
