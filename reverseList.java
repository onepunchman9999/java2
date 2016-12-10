
// null <- a <- b <- c      <- head
public Node reverse(Node n) {
	Node pre = null;
	Node current = n;
	Node head = null;
	
	while(current !=null) {
		//save next pointer of current
		Node next = current.next;
		
		if (next == null) {
			head = current;
		}
		
		//connect
		current.next = pre;
		
		pre = current;
		current = next;
	}
	
	return head;
}