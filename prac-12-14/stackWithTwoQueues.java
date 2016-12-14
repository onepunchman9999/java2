public class Stack {
	public Queue queue1 = new Queue();
	public Queue queue2 = new Queue();	
	
	public void push(int val) {
		if (queue1.isEmpty()) {
			queue2.add(val);		
		} else if (queue2.isEmpty()) {
			queue1.add(val);
		}
	}

	public int pop() {
		Queue nonEmptyQueue;
		nonEmptyQueue = queue1.isEmpty() ? (emptyQueue = queue1; nonEmptyQueue = queue2) : (emptyQueue = queue2; nonEmptyQueue = queue1);
		
		while(nonEmptyQueue.size() > 1) {
			emptyQueue.add(nonEmptyQueue.remove());	
		}
		
		return nonEmptyQueue.remove();
	}


}
