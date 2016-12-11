public void traverse(Node root) {
	if (root == null) return;
	
	List queue = LinkedList<Node>();
	queue.add(root);
	
	while(queue.size() > 0) {
		Node n = queue.remove();
		
		System.out.println(n.value);
		
		if(n.left) {
			queue.add(n.left);
		}
		
		if(n.right) {
			queue.add(n.right);
		}
	}
	
	
}