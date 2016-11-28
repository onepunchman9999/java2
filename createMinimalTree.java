TreeNode createMinimalTree(int[] arr, int left, int right) {
	if (right < left) return null;
	
	int mid = (left + right) / 2;
	TreeNode n = new TreeNode(arr[mid]);
	
	n.left = createMinimalTree(arr, left, mid-1);
	n.right = createMinimalTree(arr, mid+1, right);
	
	return n;
}

TreeNode create(int[] array) {
	return createMinimalTree(arr, 0, array.length);
}