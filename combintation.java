//combination
//given string abc -> a, b, c, ab, ac, bc, abc

public void combination(String str) {
	Stack<Character> stack = new Stack<Character>();
	for(int i=1; i <=str.length; i++) {
		doCombination(i, 0, str, stack);
	}
}

//it's better to decrement length since we want to either use or ignore it
public void doCombination(int length, int index, String str, Stack<Character> stack) {
	//base case for using
	if (length == 0) {
		System.out.println(stack);
		return;
	}
	
	//base case for not using
	if(index == str.length) {
		return;
	}
	
	//use it
	stack.push(str[index]);
	doCombination(length-1, index+1, str, stack);
	stack.pop(str[index]);
	
	//dont use it
	doCombination(length, index+1, str, stack);
}