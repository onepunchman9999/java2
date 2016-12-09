public void nToLast(int n) {
	Node p = head;
	while(n>0) p = p.next;
	Node n = head;
	while(p.next !=null) {
		n = n.next;
		p = p.next;
	}
	return n;
}
