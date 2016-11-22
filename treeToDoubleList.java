//tree to double circular list


public Node concatenate(Node a, Node b) {
	if (a == null) return b;
	if (b == null) return a;
	//x.left points to end - circular list
	//save
	Node aEnd = a.left;
	Node bEnd = b.left;
	
	a.left = bEnd;
	bEnd.right = a;
	aEnd.right = b;
	b.left = aEnd;
	
	return n;
}


public Node treeToList(Node n) {
	if (n == null) return n;
	
	Node left = treeToList(n.left);
	Node right = treeToList(n.right);
    
    n.left = n;
    n.right = n;
    
    n = concatenate(left, n);
    n = concatenate(n, right);
    return n;	
	
}