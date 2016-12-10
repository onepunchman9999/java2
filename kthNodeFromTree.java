//in-order traversal
//go all the way to left, if returned target is null, we finished searching for left
//and thus k is always 1. If k is ineed 1, then return target, if not, decrement, and go right

public Node kthNode(Node n, int &k) {
	Node target = null;
	
	if (n.left) {
		target = kthNode(n.left, k);
	}
	
	//check target
	if (target == null) {
		if (k == 1) {
			target = n;
		}
		k--;
	}
	
	//check target, if target is not null, then we found it
	if (target == null && n.right) {
		target = kthNode(n.right, k);
	}
	
	return target;
}