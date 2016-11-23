public void longestIncreasingSequenceOfPairs(int[] arr, List<List> solutions, int index) {
	if (index > arr.length) {
		return;
	}
	
	List bestSeq = null;
	int curElement = arr[index];
	for(int i=0; i < index; i++) {
		if (arr[i].isBefore(curElement)) {
			bestSeq = Math.max(bestSeq, solutions[i]);
		}
	}
	
	List solution = new ArrayList();
	
	if (bestSeq != null) {
	  	solution.addAll(bestSeq);
	}
	solution.add(curElement);
	
	solutions[index] = solution;
	longestIncreasingSequenceOfPairs(arr, index+1, solutions);
}