public class Stack {
	//figure out non-empty queue. 
	//add to non-empty since we will move all elements from non-empty to empty except for one last
	public void push(Integer val) {
		Queue nonEmptyQueue;
		if (queue1.size() > 0) {
			nonEmptyQueue = queue1;
		} else {
			nonEmptyQueue = queue2;
		}
		nonEmptyQueue.add(val);
	}
	
	//figure out empty or non-empty queue. 
	//move all elements except for the last one to empty queue
	//remove the one last element from non-empty
	//at the end, empty and non-empty queue is left
	public Integer pop() {
		Queue emptyQueue;
		Queue nonEmptyQueue;
		if (queue1.size() == 0) {
			emptyQueue = queue1;
			nonEmptyQueue = queue2;
		} else {
			emptyQueue = queue2;
			nonEmptyQueue = queue1;
		}
		
		while(nonEmptyQueue.size() > 1) {
			emptyQueue.add(nonEmptyQueue.remove());
		}
		
		return nonEmptyQueue.remove();
	}
	
	
	public Queue<Integer> queue1 = new Queue<Integer>();
	public Queue<Integer> queue2 = new Queue<Integer>();
}