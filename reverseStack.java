//traverse from the bottom of stack and insert at the bottom

public void insertAtBottom(Stack<Integer> stack, int x) {
	if (stack.isEmpty()) {
		stack.push(x);
		return;
	}
	
	int temp = stack.pop();
	insertAtBottom(stack, x);
	stack.push(temp);
	
}

public Stack<Integer> reverse(Stack<Integer> stack) {
	if (stack.isEmpty()) return stack;
	int temp = stack.pop();
	reverse(stack);
	insertAtBottom(stack, temp);
    return stack;
}



public void reverse(Stack stack) {
	if (stack.isEmpty()) {
		return;
	}
	
	int x = stack.pop();
	reverse(stack);
	insertAtBottom(stack, x);
}


public void insertAtBottom(Stack stack, int x) {
	if (stack.isEmpty()) {
		stack.push(x);
		return;
	}
	
	int temp = stack.pop();
	insertAtBottom(stack, x);
	stack.push(temp);
}