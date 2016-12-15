//find the length of the longest valid parenthesis substring
// ")()())" should return 4 because of ()()

public int longestParenthesis(String s) {
	Stack<int[]> stack = new Stack<int[]>();
	int result = 0;
	
	for(int i=0; i < s.length() -1; i++) {
		char c = s.charAt(i);
		if (c == '(') {
			// 0 represents ( and 1 represents )
			int[] a = {i, 0};
			stack.push(a);
		} else {
		    //make sure ) can come and should be added to stack only if when the top of stack is also ) or stack can be empty
			if (stack.isEmpty() || stack.peek()[1] == 1) {
				int[] a= {i, 1};
				stack.push(a);
			} else {
				//update the longest for every valid pair of parenthesis
				stack.pop();
				int currentLen = 0;
				
				if (stack.isEmpty) {
					currentLen = i+1;
				} else {
					currentLen = i - stack.peek()[0];
				}
				//check with global max with local max currentlen
				result = Math.max(result, currentLen);
			}			
		}
		
	}
	
	return result;
}
	
	
}