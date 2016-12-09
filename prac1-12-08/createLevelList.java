public List<Integer> createLevelList(Node root) {
	ArrayList<ArrayList<Node>> results = new ArrayList<ArrayList<Node>>();
	
	ArrayList<Node> list = new ArrayList<Node>();
	list.add(root.val);

	while(!list.isEmpty()) {
		results.add(list);
		Node parent = list;
		list = new ArrayList<Node>();
		
		for (Node p : parent) {
			if (p.left) {
				list.add(p.left);
			}

			if (p.right) {
				list.add(p.right);	
			}
		}
	}

	return results;
}
