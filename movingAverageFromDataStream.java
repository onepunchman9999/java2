//calcuate the moving average of all integers in the sliding window

public class Solution {
	//queue size
	public int size;
	double avg;
	LinkedList<Integer> queue;
	
	public Solution(int size) {
		queue = new LinkedList<Integer>();
		this.size = size;
	}
	
	public double next(int val) {
		if (queue.size() < this.size) {
			queue.offer(val);
			
			int sum = 0;
			for(int i: queue) {
				sum += i;
			}
			
			avg = sum / queue.size();
			return avg;
		} else {
			int head = queue.poll();
			double minus = (double) head / this.size;
			double plus = (double) val / this.size;
			
			queue.offer(val);
			avg = avg + minus - plus;
			return avg;
		}

	}
}