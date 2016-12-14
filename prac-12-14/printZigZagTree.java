public void print(Node root) {
	Stack stacks[2] = new Stack[2];
	int current = 0;
	int next = 1;
	stacks[current].push(root);

	while(!stacks[current].isEmpty() || !stacks[next].isEmpty()) {
		Node n = stacks[current].pop();
		System.out.print(n.value);

		if (current == 0) {
			if (n.right) {
				stacks[next].push(n.right);		
			}
			if (n.left) {
				stacks[next].push(n.left);			
			}
		} else {
			if (n.left) {
				stacks[next].push(n.left);		
			}
			if (n.right) {
				stacks[next].push(n.right);			
			}
		}

		if (stacks[current].isEmpty()) {
			current = 1 - current;
			next = 1 - next;
            System.out.println("\n");
		}

	}

}
