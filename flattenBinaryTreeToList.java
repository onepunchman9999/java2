//     1
//   2   5
//  3 4

// stack: 5
//       1
//  null    2
//         3   4

//stack 4, 5
//        1 
//    null  2
//      null   3

//stack: 5, leftchild of 3 is null and p points to 3
//        1 
//    null  2
//      null   3
//         null   4

public void flatten(Node root) {
	Stack<Node> stack = new Stack<Node>();
	Node p = root;
	
	while(p != null || !stack.isEmpty()) {
		if (p.right) {
			stack.push(p.right);
		}
		
		//p.right always points to end of on-going pointer
		//p.left should never point to null because it disconnects the list. If it is null, consult with stack
		if (p.left != null) {
			p.right = p.left;
			//make sure we set left child as null since we want a list
			p.left = null;
		} else if (!stack.isEmpty) { 
			//p.left is null. so restore some from stack we earlier saved for the right child in order
			Node temp = stack.pop();
			p.right = temp;
			
		}
		p = p.right;
	}
}