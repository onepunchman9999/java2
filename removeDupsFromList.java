private class Node {
	private int val;
	private Node next;
}

public List<Integer> remove(Node n) {
	HashSet<Integer> set = new HashSet<Integer>();
	Node pre = null;
	while(n != null) {
		if (set.contains(n.val)) {
			pre.next = n.next;
		} else {
			set.add(n.val);
			pre = n;
        }		  
		n = n.next;
	}	
}

public List<Integer> remove(Node n) {
	while(n != null) {
		Node curr = n.next;
		while (curr.next != null) {
			if (curr.val == n.val) {
				curr.next = curr.next.next;
			} else {
			  curr = curr.next;
			}
		}
		n = n.next;
	}
	
}