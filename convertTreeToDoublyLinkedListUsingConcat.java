//convert binary tree to doubly linked list

public class NodePair {
	Node head;
	Node tail;
	
	public NodePair(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}
}

public void concat(Node a, Node b) {
	a.node2 = b;
	b.node1 = a;
}

public NodePair convert(Node root) {
	if (root == null) {
		return null;
	}
	
	NodePair left = convert(root.left);
	NodePair right = convert(root.right);
	
	if (left != null) {
		concat(left.tail, root);
	}
	
	if (right != null) {
		concat(root, right.head);
	}
	
	return new NodePair(
		(left == null) ? root : left.head,
		(right == null) ? root: right.tail
	);
}
