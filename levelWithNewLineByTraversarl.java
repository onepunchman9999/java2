public void traverseWithNewLine(Node root) {
	if (root == null) return;
	
	List queue = LinkedList<Node>();
	queue.add(root);
	int count = 1;
	int parent = 0;
	
	while(queue.size() > 0) {
		Node n = queue.remove();
	
		System.out.print(n.value);
		
		if(n.left) {
			queue.add(n.left);
			parent++;
		}
		
		if(n.right) {
			queue.add(n.right);
			parent++;
		}
		
		count--;
		
		if (count == 0) {
			System.out.print("\n");
			count = parent;
			parent = 0;
		}
	}
	
	
}