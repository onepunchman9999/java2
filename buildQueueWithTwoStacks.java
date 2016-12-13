public class Queue {
	public Stack<Integer> stack1 = new Stack<Integer>();
	public Stack<Integer> stack2 = new Stack<Integer>();
	
	public void enque(Integer val) {
		stack1.push(val);
	}
	
	public Integer dequeue() {
		//make sure stack2 size is 0 before adding to maintain order
		//if so, add to stack2 from stack1 
		if (stack2.size() == 0) {
			while(stack1.size() > 0) {
				stack2.push(stack1.pop());
			}
		}
		
		if (stack2.size() == 0) return new Exception("Queue is empty");
		
		return stack2.pop();
	}
	
}