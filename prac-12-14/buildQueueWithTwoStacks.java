public class Queue {
	public Stack stack1 = new Stack();
	public Stack stack2 = new Stack();

	public void enqueue(int val) {
		stack1.push(val);
	}

	public int dequeue() {
		if (stack2.size() ==  0) {
			while(stack1.size() > 0) {
				stack2.push(stack1.pop());
			}
		}

		if (stack2.size() ==0) return new Exception("Queue is empty");

		return stack2.pop();
	}

}
