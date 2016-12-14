public Node reverseList(Node root) {
	Node current = root;
	Node pre;
	Node reversedHead;
	while(current) {
		Node next = current.next;
		if (next == null) {
			reversedHead  = current;
			return reversedHead;
		} else {
			current.next = pre;
			pre = current;
			current = next;
		}
	}

}
