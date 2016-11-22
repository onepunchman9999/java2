public Node nToLast(int n. Node root) {
	Node curr = root;
	Node follower = root;
	
	for(int i = 0; i < n; i++) {
		if (curr == null) return null;
		curr = curr.next;
	}
	
	while(curr.next != null) {
		curr = curr.next;
		follower = follower.next;
	}
	
	return follower;
}
