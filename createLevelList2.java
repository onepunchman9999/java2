ArrayList<LinkedList> createLevelList2(TreeNode root) {
	ArrayList<LinkedList> results = new ArrayList<LinkedList>();
	LinkedList current = new LinkedList();
	
	current.add(root);
	
	while(current.size() > 0) {
		LinkedList parent = current;
		results.add(current);
		current = new LinkedList();
		
		for(TreeNode p: parent) {
			if (p.left) {
				current.add(p.left);
			)
			
			if (p.right) {
				current.add(p.right);
			}	
		}
	}
	
	return results;
}