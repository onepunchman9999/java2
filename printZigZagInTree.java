public void traverse(Node root) {
	Stack[2] stacks = new Stack[2];

	int current = 0;
	int next = 1;
	
	stacks[current].push(root);
	
	while(!stacks[current].isEmpty() || !stacks[next].isEmpty()) {
		Node n = stacks[current].pop();
		System.out.print(n.value);
		
		if (current == 0) {
			if(n.left) {
				stacks[next].push(n.left);
			}
			if(n.right) {
				stacks[next].push(n.right);
			}
		} else {
			//since zigzag, swap the position of left/right
			if(n.right) {
				stacks[next].push(n.right);
			}
			if(n.left) {
				stacks[next].push(n.left);
			}
		}
		
		//empty? add new line and switch
		if (stacks[current].isEmpty()) {
			System.out.print("\n");
			current = 1 - current;
			next = 1 - next;
		}
	}
		
}