//With n arrays, generate a permutation with an element selected from each array
//{1,2}, {3,4}, {5,6} -> {1,3,5}, {1,3,6}, {1,4,5}.....

public void permutation(ArrayList<int[]> arrays) {
	Stack<Integer> stack = new Stack<Integer>();
	doPermutation(arrays, stack);
}

public void doPermutation(ArrayList<int[]> arrays, Stack<Integer> stack) {
	if (stack.size() == arrays.length) {
		System.out.println(stack);
		return;
	}
	
	int[] array = arrays.get(stack.size());
	
	//push & pop so it keeps the stack size at check
	for(int i=0; i < array.length; i++) {
		stack.push(array[i]);
		doPermutation(arrays, stack);
		stack.pop(array[i]);
	}
}