public class Node {
	int val;
	Node next;
}

public List<Node> removeDupbs(Node n) {
	HashSet<Integer> set = new HashSet<Integer>();

	Node pre = null;
	while(n != null) {
		if (set.contains(n.val())) {
			pre.next = n.next;
		} else {
			set.add(n.val);
			pre = n;
		}

		n = n.next;
	}
}

public List<Node> removeDups(Node n) {
	
	Node pre = null;	
	while(n != null) {
		Node p = n.next;
		//p.next is set when the val is same so check
		while(p.next!=null) {
			if (n.val == p.val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		n = n.next
	}


}
