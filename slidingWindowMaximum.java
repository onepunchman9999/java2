public int max(int[] arr, int k) {
	//k needs to come first beforehand to start putting max result for that window to be inserted
	//and after that, every max needs to be inserted into the result by calulating the max of previous two + new one.
	int[] result = new int[arr.length-k +1];
	//the maximum is always the head of the queue
	LinkedList<Integer> dequeue = new LinkedList<Integer>();
	
	for(int i=0; i<arr.length; i++) {
		//make room for a new element only when dequeue is not empty and its top stored index is i-k since k nees to be stored first beforehand so it is always i-k indicating the length of window
		if (!dequeue.isEmpty() && dequeue.peekFirst() == i-k) {
			dequeue.poll();
		}
		
		//head is the max and thus start removing from the end if lesser than curent
		while(!dequeue.isEmpty() && arr[dequeue.peekLast()] < arr[i]) {
			dequeue.removeLast();
		}
		
		//adds to tail
		dequeue.offer(i);
		
		//adds subsequent item to result if i is greater than k
		if (i+1 >= k) {
			result[i+1-k] = nums[dequeue.peek()];
		}
	}
	
	
}

// [4,6,5,3]
//4
//6
//6 5
poll()
//5
//5 3
