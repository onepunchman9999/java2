//if we have an odd number of values, one heap will have an extra, which is a maxHeap
//if maxHeap.size > minHeap.size then the maxHeap.top will be a median value
//If maxHeap.size == minHeap.size then the average of maxHeap.top and minHeap.top will be the median.


public void addNewNumber(int randomNumber) {
	if (maxHeap.size() == minHeap.size()) {
		if (minHeap.peek() != null && randomNumber > minHeap.peek()) {
			//since size is same, make sure mapHeap gets an extra but it needs to be balanced
			//randomNumber is bigger so minHeap should contain
			maxHeap.offer(minHeap.poll());
			minHeap.offer(randomNumber);
		}
	}
}