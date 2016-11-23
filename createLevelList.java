public ArrayList<LinkedList> createLevelList(Node root) {
	List results = new ArrayList<LinkedList>();
	List current = new ArrayList();

	if (root != null) {
		current.add(root);
	}

	while(current.size() > 0) {
		results.add(current);
		List parents = current;
		current = new LinkedList();
		
		for(Node p: parents) {
			if (p.left) {
				current.add(p.left);
			}
		
			if (p.right) {
				current.add(p.right);
			}
		}
	}
	
	return resutls;
}

            0             p:0, current: [1,2]
		1       2         p [1,2], current: [3,4, 5,6]
	  3    4  5    6